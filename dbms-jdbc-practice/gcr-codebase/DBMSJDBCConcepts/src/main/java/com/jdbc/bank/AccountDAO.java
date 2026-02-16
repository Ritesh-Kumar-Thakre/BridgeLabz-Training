package com.jdbc.bank;

import java.math.BigDecimal;
import java.sql.*;

public class AccountDAO {

	public boolean transferMoney(int fromId, int toId, BigDecimal amount) {

		Connection conn = null;

		try {
			conn = DatabaseConnection.getConnection();
			conn.setAutoCommit(false); // 🔥 Start Transaction

			// Deduct from sender
			String deductSql = "UPDATE accounts SET account_balance = account_balance - ? WHERE account_id = ?";
			PreparedStatement deductStmt = conn.prepareStatement(deductSql);
			deductStmt.setBigDecimal(1, amount);
			deductStmt.setInt(2, fromId);
			int rows1 = deductStmt.executeUpdate();

			// Add to receiver
			String addSql = "UPDATE accounts SET account_balance = account_balance + ? WHERE account_id = ?";
			PreparedStatement addStmt = conn.prepareStatement(addSql);
			addStmt.setBigDecimal(1, amount);
			addStmt.setInt(2, toId);
			int rows2 = addStmt.executeUpdate();

			// Insert transaction record
			String insertSql = "INSERT INTO transactions (from_account, to_account, amount, txn_type) VALUES (?, ?, ?, ?)";
			PreparedStatement insertStmt = conn.prepareStatement(insertSql);
			insertStmt.setInt(1, fromId);
			insertStmt.setInt(2, toId);
			insertStmt.setBigDecimal(3, amount);
			insertStmt.setString(4, "TRANSFER");
			insertStmt.executeUpdate();

			if (rows1 > 0 && rows2 > 0) {
				conn.commit(); // ✅ Commit
				System.out.println("Transfer Successful!");
				return true;
			} else {
				conn.rollback(); // ❌ Rollback
				System.out.println("Transfer Failed!");
				return false;
			}

		} catch (SQLException e) {
			try {
				if (conn != null)
					conn.rollback();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
			e.printStackTrace();
			return false;

		} finally {
			try {
				if (conn != null) {
					conn.setAutoCommit(true);
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

package com.jdbc.library;

import java.sql.*;

public class BorrowDAO {

	public boolean borrowBook(int studentId, int bookId) {

		Connection conn = null;

		try {
			conn = DatabaseConnection.getConnection();
			conn.setAutoCommit(false); // 🔥 Start transaction

			// Insert borrow record
			String borrowSql = "INSERT INTO borrow_records (student_id, book_id, borrow_date, due_date) "
					+ "VALUES (?, ?, CURDATE(), DATE_ADD(CURDATE(), INTERVAL 14 DAY))";

			PreparedStatement borrowStmt = conn.prepareStatement(borrowSql);
			borrowStmt.setInt(1, studentId);
			borrowStmt.setInt(2, bookId);
			borrowStmt.executeUpdate();

			// Update book availability
			String updateSql = "UPDATE books SET available_copies = available_copies - 1 WHERE book_id = ?";

			PreparedStatement updateStmt = conn.prepareStatement(updateSql);
			updateStmt.setInt(1, bookId);
			int rows = updateStmt.executeUpdate();

			if (rows > 0) {
				conn.commit();
				System.out.println("Book Borrowed Successfully!");
				return true;
			} else {
				conn.rollback();
				System.out.println("Borrow Failed!");
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

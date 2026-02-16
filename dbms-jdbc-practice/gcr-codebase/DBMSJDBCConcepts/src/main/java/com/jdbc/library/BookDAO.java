package com.jdbc.library;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {

	public List<Book> searchByTitleAuthor(String title, String author) {

		List<Book> list = new ArrayList<>();
		String sql = "SELECT * FROM books WHERE title LIKE ? AND author LIKE ?";

		try (Connection conn = DatabaseConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {

			pstmt.setString(1, "%" + title + "%");
			pstmt.setString(2, "%" + author + "%");

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new Book(rs.getInt("book_id"), rs.getString("title"), rs.getString("author"),
						rs.getString("category"), rs.getInt("total_copies"), rs.getInt("available_copies")));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	public List<Book> searchByCategory(String category) {

		List<Book> list = new ArrayList<>();
		String sql = "SELECT * FROM books WHERE category = ? AND available_copies > 0";

		try (Connection conn = DatabaseConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {

			pstmt.setString(1, category);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new Book(rs.getInt("book_id"), rs.getString("title"), rs.getString("author"),
						rs.getString("category"), rs.getInt("total_copies"), rs.getInt("available_copies")));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}
}

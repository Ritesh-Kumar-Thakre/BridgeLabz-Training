package com.jdbc.employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

    // INSERT
    public boolean addEmployee(Employee emp) {
        String sql = "INSERT INTO employeeData VALUES (?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, emp.getId());
            pstmt.setString(2, emp.getName());
            pstmt.setInt(3, emp.getAge());
            pstmt.setDouble(4, emp.getSalary());

            return pstmt.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // SELECT ALL
    public List<Employee> getAllEmployees() {
        List<Employee> list = new ArrayList<>();
        String sql = "SELECT * FROM employeeData";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                list.add(new Employee(
                        rs.getInt("ID"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getDouble("salary")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    // UPDATE SALARY
    public boolean updateSalary(int id, double salary) {
        String sql = "UPDATE employeeData SET salary = ? WHERE ID = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setDouble(1, salary);
            pstmt.setInt(2, id);

            return pstmt.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // DELETE
    public boolean deleteEmployee(int id) {
        String sql = "DELETE FROM employeeData WHERE ID = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            return pstmt.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // SEARCH BY NAME
    public List<Employee> searchByName(String name) {
        List<Employee> list = new ArrayList<>();
        String sql = "SELECT * FROM employeeData WHERE name = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, name);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                list.add(new Employee(
                        rs.getInt("ID"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getDouble("salary")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
}

package com.topics.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnectionTest {

    private static final String QUERY = "SELECT employee_id,firstname,lastname FROM A_EMPLOYEE";

    public static void main(String[] args) {

        try (Connection con = DBConnection.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(QUERY)) {

            while (rs.next()) {
                int id = rs.getInt("employee_id");
                String firstName = rs.getString("firstname");
                String lastName = rs.getString("lastname");
                System.out.println(id + "," + firstName + "," + lastName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

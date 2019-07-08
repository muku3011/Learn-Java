package com.topics.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnectionTest {

    private static final String QUERY = "SELECT COUNT(*) FROM DUAL";

    public static void main(String[] args) {

        try (Connection con = DBConnection.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(QUERY)) {

            while (rs.next()) {
                System.out.println(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

package com.ocp.topics.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcConnection {
	public static void main(String args[]) {
		try {
			// step1 load the driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// step2 create the connection object
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "testdb","testdb");


			// step3 create the statement object
			Statement stmt = con.createStatement();

			// step4 execute query
			ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM TAB");
			while (rs.next()) {
				System.out.println(rs.getInt(1) /*+ "  " + rs.getString(2) + "  "	+ rs.getString(3)*/);
			}
			// step5 close the connection object
			con.close();

		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}

	}
}  

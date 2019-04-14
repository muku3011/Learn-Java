package com.topics.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {

    public static Connection getConnection() {
        Properties props = new Properties();
        FileInputStream fis;
        Connection con = null;
        try {
            fis = new FileInputStream("src/main/resources/jdbc/db.properties");
            props.load(fis);

            // Load the Driver Class
            Class.forName(props.getProperty("DB_DRIVER_CLASS"));

            // Create the connection now
            con = DriverManager.getConnection(props.getProperty("DB_URL"),
                    props.getProperty("DB_USERNAME"),
                    props.getProperty("DB_PASSWORD"));
        } catch (IOException | ClassNotFoundException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return con;
    }

}

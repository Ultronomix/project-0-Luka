package com.revature.project0;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.io.IOException;

public class Project0App {
    public static void main(String[] args) {
        String dbUrl = "jdbc:postgresql://project0.cest4uy9wjqq.us-west-1.rds.amazonaws.com:5432/";
        String dbUsername = "postgres";
        String dbPassword = "revature";

        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
            if (conn != null) {
                System.out.println("Connection Successful");
            }
        } catch (ClassNotFoundException e) {
            System.err.println("Could not find Postgresql jbdc driver, connection attempt aborted.");
        } catch (SQLException e) {
            System.err.println("Could not establish a connection");

        }

    }

}

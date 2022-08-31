//package com.revature.project0;
//
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Connection;
//import java.util.Scanner;
//
//public class Project0App {
//    public static void main(String[] args) {
//        String dbUrl = "jdbc:postgresql://project0.cest4uy9wjqq.us-west-1.rds.amazonaws.com:5432/";
//        String dbUsername = "postgres";
//        String dbPassword = "revature";
//
//        try {
//            Class.forName("org.postgresql.Driver");
//            Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
//            if (conn != null) {
//                System.out.println("Connection Successful");
//            }
//        } catch (ClassNotFoundException e) {
//            System.err.println("Could not find Postgresql jbdc driver, connection attempt aborted.");
//        } catch (SQLException e) {
//            System.err.println("Could not establish a connection");
//
//        }
//        prompt();
//    }
//    public static void prompt() {
//        System.out.println("What would you like to do? (Type number) \n 1. Paycheck \n 2. Bills \n 3. Daily Allowance");
//
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//
//        switch (input) {
//            case 1:
//                System.out.println("Chose Paycheck");
//                // Run method that queries paycheck and throws a new prompt.
//                paycheckPrompt();
//                break;
//            case 2:
//                System.out.println("Chose Bills");
//                // Run method that queries all bills and throws a new prompt.
//                billsPrompt();
//                break;
//            case 3:
//                System.out.println("Chose Daily Allowance");
//                // Run method that queries allowance and throws a new prompt
//                break;
//            default:
//                System.out.println("Invalid");
//                // Start prompt over
//        }
//    }
//    public static void paycheckPrompt() {
//        System.out.println("1. Edit \n2. Back");
//
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//
//        switch (input) {
//            case 1:
//                System.out.println("Chose Edit Paycheck");
//                // Run method that queries paycheck and throws a new prompt.
//                break;
//            case 2:
//                prompt();
//                break;
//            default:
//                System.out.println("Invalid");
//                // Start prompt over
//        }
//    }
//    public static void billsPrompt() {
//        System.out.println("1. Add \n2. Delete \n3. Back");
//
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//
//        switch(input) {
//            case 1:
//                System.out.println("Chose Add");
//                //Run Query method that adds bill
//                break;
//            case 2:
//                System.out.println("Chose Edit");
//                //Run Query method that edits bill
//                break;
//            case 3:
//                prompt();
//                break;
//            default:
//                System.out.println("Invalid entry");
//        }
//    }
//    public static void allowancePrompt() {
//        System.out.println("1. Back");
//
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//
//        switch (input) {
//            case 1:
//                prompt();
//                // Run method that queries allowance and prints it
//                break;
//            default:
//                System.out.println("Invalid");
//                // Start prompt over
//        }
//    }
//}
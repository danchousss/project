package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        MyFirst();

    }public static void MyFirst(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String jdbcUrl = "jdbc:mysql://sql6.freesqldatabase.com:3306/sql6703026";
            String username = "sql6703026";
            String password = "cENgfTLSLn";
            Connection cntn = DriverManager.getConnection(jdbcUrl, username, password);

//            cntn.createStatement("");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
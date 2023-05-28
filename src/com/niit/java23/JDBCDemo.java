package com.niit.java23;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");//load driver
            //ket noi den postgresql server
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres?user=postgres&password=0967269587");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.niit.java23;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");//load driver
            //ket noi den postgresql server
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres?user=postgres&password=0967269587");


            //thuc thi cau lenh sql
            // thuc thi cau lenh insert
            Statement stm = conn.createStatement();
            stm.executeUpdate("INSERT INTO users(email,pwd,salary) values ('mn@gmail.com','1234',1000)");
            //cap nhat du lieu
            ResultSet rs = stm.executeQuery("SELECT * from users ");
            while (rs.next()) {
                String email = rs.getString("email");
                Double salary = rs.getDouble("salary");
                System.out.println(email);
                System.out.println(salary);

            } ;
            //lay du lieu
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.niit.java23;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();//load driver
            //ket noi den postgresql server
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaweb_23","root","0967269587");


            //thuc thi cau lenh sql
/*            Statement stm = conn.createStatement();
            // thuc thi cau lenh insert
            stm.executeUpdate("INSERT INTO users(email,pwd,salary) values ('mn@gmail.com','1234',1000)");
            //lay du lieu tu bang
            ResultSet rs = stm.executeQuery("SELECT * from users ");
            //show data
            while (rs.next()) {
                String email = rs.getString("email");
                Double salary = rs.getDouble("salary");
                System.out.println(email);
                System.out.println(salary);

            } ;
            */


            /**Statement stm=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs= stm.executeQuery("SELECT * from users");
            //rs.relative(3);
           /* rs.absolute(1);
            rs.updateString("email","bumblebee@gmail.com");
            rs.updateRow();*/
            //chen them ban ghi vao
            //rs.moveToInsertRow();
            //rs.updateString("email","b@gmail.com");
            //rs.updateInt("pwd",234);
            //rs.updateFloat("salary", 1000);
            //rs.insertRow();
            /*do {
                String email = rs.getString("email");
                Double salary = rs.getDouble("salary");
                System.out.println(email);
                System.out.println(salary);

            }while (rs.next()) ;*/
//            rs.absolute(1);
//            rs.deleteRow();
            /*Statement stm = conn.createStatement();
            String mail="phobo@gmail.com";
            Integer pwd= 123456;
            float salary = 2000;
            //stm.executeUpdate("INSERT INTO users(email,pwd,salary) values ('mn@gmail.com','1234',1000)");
            PreparedStatement pstm= conn.prepareStatement("insert into users(email,pwd,salary) values (?,?,?)");
            pstm.setString(1,mail);
            pstm.setInt(2,pwd);
            pstm.setFloat(3,salary);
            pstm.execute();
            pstm.setString(1,"bun@gmail.com");
            pstm.setInt(2,212121212);
            pstm.setFloat(3,65656565);
            pstm.execute();*/
            CallableStatement callableStatement=conn.prepareCall("call getuser");
            ResultSet rs =callableStatement.executeQuery();
            while (rs.next()){

                String email= rs.getString("email");
                float salary=rs.getFloat("salary");
                System.out.println(email);
                System.out.println(salary);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

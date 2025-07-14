package com;

import java.sql.*;

public class JdbcConnection {
    public static void main(String[] args) {


        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("driver laoded....");

            String url = "jdbc:mysql://localhost:3306/01may_java";
            String username="root";
            String password="root";


            Connection cn =  DriverManager.getConnection(url,username,password);
            System.out.println("connection established...");


            Statement st = cn.createStatement();

            ResultSet rs =  st.executeQuery("select * from emp");

            while(rs.next())
            {
                int id = rs.getInt("id");
                String name = rs.getString(2);
                String email = rs.getString(3);
                String phone = rs.getString(4);
                double sal = rs.getDouble(5);
                String dept = rs.getString(6);


                System.out.println(id+" "+name+" "+email+" "+phone+" "+sal+" "+dept);
            }



        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }


    }
}

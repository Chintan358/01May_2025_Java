package com;

import java.sql.*;
import java.util.Scanner;

public class AddEmp {
    public static void main(String[] args) {

        Scanner sc  =new Scanner(System.in);
        System.out.println("enter name : ");
        String name = sc.next();
        System.out.println("enter email : ");
        String email = sc.next();
        System.out.println("enter phone : ");
        String phone = sc.next();
        System.out.println("enter salary : ");
        double sal = sc.nextDouble();
        System.out.println("enter dept : ");
        String dept = sc.next();



        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cn  =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/01may_java","root","root");

//            Statement st = cn.createStatement();
//            int i = st.executeUpdate("insert into emp values(0,'"+name+"','"+email+"','"+phone+"',"+sal+",'"+dept+"')");

            PreparedStatement ps = cn.prepareStatement("insert into emp values(?,?,?,?,?,?)");
            ps.setInt(1,0);
            ps.setString(2,name);
            ps.setString(3,email);
            ps.setString(4,phone);
            ps.setDouble(5,sal);
            ps.setString(6,dept);

            int i = ps.executeUpdate();

            if(i>0)
            {
                System.out.println("Data inserted !!!");
            }


        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }


    }
}

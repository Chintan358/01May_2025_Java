package com;

import java.sql.*;
import java.util.Scanner;

public class UpdateEmp {
    public static void main(String[] args) {

        Scanner sc  =new Scanner(System.in);
        System.out.println("enter id : ");
        int id = sc.nextInt();
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
//            int i = st.executeUpdate("update emp set name='"+name+"',email='"+email+"',phone='"+phone+"',sal="+sal+",dept='"+dept+"' where id="+id+"");

            PreparedStatement ps = cn.prepareStatement("update emp set name=?,email=?,phone=?,sal=?,dept=?where id=?");
            ps.setInt(6,id);
            ps.setString(1,name);
            ps.setString(2,email);
            ps.setString(3,phone);
            ps.setDouble(4,sal);
            ps.setString(5,dept);

            int i = ps.executeUpdate();


            if(i>0)
            {
                System.out.println("Data updated !!!");
            }


        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }


    }
}

package com;

import java.sql.*;
import java.util.Scanner;

public class DeleteEmp {
    public static void main(String[] args) {

        Scanner sc  =new Scanner(System.in);
        System.out.println("enter id : ");
        int id = sc.nextInt();


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cn  =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/01may_java","root","root");

//            Statement st = cn.createStatement();
//            int i = st.executeUpdate("delete from emp where id="+id+"");

            PreparedStatement ps = cn.prepareStatement("delete from emp where id=?");
            ps.setInt(1,id);


            int i = ps.executeUpdate();

            if(i>0)
            {
                System.out.println("Data deleted !!!");
            }


        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }


    }
}

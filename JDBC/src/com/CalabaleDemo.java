package com;

import java.sql.*;

public class CalabaleDemo {

    public static void main(String[] args) {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/01may_java","root","root");

            CallableStatement st = cn.prepareCall("{call allemp()}");
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2));
            }


        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }


    }
}

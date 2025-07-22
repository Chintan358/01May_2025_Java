package com;

import java.sql.*;

public class MetaDataDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cn  = DriverManager.getConnection("jdbc:mysql://localhost:3306/01may_java","root","root");

            DatabaseMetaData dmeta = cn.getMetaData();
            System.out.println(dmeta.getDatabaseProductVersion());
            System.out.println(dmeta.getDatabaseProductName());

            Statement st  =cn.createStatement();
            ResultSet rs = st.executeQuery("select * from emp");
            ResultSetMetaData data = rs.getMetaData();

            System.out.println(data.getColumnCount());
            System.out.println(data.getColumnLabel(1));

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }


    }
}

package library;

import java.sql.*;
import java.util.Scanner;

public class LibraryOpration {

    Connection cn=null;
    LibraryOpration()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/01may_java","root","root");
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    Scanner sc = new Scanner(System.in);
    public void addBook()
    {
        System.out.println("Enter book name : ");
        String name = sc.next();
        System.out.println("Enter Qty : ");
        int qty = sc.nextInt();

        try {

            PreparedStatement ps1 = cn.prepareStatement("select * from `library` where name=?");
            ps1.setString(1,name);
            ResultSet rs  =ps1.executeQuery();
            if(rs.next())
            {
                System.out.println("Book already exist !!!!");
            }
            else {
                String qry = "insert into library values(?,?,?)";
                PreparedStatement ps = cn.prepareStatement(qry);

                   ps.setInt(1, 0);
                ps.setString(2, name);
                ps.setInt(3, qty);

                int i = ps.executeUpdate();
                if (i > 0) {
                    System.out.println("Book inserted !!!");
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void viewBook()
    {
        try {
            PreparedStatement ps = cn.prepareStatement("select * from library");
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteBook()
    {
        System.out.println("enter book name : ");
        String name = sc.next();

        try {
            PreparedStatement ps =
                    cn.prepareStatement("delete from library where name=?");
            ps.setString(1,name);
            int i=ps.executeUpdate();
            if(i>0)
            {
                System.out.println("Book deleted");
            }
            else {
                System.out.println("Book not found");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Book not found");
        }

    }

    public void issueBook()
    {
        System.out.println("enter book name : ");
        String name = sc.next();
        try {
            PreparedStatement ps = cn.prepareStatement("select * from library where name=?");
            ps.setString(1,name);
            ResultSet rs = ps.executeQuery();

            if(rs.next())
            {
                int qty  = rs.getInt("qty");
                if(qty>0)
                {
                        qty--;
                        PreparedStatement ps1 =
                                cn.prepareStatement("update library set qty=? where name=?");
                        ps1.setInt(1,qty);
                        ps1.setString(2,name);

                        int i = ps1.executeUpdate();
                        if(i>0)
                        {
                            System.out.println("Book isssued !!!!");
                        }

                }
                else {
                    System.out.println("Book not available at the moment !!!");
                }
            }
            else {
                System.out.println("Book not found");
            }


        } catch (SQLException e) {
            System.out.println("Book not found");
        }

    }

}

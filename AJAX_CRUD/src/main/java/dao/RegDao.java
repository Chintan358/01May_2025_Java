package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Reg;



public class RegDao 
{
	Connection cn=null;
	public RegDao() 
	{
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/01may_java","root","root");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public int addreg(Reg r1)
	{
		
		int i=0;
		try {
			
		PreparedStatement ps=cn.prepareStatement("insert into reg(uname,email,pass) values(?,?,?)");
		ps.setString(1, r1.getUname());
		ps.setString(2, r1.getEmail());
		ps.setString(3, r1.getPassword());
		
		 i=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
		
	}


	public List<Reg> viewAllData() {
		
		List<Reg> all = new ArrayList();
		try {
			PreparedStatement ps = 
					cn.prepareStatement("select * from reg");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				Reg r = new Reg();
				r.setId(rs.getInt(1));
				r.setUname(rs.getString(2));
				r.setEmail(rs.getString(3));
				r.setPassword(rs.getString(4));
				
				all.add(r);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return all;
	}

}

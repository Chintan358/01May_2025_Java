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


	public Reg userById(int uid) {
		
		Reg reg = new Reg();
		try {
			PreparedStatement ps = 
					cn.prepareStatement("select * from reg where id=?");
			ps.setInt(1, uid);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				reg.setId(rs.getInt(1));
				reg.setUname(rs.getString(2));
				reg.setEmail(rs.getString(3));
				reg.setPassword(rs.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return reg;
	}


	public int deleteUser(int uid) {
		int i=0;
		try {
			PreparedStatement ps = 
					cn.prepareStatement("delete from reg where id=?");
			ps.setInt(1, uid);
			
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
	}


	public int updatereg(Reg r1) {
		int i=0;
		try {
			
		PreparedStatement ps=cn.prepareStatement("update reg set uname=?,email=?,pass=? where id=?");
		ps.setString(1, r1.getUname());
		ps.setString(2, r1.getEmail());
		ps.setString(3, r1.getPassword());
		ps.setInt(4, r1.getId());
		
		 i=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
	}


	public List<Reg> searchData(String val) {
		List<Reg> all = new ArrayList();
		try {
			PreparedStatement ps = 
					cn.prepareStatement("select * from reg where uname like ?");
			ps.setString(1, val+"%");
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

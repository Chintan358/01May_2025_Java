package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Emp;

public class StudentDao {
		
	Connection cn = null;
	public StudentDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/01may_java","root","root");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public int addEmp(Emp e)
	{
		int i=0;
		try {
			PreparedStatement ps =
					cn.prepareStatement("insert into emp values(?,?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, e.getName());
			ps.setString(3, e.getEmail());
			ps.setString(4, e.getPhone());
			
			i  =ps.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return i;
	}
	
	public ArrayList<Emp> allEmps()
	{
		ArrayList<Emp> al = new ArrayList();
		try {
			PreparedStatement ps = 
					cn.prepareStatement("select * from emp");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				Emp e = new Emp();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setEmail(rs.getString(3));
				e.setPhone(rs.getString(4));
				al.add(e);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return al;
	}
	
	public Emp empById(int id)
	{
		Emp e = new Emp();
		try {
			PreparedStatement ps = 
					cn.prepareStatement("select * from emp where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setEmail(rs.getString(3));
				e.setPhone(rs.getString(4));
				
			}
		} catch (SQLException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		return e;
	}
	
	public int deleteEmp(int id)
	{
		int i=0;
		try {
			PreparedStatement ps = 
					cn.prepareStatement("delete from emp where id=?");
			ps.setInt(1, id);
			
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
	}
	
	public int updateEmp(Emp e)
	{
		int i=0;
		try {
			PreparedStatement ps = 
					cn.prepareStatement("update emp set name=?,email=?,phone=? where id=?");
			ps.setString(1, e.getName());
			ps.setString(2, e.getEmail());
			ps.setString(3, e.getPhone());
			ps.setInt(4, e.getId());
			
			i = ps.executeUpdate();
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return i;
	}
	
}

package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Student;

public class StudentDao {

	Connection cn=null;
	public StudentDao() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = 
					DriverManager.getConnection("jdbc:mysql://localhost:3306/01may_java","root","root");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public int addStudent(Student st)
	{
		int i =0;
		try {
			PreparedStatement ps =
					cn.prepareStatement("insert into student values(?,?,?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, st.getName());
			ps.setString(3, st.getEmail());
			ps.setString(4, st.getPhone());
			ps.setString(5, st.getPassword());
			
			 i = ps.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
	}
	
	public ArrayList<Student> displayStudents()
	{
		ArrayList<Student> students = new ArrayList<Student>();
		try {
			PreparedStatement ps =
					cn.prepareStatement("select * from student");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				Student st  = new Student();
				st.setId(rs.getInt(1));
				st.setName(rs.getString(2));
				st.setEmail(rs.getString(3));
				st.setPhone(rs.getString(4));
				st.setPassword(rs.getString(5));
				
				students.add(st);
			}
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return students;
	}



	public int deleteStudent(int id) {
		int i=0;
		try {
			PreparedStatement ps = 
					cn.prepareStatement("delete from student where id=?");
			ps.setInt(1, id);
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return i;
	}



	public Student StudentById(int id) {
		
		Student st = new Student();
		try {
			PreparedStatement ps =
					cn.prepareStatement("select * from student where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				st.setId(rs.getInt(1));
				st.setName(rs.getString(2));
				st.setEmail(rs.getString(3));
				st.setPhone(rs.getString(4));
				st.setPassword(rs.getString(5));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return st;
	}



	public int updateStudent(Student st) {
		int i=0;
		try {
			PreparedStatement ps =
					cn.prepareStatement("update student set name=?,email=?,phone=?,password=? where id=?");
	
			ps.setString(1, st.getName());
			ps.setString(2, st.getEmail());
			ps.setString(3, st.getPhone());
			ps.setString(4, st.getPassword());
			ps.setInt(5, st.getId());
			
			i = ps.executeUpdate();
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	
	
	
}

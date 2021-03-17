import java.lang.*;
import java.util.*;
import java.io.*;
import java.sql.*;



class helloworld{
	public static void main(String[] args) throws Exception{
	
		StudentDAO dao=new StudentDAO();
		Student s1=dao.getStudent(11);
		System.out.println(s1.name);
		
	}
}
class StudentDAO{
	public Student getStudent(int rollno) {
		try {
			String query="select name from studentdetails where rollno="+rollno;
			Student s=new Student();
			s.rollno=rollno;
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			rs.next();
			String name=rs.getString(1);
			s.name=name;
			return s;
			
		}catch(Exception ex) {
			System.out.println(ex);
		}
		Student s=new Student();
		return s;
	}
}
class Student{
	int rollno;
	String name;
}
import java.lang.*;
import java.util.*;
import java.io.*;
import java.sql.*;

//1.import --> java.sql.*;
//2.load and register the driver -->com.mysql.jdbc.Driver
//3.create connection --> connection
//4.create a statement -->statement
//5. execute the query 
//6. process the results
//7. close

class helloworld{
	public static void main(String[] args) throws Exception{
		String url="jdbc:mysql://localhost:3306/onlinelib";
		String uname="root";
		String pass="";
		String query="select book_name from add_books where bookcatg_name='cold' ";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next()) {
			String name=rs.getString("book_name");
			
			System.out.println(name);
		}
		
		
		st.close();
		con.close();
		
	}
}

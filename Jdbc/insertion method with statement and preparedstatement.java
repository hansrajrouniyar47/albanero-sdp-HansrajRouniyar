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
		int book_id=198;
		String book_name="Namaste";
		String bookcatg_name="Oracle";
		int section_id=1231;
		String section_name="AIR";
		String section_location="Ktm";
		int qty=100;
		
//		The below is a insertion method for prepared statement which is used
//		when you have a number of parameters in queries to update
//		but in case you have litte amount of values to update in table 
//		you can use statement directly rather than update statement
//		
		
		String query="insert into add_books values(?,?,?,?,?,?,?)";
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		PreparedStatement st=con.prepareStatement(query);
		st.setInt(1,book_id);
		st.setString(2,book_name);
		st.setString(3, bookcatg_name);
		st.setInt(4,section_id);
		st.setString(5, section_name);
		st.setString(6, section_location);
		st.setInt(7, qty);
		st.executeUpdate();
		
		
		
		
		st.close();
		con.close();
		
		
	}
}

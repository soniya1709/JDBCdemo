import java.sql.*;
public class JdbcDemo {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	String url="jdbc:mysql://localhost:3306/myfirstdatabase";
	String username="root";
	String password="Zqaws123!";
	String query="select * from student";
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection(url,username,password);
	Statement st=con.createStatement(); 
	ResultSet rs=st.executeQuery(query);
	String userdata="";
	while(rs.next()) {
		userdata=rs.getInt(1) + " : " +rs.getString("sname") + " : " +rs.getString("saddress");
		System.out.println(userdata);
	}
	st.close();
	con.close();
}
}

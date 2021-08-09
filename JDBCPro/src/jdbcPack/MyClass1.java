package jdbcPack;
import java.sql.*;
import java.util.concurrent.ConcurrentSkipListMap;

public class MyClass1 
{

	public static void main(String[] args) throws Exception
	{
		String url="jdbc:mysql://localhost:3306/world";
		String uname="root";
		String pw="sriveni123";
		String query="Select * from city LIMIT 0,50";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url, uname, pw);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		String userData;
		while(rs.next())
		{
		
			userData=rs.getInt(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getString(4)+":"+rs.getInt(5);
			System.out.println(userData);
			
					
		}
		st.close();
		con.close();
		

	}

}

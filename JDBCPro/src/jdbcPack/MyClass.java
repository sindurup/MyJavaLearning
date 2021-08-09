package jdbcPack;
import java.sql.*;

public class MyClass
{

	public static void main(String[] args) throws SQLException 
	{
		String url="jdbc:mysql://localhost:3306/world";
		String name="root";
		String pw="sriveni123";
		String query="Select Name from city where ID=3";
		Statement st = null;
		Connection con = null;
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		 con=DriverManager.getConnection(url, name, pw);
		 st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		String cname=rs.getString("Name");
		
		System.out.println("hello:"+cname);
		}
		catch (Exception ex)
		{
			
		}
		
		finally
		{
			
			st.close();
			con.close();
			
		}
	}

}

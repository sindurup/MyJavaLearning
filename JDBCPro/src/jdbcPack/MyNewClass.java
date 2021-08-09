package jdbcPack;
import java.sql.*;

public class MyNewClass 
{

	public static void main(String[] args) throws SQLException, ClassNotFoundException 
	{
		String url="jdbc:mysql://localhost:3306/world";
		String name="root";
		String pw="sriveni123";
		String query="select name from city";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url, name, pw);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next())
		{
			String cname=rs.getString("Name");
			System.out.println(cname);
		}
		st.close();
		con.close();
		
		
	}

}

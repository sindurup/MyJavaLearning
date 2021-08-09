package jdbcPack;
import java.sql.*;

public class PreParedStatmentClass
{

	public static void main(String[] args) throws Exception 
	{
		String url="jdbc:mysql://localhost:3306/world";
		String uname="root";
		String pw="sriveni123";
		int id=4082;
		String name="Oman";
		String countryCode="AFG";
		String district="Muscat";
		int population=45678923;
		
		String query="Insert into city values(?,?,?,?,?)";
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pw);
		PreparedStatement st=con.prepareStatement(query);
		st.setInt(1, id);
		st.setString(2, name);
		st.setString(3, countryCode);
		st.setString(4, district);
		st.setInt(5, population);
		
		int count=st.executeUpdate();
		
		System.out.println(count+" row/s affected");
		
		
		
	}

}

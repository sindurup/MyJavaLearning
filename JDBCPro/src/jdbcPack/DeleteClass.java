package jdbcPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteClass {

	public static void main(String[] args) throws Exception
	{
		String url="jdbc:mysql://localhost:3306/world";
		String uname="root";
		String pw="sriveni123";
		int id=4082;
		//int population=7654238;
		String query="delete from city where ID=?";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con=DriverManager.getConnection(url, uname, pw);
	    PreparedStatement st=con.prepareStatement(query);
	    st.setInt(1, id);
	   
	    int count=st.executeUpdate();
	    
	    System.out.println(count+ "rows afffected");
		st.close();
		con.close();
	}

}

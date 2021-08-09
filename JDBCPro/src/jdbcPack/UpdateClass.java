package jdbcPack;
import java.sql.*;

public class UpdateClass {

	public static void main(String[] args) throws Exception
	{
		String url="jdbc:mysql://localhost:3306/world";
		String uname="root";
		String pw="sriveni123";
		int id=4082;
		int population=7654238;
		String query="Update city set Population=? where ID=?";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con=DriverManager.getConnection(url, uname, pw);
	    PreparedStatement st=con.prepareStatement(query);
	    st.setInt(1, population);
	    st.setInt(2, id);
	    int count=st.executeUpdate();
	    
	    System.out.println(count+ "rows afffected");
	    st.close();
	    con.close();
		
	}

}

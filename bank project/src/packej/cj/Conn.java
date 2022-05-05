package packej.cj;



import   java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conn {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		  Connection con = DriverManager.getConnection("jdbc:mysql:///test", "root","");
		  PreparedStatement ps= con.prepareStatement("SELECT * FROM USER");
		  
		  ResultSet rs= ps.executeQuery();
		  
		  while(rs.next())
		  {
			  System.out.println(rs.getInt(1)+ "  "+rs.getString(2));
		  }
		  
			  
	}

}


 

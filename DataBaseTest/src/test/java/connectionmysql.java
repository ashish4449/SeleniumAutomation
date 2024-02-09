import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class connectionmysql {
	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://"+ "localhost"+":"+"3306"+"/mydb", "root", "admin");
		
		Statement c=con.createStatement();
		ResultSet se=c.executeQuery("select * from EmployeeInfo");	
		
		while(se.next()) {
		
		System.out.println(se.getString("location") +"  " +se.getInt("id"));
		}
	}
}

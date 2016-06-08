package hp.nfvd.pojo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	
	private final String JDBC_DRIVER = "com.mysql.jdbc.Driver" ;
	private static final String username="root";
	private static final String password = "mysql";
	private static final String url="http://localhost:3305/MySQL57";
	static Connection conn = null;
	
	
	public static Connection getInstance(){
		if(conn==null){
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection(url, username, password);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
	
	
	
}

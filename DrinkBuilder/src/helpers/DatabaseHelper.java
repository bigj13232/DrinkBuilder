package helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.healthmarketscience.sqlbuilder.InsertQuery;

//import 

public class DatabaseHelper {
	
	private String dbms;
	private String dbName;

	public void addDrink()
	{
		
	}
	/**
	 * Returns database connection.
	 * @return
	 * @throws SQLException
	 */
	public Connection getConnection() throws SQLException {

	    Connection conn = null;
	    Properties connectionProps = new Properties();
	    //connectionProps.put("user", this.userName);
	    //connectionProps.put("password", this.password);

	    conn = DriverManager.getConnection("jdbc:" + this.dbms + ":" + this.dbName + ";create=true", connectionProps);
	
	    System.out.println("Connected to database");
	    return conn;
	}
	
	public void insertDrink()
	{
		
	}
	
	public void closeConnection(Connection conn) throws SQLException
	{
		conn.close();
	}
}
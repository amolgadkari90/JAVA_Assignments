package com.luman.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		
		// This is path of driver class in mysqul-connector-jar
		String path = "com.mysql.cj.jdbc.Driver";

/*
* This loads the MySQL JDBC Driver class into memory. 
* If the class exists in the classpath, 
* it gets loaded successfully. 
* If the class is not found, it throws a ClassNotFoundException
*/
		Class.forName(path); // Load Driver class
		System. out.println (1) ;
		
		
/*
* url format 
* jdbc:mysql:// → Specifies that this is a JDBC (Java Database Connectivity) connection for MySQL.
* 
* localhost → Refers to the database server running on the same machine (your local system). 
* If the MySQL server is on another system, you replace localhost with its IP address (e.g., 192.168.1.100).
* 
* :3306 → The port number where MySQL is listening.
* The default port for MySQL is 3306, but it may differ if manually changed in MySQL settings.
* 
* batch1214db → The database name we want to connect to. 
* This database must already exist in MySQL.
*/
		String url = "jdbc:mysql://localhost:3306/batch1214db";
		String uname = "root";
		String pwd = "root";
		
/*
* DriverManager.getConnection(...)
* This method is used to create a connection to a database. It requires the
* database URL, username, and password. Parameters:
* 
* url → The JDBC URL (e.g., "jdbc:mysql://localhost:3306/batch1214db"). 
* uname → * The MySQL username (e.g., "root"). 
* pwd → The MySQL password (e.g., "yourpassword").
*/
		Connection conn = DriverManager.getConnection(url, uname, pwd) ;
		System. out.println (2) ;
		System.out.println("Database connection is successful!!!");
		TestJDBC.infoSeparator();
		
/*
* conn.createStatement() → This method creates a Statement object, which is
* used to execute SQL queries. 
* Statement st → The variable st holds the reference to the created 
* Statement object.
* Usage: Once the Statement object is created, we can use it to run 
* SQL queries like SELECT, INSERT, UPDATE, or DELETE.
*/
		Statement st = conn. createStatement () ;
		System. out.println(3);
/*
 * st.executeQuery(sql) -> Executes the given SQL SELECT query.
 * Returns a ResultSet object containing the data from the database.
 * ResultSet rs -> The rs object holds the result of the query.
 * We can iterate over rs to access each row of the result.	
 */	
	
		String sql = "SELECT * FROM batch1214db.player;";
		ResultSet rs = st.executeQuery (sql);
		System. out.println(4);
		
		while (rs.next () ) 
		{
			int jsn = rs.getInt ("jno");
			String pname = rs.getString("name");
			int r = rs.getInt ("runs");
			int w = rs.getInt ("wickets");
			String tname = rs.getString("team_name");
			System. out.println (jsn+ "--- >"+pname);
		}
		TestJDBC.infoSeparator();
				
		sql = "SELECT * FROM batch1214db.employee;";
		rs = st.executeQuery (sql);
		
		System. out.println ("|E_ID\t|"+"E_name\t|"+"M_ID\t|");
		System. out.println ("-------------------------");
		while (rs.next () ) 
		{
			int E_ID = rs.getInt("e_id");
			String E_name = rs.getString("name");
			int M_ID = rs.getInt ("m_id");
			System. out.println ("|"+E_ID+ "\t|"+E_name+ "\t|"+M_ID+ "\t|");
		}
		TestJDBC.infoSeparator();
		
	
		
	}
	
	//Info separator
	static void infoSeparator()
	{
		for (int i = 0; i < 10; i++)
			System.out.print("***");
			System.out.println();
	}
	

}

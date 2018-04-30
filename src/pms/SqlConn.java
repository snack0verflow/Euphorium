package pms;

import java.sql.*;
public class SqlConn
{
	Connection con=null;
	public static Connection dbCon()
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/euphorium?useSSL=false&"+"user=root&password=080910");
			//JOptionPane.showMessageDialog(null, "connected");
			return con;
		}
		catch(Exception e) {e.printStackTrace();
		return null;}
	}
}
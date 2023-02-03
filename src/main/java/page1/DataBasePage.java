package page1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.SQLException;
import java.sql.Statement;

//import com.mysql.cj.xdevapi.Statement;

public class DataBasePage   {

	Connection connection;
	//java.sql.Statement statment;
    Statement statement;
	ResultSet resultset;
	String columnValue;
	
	public String getDataFromDb(String columnName) 
	{
		//setting properties for mySQL
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
				
		String sqlUsername="root";
		String sqlPassword="root";
		//String sqlUrl="jdbc:mysql://127.0.0.1:3306/techfioslogindata";
		String sqlUrl="jdbc:mysql://localhost:3306/techfioslogindata";
		
		String sqlQuery="Select * from users;";
		
		//create connection to the local database
		connection= DriverManager.getConnection(sqlUrl, sqlUsername, sqlPassword);
		
		//empowering connection reference variable to execute queries
	     statement = connection.createStatement(); 
		
		//delivering query
		resultset=statement.executeQuery(sqlQuery);
		
		 while(resultset.next())
		 {
			 columnValue=resultset.getNString(columnName);
			 return columnValue;
		 }
		}catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		finally {
			
			if(connection != null)
			{			
					try {
						connection.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
			}
			if(resultset != null)
			{
				try {
					resultset.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return columnValue;
	}
	
}

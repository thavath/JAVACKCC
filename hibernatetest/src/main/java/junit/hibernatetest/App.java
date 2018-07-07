package junit.hibernatetest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
 
    		
    public static void main( String[] args )
    { 
		 
    	String url = "jdbc:mysql://localhost:3306/hibernate?useSSL=false";
    	String user = "root";
    	String password = ""; 
    	try {

			System.out.println("Connection to database name hibernate" + url);
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("Connection Successfully connected.........");			
			
    	} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Connection fail please try again............");
		}
    }
}

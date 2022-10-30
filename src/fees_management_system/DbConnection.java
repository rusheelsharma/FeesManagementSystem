package fees_management_system;


import java.sql.Connection;
import java.sql.DriverManager;



public abstract class DbConnection {
    Connection con = null;
    
    public static Connection ConnectionDB(){
        
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:LoginRegisterDB.db");
            System.out.println("Connection successful");
            return con; 
        }
        catch(Exception e){
            System.out.println("Connection Failed" + e);
            return null; 
        }
            
    }
    
}

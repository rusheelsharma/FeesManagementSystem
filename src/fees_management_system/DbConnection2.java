/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fees_management_system;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public abstract class DbConnection2 {
    
    Connection con = null;
    
    public static Connection ConnectionDB(){
        
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:addEditClientDB.db");
            System.out.println("Connection successful");
            return con; 
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println("Connection Failed" + e);
            return null; 
        }
            
    }
}

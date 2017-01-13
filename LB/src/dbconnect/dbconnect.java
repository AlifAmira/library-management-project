/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tisha
 */
package dbconnect;
import java.sql.*;
public class dbconnect {
    
}
class Successful{
    public static void main(String[] args)  {
    try{
	    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String accessFileName = "E:/addMember11";
            String connURL = "jdbc:odbc:DRIVER={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + accessFileName + ".accdb;";
            Connection con = DriverManager.getConnection(connURL, "", "");
            Statement stmt = con.createStatement();
           

            
            
	    stmt.close();            
            con.close();
        } 
	catch (Exception err) {
            System.out.println("ERROR: " + err);
        }
    }
        
}
    

 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;


/**
 *
 * @author roixy
 */
public class databaseCon {
    Connection con;
    public Statement s; 
    public  databaseCon(){
         try{
        String url="jdbc:mysql://localhost:3306/UniManSys";
        String user="root";
        String password="3315@26Rix";
         con=DriverManager.getConnection(url, user, password);
        //System.out.println("Connected");
        s=con.createStatement();
        
        //con.close();
    }catch(Exception e){
        System.out.println("Error"+ e.getMessage());
    }
        
    
}
 
    
    

   
   
       
    
public static void main(String args []) {
   
new databaseCon();
        
      
}

    public PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

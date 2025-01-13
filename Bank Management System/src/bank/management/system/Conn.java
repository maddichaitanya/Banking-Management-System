//JDBC Connceting
package bank.management.system;

import java.sql.*;

public class Conn {
    //1.Creat Connection
   public  Connection c;
   public       Statement s;
    public Conn(){
    
        try{
             //Class.forName(com.mysql.cj.jdbc.Driver); 
             c= DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","chiku");//Database connection
             s=c.createStatement();
             
             
        } catch (Exception e){
            System.out.println(e);
        }
}
    
    
    
    
}

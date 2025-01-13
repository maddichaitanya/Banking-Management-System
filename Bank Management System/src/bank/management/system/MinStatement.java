
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;


public class MinStatement extends JFrame {
    
    public String pinnumber; 
    MinStatement(String pinumber){
       this.pinnumber=pinnumber;
      setLayout(null);
      
        setTitle("MiniStatement");
        
        JLabel text=new JLabel();
        add(text);
        
        JLabel bank=new JLabel("Indian Bank");
        bank.setBounds(180, 30, 100, 20);
        add(bank);
        
        JLabel card=new JLabel();
        bank.setBounds(150, 30, 100, 20);
        add(card);
        
        JLabel mini=new JLabel();
        mini.setBounds(250, 30, 100, 20);
        add(mini);
        try{
            Conn conn=new Conn();
            ResultSet rs= conn.s.executeQuery("select * from login where pin= '"+pinnumber+"'");
            while(rs.next()){
                card.setText("Card Number "+ rs.getString("cardnumber").substring(0,4)+"XXXXXXXX".substring(12)); 
                
            }
            
        }catch (Exception e){
            System.out.println(e);
        }
        
        try{
            Conn conn=new Conn();
            ResultSet rs= conn.s.executeQuery("select * from login where pin= '"+pinnumber+"'");
            while(rs.next()){
                mini.setText(mini.getText() +"<html>"+rs.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" +rs.getString("amount")); 
                
            }
            
        }catch (Exception e){
            System.out.println(e);
        }
        
        
      setSize(400,600);
      setLocation(300,0);
      //setUndecorated(true);
      setVisible(true);
    }
    public static void main(String args[]){
        
        new MinStatement("");
    }
}


package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*; //JFrame


 


public class BalanceEnquiry extends JFrame implements ActionListener{
    
    JButton back;
    public String pinnumber;
   // int balance =0;
    BalanceEnquiry(String pinnumber){
       this.pinnumber=pinnumber; 
     setLayout(null);
     
     
     ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
     Image i2=i1.getImage().getScaledInstance(800,800, Image.SCALE_DEFAULT);   
     ImageIcon i3=new ImageIcon(i2);
     JLabel image =new JLabel(i3);
     image.setBounds(0,0,800,800);
     add(image);
     
     JLabel bal =new JLabel(" Balance Enquiry ");
     bal.setBounds(220, 260, 700, 35);
     bal.setForeground(Color.WHITE);
     bal.setFont(new Font("System",Font.BOLD,16));
     image.add(bal);
     
     
     back =new JButton("Back");
     back.setBounds(320, 460, 130, 25);
     back.addActionListener(this);
     image.add(back);
     Conn c=new Conn();
     int balance =0;
         try{
                ResultSet rs=c.s.executeQuery("select * from bank where pin ='"+pinnumber+"'");
                
                // to check the balance of client
                //int balance =0;
                while (rs.next()) {
                if (rs.getString("type").equals("deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
    }catch (Exception e){
            System.out.println(e);
    } 
       
    JLabel text =new JLabel(" Your Current Account Balance is ");
     text.setBounds(150, 300, 700, 35);
     text.setForeground(Color.WHITE);
     text.setFont(new Font("System",Font.BOLD,16));
     image.add(text);
    
     JLabel acc =new JLabel("Rs: "+balance);
     acc.setBounds(180, 340, 700, 35);
     acc.setForeground(Color.WHITE);
     acc.setFont(new Font("System",Font.BOLD,16));
     image.add(acc);
    
    
     
      setSize(800,800);
      setLocation(300,0);
      //setUndecorated(true);
      setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae) 
    {
        setVisible(false);
        new Transactions(pinnumber).setVisible(true);
        
    }
    public static void main (String args[]){
    new BalanceEnquiry("");
    
    }
}

package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;       //date in also sql and util so i conclude util.date

    public class FastCash extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,exit,b5,b6;
    public String pinnumber;
    FastCash(String pinnumber){
         this.pinnumber=pinnumber;
    setLayout(null);
     ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
     Image i2=i1.getImage().getScaledInstance(800,800, Image.SCALE_DEFAULT);   
     ImageIcon i3=new ImageIcon(i2);
     JLabel image =new JLabel(i3);
     image.setBounds(0,0,800,800);
     add(image);
     
     
     JLabel text =new JLabel("SELECT WITHDRAWL AMOUNT");
     text.setBounds(190, 260, 700, 35);
     text.setForeground(Color.WHITE);
     text.setFont(new Font("Ralway",Font.BOLD,16));
     image.add(text);
     
     b1=new JButton("Rs 100");
     b1.setBounds(150, 370, 130, 25);
     b1.addActionListener(this);
     image.add(b1);
     
     b2=new JButton("Rs 500");
     b2.addActionListener(this);
     b2.setBounds(320, 370, 130, 25);
     image.add(b2);
     
     b3=new JButton("Rs 1000");
     b3.setBounds(150, 400, 130, 25);
     b3.addActionListener(this);
     image.add(b3);
    
     b4=new JButton("RS 2000");
     b4.setBounds(320, 400, 130, 25);
     b4.addActionListener(this);
     image.add(b4);
     
     b5=new JButton("Rs 5000");
     b5.setBounds(150, 430, 130, 25);
     b5.addActionListener(this);
     image.add(b5);
     
     b6=new JButton("Rs 10000");
     b6.addActionListener(this);
     b6.setBounds(320, 430, 130, 25);
     image.add(b6);
     
     exit=new JButton("   Back");
     exit.setBounds(320, 460, 130, 25);
     exit.addActionListener(this);
     image.add(exit);
     
      setSize(800,800);
      setLocation(300,0);
      setUndecorated(true);
      setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
     if(ae.getSource()==exit){
            setVisible(false);
                 new Transactions(pinnumber).setVisible(true);
             }      
else {  
         String amount= ((JButton)ae.getSource()).getText().substring(3);//three char subracted 'Rs '500 
         Conn c=new Conn();
         try{
                ResultSet rs=c.s.executeQuery("select * from bank where pin ='"+pinnumber+"'");
                
                // to check the balance of client
                int balance =0;
                while (rs.next()) {
                if (rs.getString("type").equals("deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
                
                //if exit button is clicked
                 if(ae.getSource()!= exit && balance < Integer.parseInt(amount)){
                     JOptionPane.showMessageDialog(null, "Insufficient Balance");
                     return;
                 }
                
                 Date date=new Date();
                         String query="insert into bank values ('"+pinnumber+"','"+date+"','withdrawl','"+amount+"')";
                         c.s.executeUpdate(query);
                         JOptionPane.showMessageDialog(null,"Rs "+ amount+ " Debites Sucessfully" );
                         setVisible(false);
                         new Transactions(pinnumber).setVisible(true);
                
                }catch(Exception e){
          System.out.println(e);
         }
         }
             }
      
    
    
    public static void main(String args[]){
    
       new FastCash("");
    
    }

    
}

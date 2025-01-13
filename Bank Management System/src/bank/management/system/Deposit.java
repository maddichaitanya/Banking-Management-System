
package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;



public class Deposit extends JFrame implements ActionListener {
    JTextField amount;
     JButton back,deposit;
     public String pinnumber;
    Deposit(String pinnumber){
        this.pinnumber=pinnumber;
        setLayout(null);
     ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
     Image i2=i1.getImage().getScaledInstance(800,800, Image.SCALE_DEFAULT);   
     ImageIcon i3=new ImageIcon(i2);
     JLabel image =new JLabel(i3);
     image.setBounds(0,0,800,800);
     add(image);
        
     JLabel text =new JLabel("Please Enter Your Amount Deposite  ");
     text.setBounds(170, 260, 700, 35);
     text.setForeground(Color.WHITE);
     text.setFont(new Font("System",Font.BOLD,16));
     image.add(text);
     
      amount=new JTextField();
     amount.setFont(new Font("Ralway",Font.BOLD,16));
     amount.setBounds(180, 300, 250, 20);
     image.add((amount));
     
     deposit=new JButton("Deposit");
     deposit.setBounds(320, 430, 130, 25);
     deposit.addActionListener(this);
     image.add(deposit);
     
     back=new JButton("Back");
     back.setBounds(320, 460, 130, 25);
     back.addActionListener(this);
     image.add(back);
     
     
     
     setSize(800,800);
      setLocation(300,0);
      //setUndecorated(true);
      setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        
        
        
        if(ae.getSource()==deposit){
            String number=amount.getText();  //setText 
            
            
            Date date=new Date();
             if(number.equals("")){
                JOptionPane.showMessageDialog(null,"please First Enter Amount you want to Deposit");}
              else {
                 try{
                Conn c=new Conn();
                String query="insert into bank values('"+pinnumber+"','"+date+"','deposit','"+number+"')";
                c.s.executeUpdate(query); // Save data in database
                JOptionPane.showMessageDialog(null,"Rs " +number+" is Deposited Sucessfully");
                 setVisible(false);
                 new Transactions(pinnumber).setVisible(true);
                 }
              catch (Exception e){
            System.out.println(e);
              }
           
            }
        }else if(ae.getSource()==back){
            setVisible(false);
           new Transactions(pinnumber).setVisible(true);
        }
    
       
        
    }
    public static void main(String args[]){
     new Deposit("");
    }
}

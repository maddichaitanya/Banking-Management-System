package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


    public class Transactions extends JFrame implements ActionListener {
    JButton deposit,withdrawl,fastcash,pinchange,exit,balance,ministatement;
    public String pinnumber;
    Transactions(String pinnumber){
         this.pinnumber=pinnumber;
    setLayout(null);
     ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
     Image i2=i1.getImage().getScaledInstance(800,800, Image.SCALE_DEFAULT);   
     ImageIcon i3=new ImageIcon(i2);
     JLabel image =new JLabel(i3);
     image.setBounds(0,0,800,800);
     add(image);
     
     
     JLabel text =new JLabel("Please select Your Transtion");
     text.setBounds(190, 260, 700, 35);
     text.setForeground(Color.WHITE);
     text.setFont(new Font("Ralway",Font.BOLD,16));
     image.add(text);
     
     deposit=new JButton("Deposit");
     deposit.setBounds(150, 370, 130, 25);
     deposit.addActionListener(this);
     image.add(deposit);
     
     withdrawl=new JButton("Cash Withdrawl");
     withdrawl.addActionListener(this);
     withdrawl.setBounds(320, 370, 130, 25);
     image.add(withdrawl);
     
     fastcash=new JButton("FastCash");
     fastcash.setBounds(150, 400, 130, 25);
     fastcash.addActionListener(this);
     image.add(fastcash);
    
     ministatement=new JButton("Mini Statement");
     ministatement.setBounds(320, 400, 130, 25);
     ministatement.addActionListener(this);
     image.add(ministatement);
     
     pinchange=new JButton("Pin Change");
     pinchange.setBounds(150, 430, 130, 25);
     pinchange.addActionListener(this);
     image.add(pinchange);
     
     balance=new JButton("Check Balance");
     balance.addActionListener(this);
     balance.setBounds(320, 430, 130, 25);
     image.add(balance);
     
     exit=new JButton("Exit");
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
           System.exit(0);  //Exit System form Trasactiion
}      else if(ae.getSource()==deposit){
        setVisible(false);
        new Deposit(pinnumber).setVisible(true);
    }else if(ae.getSource()==withdrawl){
        setVisible(false);
        new Withdrawl(pinnumber).setVisible(true);
    }
    else if(ae.getSource()==fastcash){
        setVisible(false);
        new FastCash(pinnumber).setVisible(true);}
     else if(ae.getSource()==pinchange){
        setVisible(false);
        new PinChange(pinnumber).setVisible(true);}
     
     else if(ae.getSource()==balance){
        setVisible(false);
        new BalanceEnquiry(pinnumber).setVisible(true);}
     
     else if(ae.getSource()==ministatement){
         setVisible(false);
         new MinStatement(pinnumber).setVisible(true);
     }
    }
    
    
    public static void main(String args[]){
    
       new Transactions("");
    
    }

    
}

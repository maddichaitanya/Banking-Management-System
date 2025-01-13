//Singup three
package bank.management.system;
import javax.swing.*;
import java.awt.*;  // For Layouts
import java.awt.event.*;
import java.util.*;//random number

public class SignupThree extends JFrame implements ActionListener {
    
     JRadioButton r1,r2,r3,r4;
     JCheckBox c1,c2,c3,c4,c5,c6,c7;
     JButton submit,cancle;
     String formno;
    SignupThree(String formno){
        this.formno=formno;
        
        setLayout(null);
        JLabel l1=new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40); 
        add(l1);
        
        JLabel type=new JLabel(" Account Type :");
        type.setFont(new Font("Raleway",Font.BOLD,16));
        type.setBounds(100,120,160,30); 
        add(type);
        
        r1 =new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,17));
        r1.setSelected(true);         // Automatic button is seceleted
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,160,250,20);
        add(r1);
        
        
         r2 =new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350,160,250,20);
        add(r2);
        
         r3 =new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,200,250,20);
        add(r3);
        
        r4 =new JRadioButton("Recurring Deposite Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350,200,250,20);
        add(r4);
        
        ButtonGroup groupaccount=new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);
        
        JLabel card=new JLabel(" Card Number :");
        card.setFont(new Font("Raleway",Font.BOLD,16));
        card.setBounds(100,240,200,30); 
        add(card);
        
        JLabel number=new JLabel(" xxxx-xxxx-xxxx-1234");
        number.setFont(new Font("Raleway",Font.BOLD,16));
        number.setBounds(330,240,300,30); 
        add(number);
        
        JLabel cardnum=new JLabel(" This is your 16 digit Card Number :");
        cardnum.setFont(new Font("Raleway",Font.BOLD,12));
        cardnum.setBounds(100,280,300,30); 
        add(cardnum);
        
        
        JLabel pin=new JLabel(" Pin :");
        pin.setFont(new Font("Raleway",Font.BOLD,16));
        pin.setBounds(100,320,200,30); 
        add(pin);
        
        JLabel pnumber=new JLabel(" xxxx ");
        pnumber.setFont(new Font("Raleway",Font.BOLD,16));
        pnumber.setBounds(330,320,300,30); 
        add(pnumber);
        
        JLabel pinnum=new JLabel(" This is your 4 digit Pin Number :");
        pinnum.setFont(new Font("Raleway",Font.BOLD,12));
        pinnum.setBounds(100,350,300,30); 
        add(pinnum);
        
        JLabel service=new JLabel(" Service Required :");
        service.setFont(new Font("Raleway",Font.BOLD,22));
        service.setBounds(100,400,200,30); 
        add(service);
        
        c1=new JCheckBox("ATM CAED");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Ralway",Font.BOLD,16));
        c1.setBounds(100,440,200,30);
        add(c1);
        
        c2=new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Ralway",Font.BOLD,16));
        c2.setBounds(350,440,200,30);
        add(c2);
        
        c3=new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Ralway",Font.BOLD,16));
        c3.setBounds(100,480,200,30);
        add(c3);
        
        c4=new JCheckBox("EMAIL & SMS Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Ralway",Font.BOLD,16));
        c4.setBounds(350,480,200,30);
        add(c4);
        
        c5=new JCheckBox("Check Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Ralway",Font.BOLD,16));
        c5.setBounds(100,520,200,30);
        add(c5);
        
        c6=new JCheckBox("E Statment");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Ralway",Font.BOLD,16));
        c6.setBounds(350,520,200,30);
        add(c6);
        
        c7=new JCheckBox("I Hereby Declare that the above enter detail are correct to the best of my knowledge");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Ralway",Font.BOLD,12));
        c7.setBounds(100,560,600,30);
        add(c7);
        
        submit=new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Relway",Font.BOLD,16));
        submit.setBounds(250,620,100,30);
        submit.addActionListener(this);
        add(submit);
        
        cancle=new JButton("Cancle");
        cancle.setBackground(Color.BLACK);
        cancle.setForeground(Color.WHITE);
        cancle.setFont(new Font("Relway",Font.BOLD,16));
        cancle.setBounds(420,620,100,30);
        cancle.addActionListener(this);
        add(cancle);
        
        getContentPane().setBackground(Color.WHITE);
        
     //Frame set 
        getContentPane().setBackground(Color.WHITE);
        setSize(850,820);
        setLocation(350,0);
        setVisible(true);
    
    }
    
    
    
    
        @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== submit){
            String accountType=null;
             if(r1.isSelected()){
               accountType="Saving Account" ;
             }else if (r2.isSelected()){
                 accountType="Fixed Deposit Account";
             }else if (r3.isSelected()){
                 accountType="Current Account";
             }else if (r4.isSelected()){
                 accountType="Recurring Deposite Account";
             }
             
             Random random=new Random();
             String cardnumber=""+Math.abs((random.nextLong() % 90000000L) +5040936000000000L);
             
             String pinnumber=""+Math.abs((random.nextLong() % 9000L) +1000L); 
             
             String facility="";
             if (c1.isSelected()){
                facility=facility+" ATM CARD";
             }else if(c2.isSelected()){
                facility=facility+" Internet Banking";
             }else if(c3.isSelected()){
                facility=facility+" Mobile Banking";               
                }else if(c4.isSelected()){
                facility=facility+" EMAIL & SMS Alerts";               
                }else if(c5.isSelected()){
                facility=facility+" Check Book";               
                }else if(c6.isSelected()){
                facility=facility+" EStatment";               
                }else if(c7.isSelected()){
                facility=facility+" I Hereby Declare that the above enter detail are correct to the best of my knowledge";               
                }
          try{
              if(accountType.equals("")||facility.equals("")){
                   JOptionPane.showMessageDialog(null,"Account Type  is Required");
              }else {
               Conn coon=new Conn();
                String query1="insert into signupthree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                String query2="insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
                coon.s.executeUpdate(query1); // Save data in database of signup
                 coon.s.executeUpdate(query2); // Save data in database of login
              }
            //To View the Cardnumber and Pinnumber to Client
            JOptionPane.showMessageDialog(null,"Card Number :"+cardnumber+"\n Pin : "+pinnumber );
            
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
            
          }catch(Exception e){
              System.out.println(e);
          }
        }else if (ae.getSource()== cancle){
        setVisible(false);
        new Login().setVisible(true);
        }
        
    
    }
    
    public static void main(String args[]){
        
        new SignupThree("");
        
    }
    
}





package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Login extends JFrame implements ActionListener{
    JButton login,signup,clear;
    JTextField CardTextField;
    JPasswordField PINTextField;
    Login(){
        
        setTitle("AUTOMATED TELLER MACHINE");// title set ATM
        
        setLayout(null);// If we call setLayout(null) we can position our components absolutely
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg")); // image src set
        
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT); //set Position W,H,W
        
         ImageIcon i3=new ImageIcon(i2);//Another object for image
        JLabel label= new JLabel(i3);// Jlabel set for image
        label.setBounds(70,10,100,100); //to set the x and y coordinates, as well as the width and height of a component (void setBounds(int x, int y, int width, int height) )
        
        add(label);// image set and added label
        
        getContentPane().setBackground(Color.WHITE); //BackGround Color
         
        //Addind Text
        JLabel text = new JLabel("Welcome to ATM"); // adding text
        
        text.setFont(new Font("Osward",Font.BOLD,38));//Font Set
        text.setBounds(200,40,400,40); //to set the x and y coordinates, as well as the width and height of a component (void setBounds(int x, int y, int width, int height) )
        add(text);
        
        //CardNum 
        JLabel Cardno = new JLabel("Card No :"); // adding text
        
        Cardno.setFont(new Font("Raleway",Font.BOLD,28));//Font Set
        Cardno.setBounds(120,150,150,30); //to set the x and y coordinates, as well as the width and height of a component (void setBounds(int x, int y, int width, int height) )
        add(Cardno);
        
        //CardNum Text Field
        CardTextField = new JTextField();
        CardTextField.setBounds(300, 150, 230, 30);
        CardTextField.setFont(new Font("Arical",Font.BOLD,14));
        add(CardTextField);
        
        
        //Pin Num
        
        JLabel Pin = new JLabel("PIN :"); // adding text
        Pin .setFont(new Font("Raleway",Font.BOLD,28));//Font Set
        Pin .setBounds(120,220,250,30); //to set the x and y coordinates, as well as the width and height of a component (void setBounds(int x, int y, int width, int height) )
        add(Pin);
        
        //PINNum Text Field
        PINTextField = new JPasswordField();
        PINTextField.setBounds(300, 220, 230, 30);
        PINTextField.setFont(new Font("Arical",Font.BOLD,14));
        add(PINTextField);
        
        //Creating Button For Sign in
        login =new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);//Background Color
        login.setForeground(Color.WHITE);// Font Color
        login.addActionListener(this);   //Action performed onclick  on button
        add(login);
        
        //Creating Button For Clear
        clear =new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);//Background Color
        clear.setForeground(Color.WHITE);// Font Color
        clear.addActionListener(this);
        add(clear);
        
         //Creating Button For Sign Up
        signup =new JButton("SIGN UP");
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.BLACK);//Background Color
        signup.setForeground(Color.WHITE);// Font Color
        signup.addActionListener(this);
        add(signup); 
        
        
        
        
        
        
        
        setSize(800,480);//Frame Visible
        
        setVisible(true);//Frame visible true
        setLocation(350,200);//Frame loc left to right
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
    if (ae.getSource()==clear){
      CardTextField.setText("");
      PINTextField.setText("");
    }else if (ae.getSource()==login){
          Conn conn=new Conn();
          String cardnumber = CardTextField.getText(); // cardnumber 
          String pinnumber=PINTextField.getText(); //password filed
          String query = "select * from login where cardnumber = '"+cardnumber+"' and pin ='"+pinnumber+"'"; //taking data from the database for login database
          try{
            ResultSet rs=conn.s.executeQuery(query);// to verify the cardnuber or pin number from the database 
            if(rs.next()){
                setVisible(false);//to false the curent page
                new Transactions(pinnumber).setVisible(true);// to open the Transactions page on login button
            }else{
                JOptionPane.showMessageDialog(null, "Incorrect Card Numder or Pin");// show that the dialog to client pin or cardnumber is valid or not
            }
                
          }catch(Exception e){
              
              System.out.println(e); //for the exception handleiding 
          }
    }else if (ae.getSource()==signup){
        setVisible(false);
        new SignupOne().setVisible(true);
    }
    
    
    }
    
    public static void main(String[] args){
        new Login(); //Object created for Jframe
    
    }

    

    
    
}

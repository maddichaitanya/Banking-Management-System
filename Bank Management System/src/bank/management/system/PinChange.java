
package bank.management.system;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;


public class PinChange extends JFrame implements ActionListener {
    public String pinnumber; 
    JPasswordField pin,repin;
    JButton back,change;
    PinChange(String pinnumber){
        

     this.pinnumber=pinnumber;
     setLayout(null);
     ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
     Image i2=i1.getImage().getScaledInstance(800,800, Image.SCALE_DEFAULT);   
     ImageIcon i3=new ImageIcon(i2);
     JLabel image =new JLabel(i3);
     image.setBounds(0,0,800,800);
     add(image);
        
     JLabel text =new JLabel(" CHANGE YOUR PIN ");
     text.setBounds(200, 250, 700, 35);
     text.setForeground(Color.WHITE);
     text.setFont(new Font("System",Font.BOLD,16));
     image.add(text);
      
     JLabel pintext =new JLabel("NEW PIN :");
     pintext.setBounds(140, 290, 180, 25);
     pintext.setForeground(Color.WHITE);
     pintext.setFont(new Font("System",Font.BOLD,16));
     image.add(pintext);
     
    pin=new JPasswordField();
    pin.setFont(new Font("Raleway",Font.BOLD,16));
    pin.setBounds(320,290,120,25);
    image.add(pin);
     
     
     
     JLabel repintext =new JLabel("RE-ENTER NEW PIN :");
     repintext.setBounds(140, 320, 180, 25);
     repintext.setForeground(Color.WHITE);
     repintext.setFont(new Font("System",Font.BOLD,16));
     image.add(repintext);
     
    repin=new JPasswordField();
    repin.setFont(new Font("Raleway",Font.BOLD,16));
    repin.setBounds(320,320,120,25);
    image.add(repin);
     
    
     change=new JButton("Change");
     change.setBounds(320, 430, 130, 25);
     change.addActionListener(this);
     image.add(change);
     
     back=new JButton("Back");
     back.setBounds(320, 460, 130, 25);
     back.addActionListener(this);
     image.add(back);
     
     
      setSize(800,800);
      setLocation(300,0);
      setUndecorated(true);
      setVisible(true);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        
        
        if(ae.getSource()==change){
        try{
            String npin=pin.getText();
            String rpin=repin.getText();
            
            if(!npin.equals(rpin)){
                
                JOptionPane.showMessageDialog(null, "Enter Pin Does not Match");
                return;
            
        } if(npin.equals("")){
            JOptionPane.showMessageDialog(null, "Please Enter Pin New First");
                return;
            
        }if(rpin.equals("")){
            JOptionPane.showMessageDialog(null, "Please Re-Enter Pin New First");
                return;
        
        }
        
        Conn c =new Conn();
        String query1="update bank set pin='"+rpin+"' where pin='"+pinnumber+"'";
        String query2="update login set pin='"+rpin+"' where pin='"+pinnumber+"'";
        String query3="update signupthree set pin='"+rpin+"' where pin='"+pinnumber+"'";
        
        c.s.executeUpdate(query1);
        c.s.executeUpdate(query2);
        c.s.executeUpdate(query3); 
        
        JOptionPane.showMessageDialog(null, "Pin Chaged Sucessfilly ");
        setVisible(false);
            new Transactions(rpin).setVisible(true);
            
        }catch (Exception e){
            System.out.println(e);
        }
    } else{
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
    
    }
    
    public static void main(String args[]){
        
        new PinChange("").setVisible(true);
    }
    
}

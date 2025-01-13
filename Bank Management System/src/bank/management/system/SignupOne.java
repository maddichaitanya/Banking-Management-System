
package bank.management.system;
 
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser; //for Calender DOP
import java.awt.event.*;


public class SignupOne extends JFrame implements ActionListener {
     long random;
     JTextField nameTextField,fnameTextField,emailTextField,addressTextField,cityTextField,stateTextField,pincodeTextField;
     JButton next;
     JRadioButton male,female,other,others,married,unmarried;
     JDateChooser dateChooser;
     ButtonGroup maritalgroup,gerndergroup;
    SignupOne(){
        setLayout(null);
        Random ran =new Random();
         random =Math.abs((ran.nextLong()%900l)+1000L);//for random number with long (Math.abs is used to convert to negative to positive)
        //Label set for Form
        JLabel formno= new JLabel("APPLICATION FORM NO." + random );
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        
         //Label set for Personal details
        JLabel personDeatils= new JLabel("Page 1: Personal Details" );
        personDeatils.setFont(new Font("Raleway",Font.BOLD,22));
        personDeatils.setBounds(290,80,400,30);
        add(personDeatils);
        
        //Label set for Name
        JLabel name= new JLabel("Name:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
         
        //textfield for Name
        nameTextField =new JTextField();
        nameTextField.setFont(new Font("Railway",Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
         //Label set for fName
        JLabel fname= new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
         //textfield for fName
         fnameTextField =new JTextField();
        fnameTextField.setFont(new Font("Railway",Font.BOLD,14));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);
        //Label set for DOB
        JLabel dob= new JLabel("Date Of Birth:");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30); //190+30=220 now we keep 220+20=240
        add(dob);
        
        //For Calender 
        dateChooser = new  JDateChooser();
        dateChooser.setBounds(300,240,200,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);
        
         //Label set for Gender
        JLabel gender= new JLabel("Gender:");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30); //190+30=220 now we keep 220+20=240
        add(gender);
        
        // radio Button for male and female
        male =new JRadioButton("Male");
        male.setSelected(true);             // Automatic button is seceleted
        male.setBounds(300, 290, 60, 30);
        male.setBackground(Color.WHITE);
        add(male);
         female =new JRadioButton("Female");
        female.setBounds(450, 290, 120, 30);
        female.setBackground(Color.WHITE);
        add(female);
        others =new JRadioButton("Other");
        others.setBounds(630, 290, 100, 30);
        others.setBackground(Color.WHITE);
        add(others);
        // To select Single RadioButton male or femail
        
        gerndergroup =new ButtonGroup();
        gerndergroup.add(male);
        gerndergroup.add(female);
        gerndergroup.add(others);
        
        
        //Label set for Email
        JLabel email= new JLabel("Email Address:");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,200,30);                  //190+30=220 now we keep 220+20=240
        add(email);
        
         //textfield for Email
         emailTextField =new JTextField();
        emailTextField.setFont(new Font("Railway",Font.BOLD,14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
        
        
        
        //Label set for Marital Status
        JLabel marital= new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,200,30); //190+30=220 now we keep 220+20=240
        add(marital);
        
        // radio Button for Marital Status (married and unmarried and Other)
         married =new JRadioButton("Married");
         married.setSelected(true);         // Automatic button is seceleted
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.WHITE);
        add(married);
         unmarried =new JRadioButton("UnMarried");
        unmarried.setBounds(450, 390, 120, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        other =new JRadioButton("Other");
        other.setBounds(630, 390, 100, 30);
        other.setBackground(Color.WHITE);
        add(other);
        
        // To select Single RadioButton married and unmarried and Other
        
         maritalgroup =new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);
        
        
         //Label set for Address
        JLabel address= new JLabel("Address:");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30); //190+30=220 now we keep 220+20=240
        add(address);
        
        //textfield for Address
         addressTextField =new JTextField();
        addressTextField.setFont(new Font("Railway",Font.BOLD,14));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);
        
        //Label set for City
        JLabel city= new JLabel("City:");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30); //190+30=220 now we keep 220+20=240
        add(city);
        
        //textfield for City
         cityTextField =new JTextField();
        cityTextField.setFont(new Font("Railway",Font.BOLD,14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);
        
        //Label set for State
        JLabel state= new JLabel("State:");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30); //190+30=220 now we keep 220+20=240
        add(state);
        
        //textfield for Satae
         stateTextField =new JTextField();
        stateTextField.setFont(new Font("Railway",Font.BOLD,14));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);
        
        //Label set for Picode
        JLabel pincode= new JLabel("Picode:");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30); //190+30=220 now we keep 220+20=240
        add(pincode);
        
         //textfield for Pincode
         pincodeTextField =new JTextField();
        pincodeTextField.setFont(new Font("Railway",Font.BOLD,14));
        pincodeTextField.setBounds(300,590,400,30);
        add(pincodeTextField);
       
        
        //Button for Next
         next=new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        //Clear Button
        
       /* JButton clear =new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);//Background Color
        clear.setForeground(Color.WHITE);// Font Color
        clear.addActionListener(this);
        add(clear);*/
        
        //Frame set 
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        
}
   @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String formno=""+random; //long
        String name=nameTextField.getText();  //setText 
        String fname=fnameTextField.getText();
        String dop=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if (male.isSelected()){
            gender ="male";
        }else if (female.isSelected()){
            gender ="femail";
        }
        else if (other.isSelected())
        {  gender="others";
        }
        String email=emailTextField.getText();
        String marital=null;
        if (married.isSelected()){
            marital ="married";
        }else if (unmarried.isSelected()){
            marital ="unmarried";
        }else if (other.isSelected())
        {  marital="other";
        }
        
        String address=addressTextField.getText();
        String state=stateTextField.getText();
        String pincode=pincodeTextField.getText();
        String city=cityTextField.getText();
        
        try{
            if(name.equals("")||fname.equals("")||email.equals("")||address.equals("")||state.equals("")||pincode.equals("")||city.equals("")||dop.equals("")){
                JOptionPane.showMessageDialog(null,"This Filed is Required to Filed");
            } 
            else {
                Conn c=new Conn();
                String query="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dop+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pincode+"')";
                c.s.executeUpdate(query); // Save data in database
                
                setVisible(false);
                new SignupTwo(formno).setVisible(true);// to open SignupTwo page
            
            }
        }catch (Exception e){
            System.out.println(e);
        }
        
    }
    public static void main(String args[]){
        new SignupOne();
    }

   
    
    
}

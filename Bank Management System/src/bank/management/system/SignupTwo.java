package bank.management.system;
import javax.swing.*; //JFrame
import java.awt.*;  
import java.awt.event.*;


public class SignupTwo extends JFrame implements ActionListener {
   
     JTextField pan,aadhar;
     JButton next;
     JRadioButton syes,sno,eyes,eno;
     ButtonGroup maritalgroup,emaritalgroup;
     JComboBox religion,catagory,occuption,eduication,income ;
     String formno;
    
    SignupTwo(String formno){
        this.formno=formno; // To acces the formno of client
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM PAHE 2");
      
        
         //Label set for Personal details
        JLabel additionalDeatils= new JLabel("Page 1: Additional Details" );
        additionalDeatils.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDeatils.setBounds(290,80,400,30);
        add(additionalDeatils);
        
        //Label set for Religion
        JLabel name= new JLabel("Religion:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
         
        //ComboBox for Religion
        String valReligion[]={"Hindu","Muslim","Sikh","Christian","other"};//array created
        religion = new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
       
        
         //Label set for Catagory
        JLabel fname= new JLabel("Catagory:");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        //ComboBox for Catagory
        String valCatagory[]={"General","OBC","SC","ST","other"};//array created
        catagory = new JComboBox(valCatagory);
        catagory.setBounds(300,190,400,30);
        catagory.setBackground(Color.WHITE);
        add(catagory);
        
        
         
        //Label set for Income
        JLabel dob= new JLabel("Income:");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30); //190+30=220 now we keep 220+20=240
        add(dob);
        //ComboBox for Income
        String valIncome[]={"Null","< 50,000","< 1,50,000","< 2,50,000","< 5,50,000","Upto 10,00,000"};//array created
        income = new JComboBox(valIncome);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);
        
         //Label set for Eduicational
        JLabel email= new JLabel("Eduicational:");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,295,200,30); //190+30=220 now we keep 220+20=240
        add(email);
        //ComboBox for Eduicational
        String eduicationalValues[]={"Non-Graduation","Graduate","Post-Graduation","Doctrate","Others"};//array created
        eduication = new JComboBox(eduicationalValues);
        eduication.setBounds(300,315,400,30);
        eduication.setBackground(Color.WHITE);
        add(eduication);
       
        
        
        //Label set for Qulification
        JLabel qualification= new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway",Font.BOLD,20));
        qualification.setBounds(100,315,200,30); //190+30=220 now we keep 220+20=240
        add(qualification);
       
        
        
        
        //Label set for Occupation
        JLabel martial= new JLabel("Occupation:");
        martial.setFont(new Font("Raleway",Font.BOLD,20));
        martial.setBounds(100,390,200,30); //190+30=220 now we keep 220+20=240
        add(martial);
        //ComboBox for Occupation
        String occupationValues[]={"Salaried","Self-Employed","Bussiness","Student","Reatired","Others"};//array created
        occuption = new JComboBox(occupationValues);
        occuption.setBounds(300,390,400,30);
        occuption.setBackground(Color.WHITE);
        add(occuption);
        
        
        
         //Label set for Pan Number
        JLabel address= new JLabel("Pan Number:");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30); //190+30=220 now we keep 220+20=240
        add(address);
        
        //textfield for Address
        pan=new JTextField();
        pan.setFont(new Font("Railway",Font.BOLD,14));
        pan.setBounds(300,440,400,30);
        add(pan);
        
        //Label set for Aadhar Number:
        JLabel city= new JLabel("Aadhar Number:");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30); //190+30=220 now we keep 220+20=240
        add(city);
        
        //textfield for City
         aadhar =new JTextField();
        aadhar.setFont(new Font("Railway",Font.BOLD,14));
        aadhar.setBounds(300,490,400,30);
        add(aadhar);
        
        //Label set for Seinor Citizen
        JLabel state= new JLabel("Seinor Citizen:");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30); //190+30=220 now we keep 220+20=240
        add(state);
        
        //Radio Button for Seinor Citizen
        syes=new JRadioButton("Yes");
        syes.setSelected(true);         // Automatic button is seceleted
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno=new JRadioButton("No");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        maritalgroup=new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);
        
        //Label set for Exisiting Account
        JLabel pincode= new JLabel("Exisiting Account:");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30); //190+30=220 now we keep 220+20=240
        add(pincode);
        
        //Radio Button For Exisiting Account
        eyes=new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setSelected(true);         // Automatic button is seceleted
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno=new JRadioButton("No");
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        emaritalgroup=new ButtonGroup();
        emaritalgroup.add(syes);
        emaritalgroup.add(sno);
         
       
        
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
        //String formno=""+random; //long
        String sreligion=(String) religion.getSelectedItem();  //to an Select an combobox
        String scatagory=(String) catagory.getSelectedItem();  //to an Select an combobox
        String sincome=(String) income.getSelectedItem();  //to an Select an combobox
        String seducation=(String) eduication.getSelectedItem();
        String soccuption=(String) occuption.getSelectedItem();
        String seniorcitizien=null;
        if (syes.isSelected()){
            seniorcitizien ="Yes";
        }else if (sno.isSelected()){
            seniorcitizien ="No";
        }
        
        String sexisitingaccount=null;
        if (eyes.isSelected()){
            sexisitingaccount ="Yes";
        }else if (eno.isSelected()){
            sexisitingaccount ="No";
        }
        
        String span=pan.getText();
        String saadhar=aadhar.getText();
        
        
        
             try{
            if(sreligion.equals("")||scatagory.equals("")||sincome.equals("")||seducation.equals("")||soccuption.equals("")||seniorcitizien.equals("")||sexisitingaccount.equals("")){
                JOptionPane.showMessageDialog(null,"This Filed is Required to Filed");
            }else{
           
                Conn c=new Conn();
                String query="insert into signuptwo values('"+formno+"','"+sreligion+"','"+scatagory+"','"+sincome+"','"+seducation+"','"+soccuption+"','"+span+"','"+saadhar+"','"+seniorcitizien+"','"+sexisitingaccount+"')";
                c.s.executeUpdate(query); // Save data in database
            
            //signup3 Object
            setVisible(false);
            new SignupThree(formno).setVisible(true);}
        }
             catch (Exception e)
             {
            System.out.println(e);
        }
        
    }
    public static void main(String args[]){
        new SignupTwo(""); //passed empty string
    }

   
    
    
}



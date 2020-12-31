import java.applet.Applet;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class U3A2_Password extends Applet implements ActionListener{
    JLabel lblWelcome;
    JLabel lblUser;
    JLabel lblCondition;
    JLabel lblPass;
    JTextField txtUser;
    JTextField txtPass;
    JLabel lblOutput; //this is the output label
    JButton btnEnter;
    
    public void init(){
       //Seeting up the frame
       resize(500,500);
       setLayout(null);
       //Changing the color of the background
       setBackground(Color.WHITE);
       //Let's add a label to the form
       lblWelcome = new JLabel();
       //seeting the text proprty for the label
       lblWelcome.setText("Password Program");
       //we have to add the label into the Applet
       lblWelcome.setSize(200, 50);//How big is the label 
       lblWelcome.setLocation(200, 0);//Where//the label should go
       add(lblWelcome); 
       
       lblUser = new JLabel();
       //setting the text proprty for the label
       lblUser.setText("Enter a username: ");
       //we have to add the label into the Applet
       lblUser.setSize(200,50);
       lblUser.setLocation(50,50);
       add(lblUser);
       
       lblCondition = new JLabel();
       //setting the text proprty for the label
       lblCondition.setText("(at least 8 characters long)");
       //we have to add the label into the Applet
       lblCondition.setSize(200,25);
       lblCondition.setLocation(40,80);
       add(lblCondition);
        
       txtUser = new JTextField();
       txtUser.setSize(200,30);
       txtUser.setLocation(200,60);
       add(txtUser);
        
       lblPass = new JLabel();
       //seeting the text proprty for the label
       lblPass.setText("Enter a password: ");
       //we have to add the label into the Applet
       lblPass.setSize(200,50);
       lblPass.setLocation(50,100);
       add(lblPass);

       txtPass = new JTextField();
       txtPass.setSize(200,30);
       txtPass.setLocation(200, 110);
       add(txtPass);
      
        //Adding a Button
        btnEnter = new JButton();
        btnEnter.setText("Generate Password");
        btnEnter.setSize(375, 25);
        btnEnter.setLocation(50, 180);
        add(btnEnter);
        //Let the button talk to the program
        btnEnter.setActionCommand("Generate Password");
        btnEnter.addActionListener(this);
        
        //adding the output label
        lblOutput = new JLabel();
        lblOutput.setText("");
        lblOutput.setSize(375,25);
        lblOutput.setLocation(50, 225);
        add(lblOutput);
    
    
    
    
    
    }
    
    public void actionPerformed (ActionEvent e){
        if(e.getActionCommand().equals("Generate Password")){
            String strUser = txtUser.getText();
            String strPass = txtPass.getText();
            int intPassLength = strPass.length();
            
            if(intPassLength >= 8){
                int intRandom = (int)(Math.random()* (101 - 1 + 1) + 1);
                String strNewPass = strPass + intRandom;
                String strFinalPass = strNewPass.toLowerCase();
                lblOutput.setText("Username: " + strUser + "  Password: " + strFinalPass); 
               
            }
            else{
                lblOutput.setText("Password must be atleast 8 characters long");
            }
        }
            
            
    
        
        
        
        }
    }




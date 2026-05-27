package Doctor;

import Homepage.Homepage;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;

public class DoctorPage extends JFrame implements ActionListener
{
	JLabel Doctorportal,welcome,loginmsg,userlable,passlable;
	JPanel DoctorPanel;
	JButton loginbtn,registerbtn,back;
	JTextField userfield;
	JPasswordField pfield;
	Color myColor;
	Font myFont;
	
	
public DoctorPage()
{
		super("Doctor Portal");
		this.setSize(800, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(DoctorPanel);
		
		ImageIcon image = new ImageIcon("imgs\\logo.png");
		this.setIconImage(image.getImage());
		myColor = new Color(41, 170, 225);
		myFont = new Font(Font.SANS_SERIF, Font.BOLD,28);
		
		DoctorPanel = new JPanel();
		DoctorPanel.setLayout(null);
		DoctorPanel.setBackground(myColor);
		
		ImageIcon Doctor = new ImageIcon("imgs\\Doctor.png");
		Border border = BorderFactory.createLineBorder(Color.white,8);
		Doctorportal = new JLabel(Doctor);
		Doctorportal.setBounds(-20, -10, 320, 450);
		Doctorportal.setBorder(border);
		DoctorPanel.add(Doctorportal);
		
		ImageIcon welcomemsg = new ImageIcon("imgs\\WelcomeDoctorLabel.png");
		welcome = new JLabel(welcomemsg);
		welcome.setBounds(390,40,300,100);
		DoctorPanel.add(welcome);
		
		
		loginmsg = new JLabel("Please login below");
		loginmsg.setForeground(Color.black);
        loginmsg.setFont(new Font("Arial Black",Font.PLAIN,22));
        loginmsg.setBounds(430,110,300,100);
        DoctorPanel.add(loginmsg);
		
		
		userlable = new JLabel("Username: ");
		userlable.setBounds(420,200,100,30);
		userlable.setForeground(Color.WHITE);
		userlable.setFont(new Font("Arial Black",Font.PLAIN,15));
		DoctorPanel.add(userlable);
		
		userfield = new JTextField();
		userfield.setBounds(520,200,150,30);
		DoctorPanel.add(userfield);
		
		passlable = new JLabel("Password: ");
		passlable.setBounds(420,250,100,30);
		passlable.setForeground(Color.WHITE);
		passlable.setFont(new Font("Arial Black",Font.PLAIN,15));
		DoctorPanel.add(passlable);
		
		pfield = new JPasswordField();
		pfield.setBounds(520,250,150,30);
		DoctorPanel.add(pfield);
		
		loginbtn = new JButton("Login");
		loginbtn.setBounds(520,300,80,30);
		loginbtn.setBackground(new Color(63, 79, 224));
		loginbtn.setForeground(Color.white);
		loginbtn.addActionListener(this);
		DoctorPanel.add(loginbtn);
		
		registerbtn = new JButton("Register?");
	    registerbtn.setBounds(520,340,90,30);
		registerbtn.setBackground(new Color(99, 69, 222));
		registerbtn.setForeground(Color.white);
		registerbtn.addActionListener(this);
		DoctorPanel.add(registerbtn);
		
		ImageIcon iback = new ImageIcon("imgs\\back.png");
        back = new JButton(iback);
        iback.setImageObserver(back);
        back.setBounds(310, 40 , 60, 60);
        back.setBackground(Color.decode("#d1eaf0"));
		back.addActionListener(this);
        add(back);
		
		this.add(DoctorPanel);
}
public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==back)
			{
				Homepage h2 = new Homepage();
				h2.setVisible(true);
				this.setVisible(false);
			}
			else if(ae.getSource()==registerbtn)
			{
				DoctorReg dr = new DoctorReg();
				dr.setVisible(true);
				this.setVisible(false);
			}
			else if(ae.getSource()==loginbtn)
           	 {
                    		String username=userfield.getText();
               		        String pass=pfield.getText();

             		        DoctorAccount account=new DoctorAccount();


            		 if(account.getAccount(username,pass))

                    	{
                        	JOptionPane.showMessageDialog(null,"Login Successful!");
                       		DoctorPortal dp1 = new DoctorPortal();
                        	dp1.setVisible(true);
                        	this.setVisible(false);
                    	}
               		else
                	{
                    		JOptionPane.showMessageDialog(null,"Incorrect Credentials");
               		}
			 }
		}
}
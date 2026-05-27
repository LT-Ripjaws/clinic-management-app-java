package Patient;

import Homepage.Homepage;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;

public class PatientPage extends JFrame implements ActionListener
{
	JLabel Patientportal,welcome,loginmsg,userlable,passlable;
	JPanel PatientPanel;
	JButton loginbtn,registerbtn,back;
	JTextField userfield;
	JPasswordField pfield;
	Color myColor;
	Font myFont;
	
	
public PatientPage()
{
		super("Patient Portal");
		this.setSize(800, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(PatientPanel);
		
		ImageIcon image = new ImageIcon("imgs\\logo.png");
		this.setIconImage(image.getImage());
		myColor = new Color(41, 170, 225);
		myFont = new Font(Font.SANS_SERIF, Font.BOLD,28);
		
		PatientPanel = new JPanel();
		PatientPanel.setLayout(null);
		PatientPanel.setBackground(myColor);
		
		ImageIcon patient = new ImageIcon("imgs\\patient.png");
		Border border = BorderFactory.createLineBorder(Color.white,12);
		Patientportal = new JLabel(patient);
		Patientportal.setBounds(-20, -20, 320, 450);
		Patientportal.setBorder(border);
		PatientPanel.add(Patientportal);
		
		ImageIcon welcomemsg = new ImageIcon("imgs\\WelcomePatientLabel.png");
		welcome = new JLabel(welcomemsg);
		welcome.setBounds(390,40,300,100);
		PatientPanel.add(welcome);
		
		
		loginmsg = new JLabel("Please login below");
		loginmsg.setForeground(Color.black);
        loginmsg.setFont(new Font("Arial Black",Font.PLAIN,22));
        loginmsg.setBounds(430,110,300,100);
        PatientPanel.add(loginmsg);
		
		
		userlable = new JLabel("Username: ");
		userlable.setBounds(420,200,100,30);
		userlable.setForeground(Color.WHITE);
		userlable.setFont(new Font("Arial Black",Font.PLAIN,15));
		PatientPanel.add(userlable);
		
		userfield = new JTextField();
		userfield.setBounds(520,200,150,30);
		PatientPanel.add(userfield);
		
		passlable = new JLabel("Password: ");
		passlable.setBounds(420,250,100,30);
		passlable.setForeground(Color.WHITE);
		passlable.setFont(new Font("Arial Black",Font.PLAIN,15));
		PatientPanel.add(passlable);
		
		pfield = new JPasswordField();
		pfield.setBounds(520,250,150,30);
		PatientPanel.add(pfield);
		
		loginbtn = new JButton("Login");
		loginbtn.setBounds(520,300,80,30);
		loginbtn.setBackground(new Color(63, 79, 224));
		loginbtn.setForeground(Color.white);
		loginbtn.addActionListener(this);
		PatientPanel.add(loginbtn);
		
		registerbtn = new JButton("Register?");
	    registerbtn.setBounds(520,340,90,30);
		registerbtn.setBackground(new Color(99, 69, 222));
		registerbtn.setForeground(Color.white);
		registerbtn.addActionListener(this);
		PatientPanel.add(registerbtn);
		
		ImageIcon iback = new ImageIcon("imgs\\back.png");
        back = new JButton(iback);
        iback.setImageObserver(back);
        back.setBounds(310, 40 , 60, 60);
        back.setBackground(Color.decode("#d1eaf0"));
		back.addActionListener(this);
        add(back);
		
		this.add(PatientPanel);
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
				PatientReg pr = new PatientReg();
				pr.setVisible(true);
				this.setVisible(false);
			}
			else if(ae.getSource()==loginbtn)
			{
				String username=userfield.getText();
				String pass=pfield.getText();
				
				PatientAccount account=new PatientAccount();

				
			 if(account.getAccount(username,pass))
					
					{
						JOptionPane.showMessageDialog(null,"Login Successful!");
						PatientPortal pp1 = new PatientPortal();
						pp1.setVisible(true);
						this.setVisible(false);
					}
				else
				{
					JOptionPane.showMessageDialog(null,"Incorrect Credentials");
				}
			}
		}
}
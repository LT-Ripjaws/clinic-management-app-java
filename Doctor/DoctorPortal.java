package Doctor;


import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;

public class DoctorPortal extends JFrame implements ActionListener
{
	JLabel Doctorportal,Doctorportal1;
	DoctorPage dp1;
	JPanel DoctorPanel;
	JButton checkappointmentbtn,back,medicine;
	Color myColor;
	Font myFont;
	
	
public DoctorPortal()
{
		super("Doctor Portal");
		this.setSize(800, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(DoctorPanel);
		
		this.dp1 = dp1;
		
		ImageIcon image = new ImageIcon("imgs\\logo.png");
		this.setIconImage(image.getImage());
		myColor = new Color(41, 170, 225);
		myFont = new Font(Font.SANS_SERIF, Font.BOLD,28);
		
		DoctorPanel = new JPanel();
		DoctorPanel.setLayout(null);
		DoctorPanel.setBackground(myColor);
		
		ImageIcon Doctor = new ImageIcon("imgs\\view.png");
		Border border = BorderFactory.createLineBorder(Color.white,12);
		Doctorportal = new JLabel(Doctor);
		Doctorportal.setBounds(-20, -20, 320, 450);
		Doctorportal.setBorder(border);
		DoctorPanel.add(Doctorportal);
		
		ImageIcon welcomemsg = new ImageIcon("imgs\\WelcomeDoctorLabel.png");
		Doctorportal1 = new JLabel(welcomemsg);
		Doctorportal1.setBounds(390,40,300,100);
		DoctorPanel.add(Doctorportal1);
		
        checkappointmentbtn = new JButton("CHECK PATIENT LIST");
        checkappointmentbtn.setBounds(410,200,270,50);
        checkappointmentbtn.setBackground(new Color(99, 69, 222));
        checkappointmentbtn.setForeground(Color.white);
        checkappointmentbtn.setFocusable(false);
		checkappointmentbtn.addActionListener(this);
        checkappointmentbtn.setFont(new Font("Arial Black",Font.PLAIN,18));
        DoctorPanel.add(checkappointmentbtn);
		
		ImageIcon iback = new ImageIcon("imgs\\back.png");
        back = new JButton(iback);
        iback.setImageObserver(back);
        back.setBounds(310, 40 , 60, 60);
        back.setBackground(Color.decode("#d1eaf0"));
		back.addActionListener(this);
        add(back);
		
		medicine = new JButton("SEE MEDICINE LIST");
		medicine.setBounds(410,300,270,50);
		medicine.setBackground(new Color(99, 69, 222));
		medicine.setForeground(Color.WHITE);
		medicine.setFocusable(false);
		medicine.addActionListener(this);
		medicine.setFont(new Font("Arial Black",Font.PLAIN,18));
		DoctorPanel.add(medicine);
		
		this.add(DoctorPanel);
}
public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==back)
			{
				DoctorPage d1 = new DoctorPage();
				d1.setVisible(true);
				this.setVisible(false);
			}
			
			else if(ae.getSource()==checkappointmentbtn)
			{
				PatList pt = new PatList();
				pt.setVisible(true);
				this.setVisible(false);
		}
		else if(ae.getSource()==medicine)
			{
				DocMed DM = new DocMed();
				DM.setVisible(true);
				this.setVisible(false);
			}
		}
}
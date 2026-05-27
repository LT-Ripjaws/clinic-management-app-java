package Patient;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;

public class PatientPortal extends JFrame implements ActionListener
{
	JLabel pportal,pportal1;
	JPanel PortalPanel;
	JButton appointment,back,medicine;
	Color myColor;
	Font myFont;
	PatientPage patpage;
	
	public PatientPortal()
	{
		super("Patient Portal");
		this.setSize(800, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(PortalPanel);
		
		this.patpage=patpage;
		
		ImageIcon image = new ImageIcon("imgs\\logo.png");
		this.setIconImage(image.getImage());
		myColor = new Color(41, 170, 225);
		myFont = new Font(Font.SANS_SERIF, Font.BOLD,28);
		
		PortalPanel = new JPanel();
		PortalPanel.setLayout(null);
		PortalPanel.setBackground(myColor);
		
		ImageIcon patient = new ImageIcon("imgs\\PatientPortal.png");
		Border border = BorderFactory.createLineBorder(Color.white,12);
		pportal1= new JLabel(patient);
		pportal1.setBounds(-20, -20, 320, 450);
		pportal1.setBorder(border);
		PortalPanel.add(pportal1);	
		
		ImageIcon welcomemsg = new ImageIcon("imgs\\WelcomePatientLabel.png");
		pportal = new JLabel(welcomemsg);
		pportal.setBounds(390,40,300,100);
		PortalPanel.add(pportal);
		
		appointment = new JButton("GET AN APPOINTMENT");
		appointment.setBounds(410,200,270,50);
		appointment.setBackground(new Color(99, 69, 222));
		appointment.setForeground(Color.WHITE);
		appointment.setFocusable(false);
		appointment.addActionListener(this);
		appointment.setFont(new Font("Arial Black",Font.PLAIN,18));
		PortalPanel.add(appointment);
		
		ImageIcon iback = new ImageIcon("imgs\\back.png");
        back = new JButton(iback);
        iback.setImageObserver(back);
        back.setBounds(310, 40 , 60, 60);
        back.setBackground(Color.decode("#d1eaf0"));
		back.addActionListener(this);
        add(back);
		
		medicine = new JButton("GET MEDICINE LIST");
		medicine.setBounds(410,300,270,50);
		medicine.setBackground(new Color(99, 69, 222));
		medicine.setForeground(Color.WHITE);
		medicine.setFocusable(false);
		medicine.addActionListener(this);
		medicine.setFont(new Font("Arial Black",Font.PLAIN,18));
		PortalPanel.add(medicine);
	
		this.add(PortalPanel);
	}
	
	public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==back)
			{
				PatientPage p1 = new PatientPage();
				p1.setVisible(true);
				this.setVisible(false);
			}
			else if(ae.getSource()==appointment)
			{
				PatApp PA = new PatApp();
				PA.setVisible(true);
				this.setVisible(false);
			}
			else if(ae.getSource()==medicine)
			{
				MedicineApp MA = new MedicineApp();
				MA.setVisible(true);
				this.setVisible(false);
			}
		}
		
}
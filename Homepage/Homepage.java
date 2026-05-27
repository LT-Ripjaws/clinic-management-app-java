package Homepage;

import Doctor.DoctorPage;
import Patient.PatientPage;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Homepage extends JFrame implements MouseListener, ActionListener
{
	JLabel hos,manage;
	JButton DoctorBtn, PatientBtn, ExitBtn, AboutBtn;
	JLayeredPane panel;
	Color myColor;
	Font myFont;
	
	public Homepage()
	{
		super("Welcome to the Homepage");
		this.setSize(800, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(panel);
		
		ImageIcon image = new ImageIcon("imgs\\logo.png");
		this.setIconImage(image.getImage());
		myColor = new Color(41, 170, 225);
		myFont = new Font(Font.SANS_SERIF, Font.BOLD,28);
		
			
		panel = new JLayeredPane();
		panel.setLayout(null);
		panel.setBounds(0,0,800,450);
		panel.setBackground(myColor);
		
		
		ImageIcon background = new ImageIcon("imgs\\Background.png");
		JLabel DEFAULT = new JLabel(background);
		DEFAULT.setBounds (0,0,800,450);
		DEFAULT.setOpaque(true);
		panel.add(DEFAULT, JLayeredPane.DEFAULT_LAYER);
		
		
		
		ImageIcon docimage = new ImageIcon("imgs\\Doctor1.png");
		DoctorBtn = new JButton(docimage);
		DoctorBtn.setBounds(150, 190, 200, 200);
		DoctorBtn.setBackground(Color.WHITE);
		DoctorBtn.setOpaque(true);
		DoctorBtn.addMouseListener(this);
		DoctorBtn.addActionListener(this);
		DoctorBtn.setFocusable(false);
		panel.add(DoctorBtn, JLayeredPane.DRAG_LAYER);
		
		ImageIcon patimage = new ImageIcon("imgs\\patient1.png");
		PatientBtn = new JButton(patimage);
		PatientBtn.setBounds(430, 190, 200, 200);
		PatientBtn.setBackground(Color.WHITE);
		PatientBtn.setOpaque(true);
		PatientBtn.addMouseListener(this);
		PatientBtn.addActionListener(this);
		PatientBtn.setFocusable(false);
		panel.add(PatientBtn, JLayeredPane.DRAG_LAYER);
		
		ExitBtn = new JButton("Exit");
		ExitBtn.setFont(new Font("Arial Black",Font.BOLD,25));
		ExitBtn.setBounds(660, 310, 100, 40);
		ExitBtn.setBackground(new Color(3, 98, 252));
		ExitBtn.setOpaque(true);
		ExitBtn.addMouseListener(this);
		ExitBtn.setFocusable(false);
		ExitBtn.addActionListener(this);
		panel.add(ExitBtn, JLayeredPane.DRAG_LAYER);
		
		
		AboutBtn = new JButton("About Us");
		AboutBtn.setFont(new Font("Arial Black",Font.PLAIN,12));
		AboutBtn.setBounds(660, 360, 100, 30);
		AboutBtn.setBackground(new Color(3, 98, 252));
		AboutBtn.setOpaque(true);
		AboutBtn.addMouseListener(this);
		AboutBtn.setFocusable(false);
		AboutBtn.addActionListener(this);
		panel.add(AboutBtn, JLayeredPane.DRAG_LAYER);
		
		
		
		
		
		//Swift Medaccess LABEL
		ImageIcon swiftimage = new ImageIcon("imgs\\Swift1.png");
		hos = new JLabel(swiftimage);
		hos.setSize(716,98);
		hos.setLocation(40,20);
        panel.add(hos, JLayeredPane.DRAG_LAYER);
		
		manage=new JLabel("MANAGEMENT SYSTEMS");
        manage.setForeground(Color.black);
        manage.setFont(new Font("Arial Black",Font.BOLD,25));
        manage.setBounds(230,130,1000,50);
        panel.add(manage, JLayeredPane.DRAG_LAYER);
		
		this.add(panel);
	}
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource()==DoctorBtn)
		{
			DoctorBtn.setBackground(Color.BLUE);
			DoctorBtn.setForeground(Color.WHITE);
		}
		else if(me.getSource()==ExitBtn)
		{
			ExitBtn.setBackground(Color.BLUE);
			ExitBtn.setForeground(Color.WHITE);
		}
		else if(me.getSource()==AboutBtn)
		{
			AboutBtn.setBackground(Color.BLUE);
			AboutBtn.setForeground(Color.WHITE);
		}
		else if(me.getSource()==PatientBtn)
		{
			PatientBtn.setBackground(Color.BLUE);
			PatientBtn.setForeground(Color.WHITE);
		}
		else { }

	}
	
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource()==DoctorBtn)
		{
			DoctorBtn.setBackground(Color.WHITE);
			DoctorBtn.setForeground(Color.BLACK);
		}
		else if(me.getSource()==ExitBtn)
		{
			ExitBtn.setBackground(new Color(3, 98, 252));
			ExitBtn.setForeground(Color.BLACK);
		}
		else if(me.getSource()==AboutBtn)
		{
			AboutBtn.setBackground(new Color(3, 98, 252));
			AboutBtn.setForeground(Color.BLACK);
		}
		else if(me.getSource()==PatientBtn)
		{
			PatientBtn.setBackground(Color.WHITE);
			PatientBtn.setForeground(Color.BLACK);
		}
	}
		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==PatientBtn)
			{
				PatientPage p1 = new PatientPage();
				p1.setVisible(true);
				this.setVisible(false);
			}
			else if(ae.getSource()==ExitBtn)
			{ 
				this.dispose();
			}
			else if(ae.getSource()==DoctorBtn)
			{
				DoctorPage d1 = new DoctorPage();
				d1.setVisible(true);
				this.setVisible(false);
			}
			else if(ae.getSource()==AboutBtn)
			{
				aboutus ab = new aboutus();
				ab.setVisible(true);
				this.setVisible(false);
			}
		}
}
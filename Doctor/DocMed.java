package Doctor;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;
import java.io.*;
import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.Scanner;
import java.io.InputStreamReader;
import java.util.Objects;



public class DocMed extends JFrame implements ActionListener
{
	JLabel MedicineApp,welcome;
	JLayeredPane MedicineApppanel;
	JButton back,buy;
	Color myColor;
	Font myFont;
	public DocMed()
	{
		super("Doctor Portal");
		this.setSize(800, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(MedicineApppanel);
		
		
		ImageIcon image = new ImageIcon("imgs\\logo.png");
		this.setIconImage(image.getImage());
		myColor = new Color(41, 170, 225);
		myFont = new Font(Font.SANS_SERIF, Font.BOLD,28);
		
		MedicineApppanel = new JLayeredPane();
		MedicineApppanel.setLayout(null);
		MedicineApppanel.setBounds(0,0,800,450);
		MedicineApppanel.setBackground(myColor);
		
		JLabel DEFAULT = new JLabel();
		DEFAULT.setBounds (0,0,800,450);
		DEFAULT.setOpaque(true);
		DEFAULT.setBackground(myColor);
		MedicineApppanel.add(DEFAULT, JLayeredPane.DEFAULT_LAYER);
		
		ImageIcon Medicineient = new ImageIcon("imgs\\patient.png");
		Border border = BorderFactory.createLineBorder(Color.white,12);
		MedicineApp= new JLabel(Medicineient);
		MedicineApp.setBounds(-20, -20, 320, 450);
		MedicineApp.setBorder(border);
		MedicineApp.setOpaque(true);
		MedicineApppanel.add(MedicineApp, JLayeredPane.DRAG_LAYER);	
		
		ImageIcon welcomemsg = new ImageIcon("imgs\\WelcomeDoctorLabel.png");
		welcome = new JLabel(welcomemsg);
		welcome.setBounds(390,40,300,100);
		MedicineApppanel.add(welcome, JLayeredPane.DRAG_LAYER);
		
		JLabel center = new JLabel();
		center.setOpaque(true);
		center.setBackground(new Color(204, 211, 219));
		center.setBounds(400,150,280,250);
		MedicineApppanel.add(center, JLayeredPane.PALETTE_LAYER);
	
		
		JLabel list = new JLabel("MEDICINE AVAILABLE:");
		list.setForeground(Color.black);
        list.setFont(new Font("Arial Black",Font.BOLD,19));
        list.setBounds(415,160,280,50);
        MedicineApppanel.add(list, JLayeredPane.DRAG_LAYER);
		
		
		ImageIcon iback = new ImageIcon("imgs\\back.png");
        back = new JButton(iback);
        iback.setImageObserver(back);
        back.setBounds(310, 40 , 60, 60);
        back.setBackground(Color.decode("#d1eaf0"));
		back.addActionListener(this);
        add(back);
		
		JTextArea tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(250, 180);
        tout.setLocation(415, 205);
        tout.setLineWrap(true);
		
        JScrollPane scrollPane = new JScrollPane(tout);
        try {
            // Read some text from the resource file to display in
            // the JTextArea.
            tout.read(new InputStreamReader(Objects.requireNonNull(
                    getClass().getResourceAsStream("/Data/Medicinelist.txt"))), null);
        } catch (IOException e) {
            e.printStackTrace();
        }
	
        tout.setEditable(false);
        add(tout);
		
		this.add(MedicineApppanel);
	}

	
	
	public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==back)
			{
				DoctorPortal dp1 = new DoctorPortal();
                dp1.setVisible(true);
                this.setVisible(false);
			}
			else{}
		}
	

}
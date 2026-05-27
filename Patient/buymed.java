package Patient;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
 
class buymed extends JFrame implements ActionListener
{
 
    // Components of the Form
	 File file;
	
	
	
	 FileWriter fwriter;
	
	 Scanner sc;
     Container c;
     JLabel title;
     JLabel name,PD;
     JTextField tname,cname,cno,cvv;
     JLabel Medname,Quanti;
     JComboBox Med;
     JComboBox Quantity;
	 JComboBox date;
     JComboBox year;
     JLabel add;
     JTextArea tadd;
     JRadioButton term;
     JButton sub,back;
     JButton reset;
     JTextArea tout;
     JLabel res;
     JTextArea resadd;
	 Color myColor;
 
     String Meds[]
        = { "COMET 500", "Sergel 20", "Clopid 75", "Monas 10", "Pantonix",
            "Azyth 500", "Anzitor", "Napa 60 ml", "Ace  30 ml"};
     String Quantities[]
        = { "1", "2", "3", "4", "5"};
		
	String dates[]
        = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
			
	String years[]
        = { "2023", "2024", "2025", "2026",
            "2027", "2028", "2029", "2030",
            "2031", "2032", "2034", "2035",
            "2036", "2037", "2038", "2039",
			"2040"};

public buymed()
{
		super("Medicine Portal");
		this.setSize(900, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(c);
		
		ImageIcon image = new ImageIcon("imgs\\logo.png");
		this.setIconImage(image.getImage());
		myColor = new Color(41, 170, 225);
 
        c = getContentPane();
        c.setLayout(null);
		c.setBackground(myColor);

 
        title = new JLabel("BUY MEDICINES");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);
		
		name = new JLabel("Customer Name:");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(150, 20);
        name.setLocation(100, 100);
        c.add(name);
		
		tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(250, 100);
        c.add(tname);
		
		Medname = new JLabel("Medicine Name:");
        Medname.setFont(new Font("Arial", Font.PLAIN, 20));
        Medname.setSize(150, 20);
        Medname.setLocation(100, 150);
        c.add(Medname);
		
		Med = new JComboBox(Meds);
        Med.setFont(new Font("Arial", Font.PLAIN, 15));
        Med.setSize(120, 20);
        Med.setLocation(250, 150);
        c.add(Med);
		
		Quanti = new JLabel("Quantity:");
        Quanti.setFont(new Font("Arial", Font.PLAIN, 20));
        Quanti.setSize(150, 20);
        Quanti.setLocation(100, 200);
        c.add(Quanti);
		
		Quantity = new JComboBox(Quantities);
        Quantity.setFont(new Font("Arial", Font.PLAIN, 15));
        Quantity.setSize(50, 20);
        Quantity.setLocation(250, 200);
        c.add(Quantity);
		
		PD = new JLabel("PAYMENT DETAILS:");
        PD.setFont(new Font("Arial", Font.BOLD, 20));
        PD.setSize(250, 20);
        PD.setLocation(100, 250);
        c.add(PD);
		
		JLabel cardname = new JLabel("Name in Card:");
		cardname.setFont(new Font("Arial", Font.PLAIN, 20));
		cardname.setSize(150,20);
		cardname.setLocation(100,300);
		c.add(cardname);
		
		cname = new JTextField();
        cname.setFont(new Font("Arial", Font.PLAIN, 15));
        cname.setSize(190, 20);
        cname.setLocation(250, 300);
        c.add(cname);
		
		JLabel cardno = new JLabel("Card Number:");
		cardno.setFont(new Font("Arial", Font.PLAIN, 20));
		cardno.setSize(150,20);
		cardno.setLocation(100,350);
		c.add(cardno);
		
		cno = new JTextField();
        cno.setFont(new Font("Arial", Font.PLAIN, 15));
        cno.setSize(190, 20);
        cno.setLocation(250, 350);
        c.add(cno);
		
		JLabel cardcvv = new JLabel("CVV:");
		cardcvv.setFont(new Font("Arial", Font.PLAIN, 20));
		cardcvv.setSize(150,20);
		cardcvv.setLocation(100,400);
		c.add(cardcvv);
		
		cvv = new JTextField();
        cvv.setFont(new Font("Arial", Font.PLAIN, 15));
        cvv.setSize(190, 20);
        cvv.setLocation(250, 400);
        c.add(cvv);
		
		JLabel cardexp = new JLabel("Expiry Date:");
		cardexp.setFont(new Font("Arial", Font.PLAIN, 20));
		cardexp.setSize(150,20);
		cardexp.setLocation(100,450);
		c.add(cardexp);
		
		date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(250, 450);
        c.add(date);
		
		year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setLocation(310, 450);
        c.add(year);
		
		term = new JRadioButton("Accept Terms And Conditions.");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(240, 20);
        term.setLocation(100, 480);
		term.setFocusable(false);
        c.add(term);
		
		sub = new JButton("Buy");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(100, 515);
		sub.setFocusable(false);
        sub.addActionListener(this);
        c.add(sub);
		
		reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(240, 515);
		reset.setFocusable(false);
        reset.addActionListener(this);
        c.add(reset);
		
		tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 300);
        tout.setLocation(500, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);
 
        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(500, 450);
        c.add(res);
 
        resadd = new JTextArea();
        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
        resadd.setSize(200, 75);
        resadd.setLocation(580, 175);
        resadd.setLineWrap(true);
        c.add(resadd);
		
		ImageIcon iback = new ImageIcon("imgs\\back.png");
        back = new JButton(iback);
        iback.setImageObserver(back);
        back.setBounds(10, 20 , 60, 60);
        back.setBackground(Color.decode("#d1eaf0"));
		back.addActionListener(this);
        add(back);
 
        setVisible(true);
		
}
public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub) {
            if (term.isSelected()) {
                String data
                    = "Customer Name : "
                      + tname.getText() + "\n";
                String data1
                    = "Medicine Name : "
                      + (String)Med.getSelectedItem()
                      + "\nQuantity :" + (String)Quantity.getSelectedItem()
                      + "\n";
				String data2
                    = "Card Name : "
                      +cname.getText()+"\n"+ "Card Number : "+cno.getText()+
					  "\n"+"Cvv : "+cvv.getText()+"\n";
				String data3
                    = "Expiration Date : "
                      + (String)date.getSelectedItem()
                      + "/" + (String)year.getSelectedItem()
                      + "\n";
                tout.setText(data + data1 + data2 + data3);
                tout.setEditable(false);
                res.setText("Thank you for purchasing!");
			}
				
				else {
                tout.setText("");
                resadd.setText("");
                res.setText("Please accept the"
                            + " terms & conditions..");
            }
        }
 
        else if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
            cname.setText(def);
            cno.setText(def);
			cvv.setText(def);
            res.setText(def);
            tout.setText(def);
            term.setSelected(false);
            date.setSelectedIndex(0);
			Med.setSelectedIndex(0);
            Quantity.setSelectedIndex(0);
            year.setSelectedIndex(0);
            resadd.setText(def);
        }
		else if(e.getSource()==back)
			{
				MedicineApp Hp = new MedicineApp();
				Hp.setVisible(true);
				this.setVisible(false);
			}
	}


	public static void main(String args[])
	{
		buymed b = new buymed();
		b.setVisible(true);
	}
}
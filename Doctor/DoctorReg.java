package Doctor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
 
class DoctorReg
    extends JFrame
    implements ActionListener {
 
    // Components of the Form
	 File file;
	
	
	
	 FileWriter fwriter;
	
	 Scanner sc;
     Container c;
     JLabel title;
     JLabel name;
     JTextField tname;
     JLabel pass;
     JPasswordField tpass;
     JLabel gender;
     JRadioButton male;
     JRadioButton female;
     ButtonGroup gengp;
     JLabel dob;
     JComboBox date;
     JComboBox month;
     JComboBox year;
     JLabel add;
     JTextArea tadd;
     JCheckBox term;
     JButton sub,back;
     JButton reset;
     JTextArea tout;
     JLabel res;
     JTextArea resadd;
	 Color myColor;
 
     String dates[]
        = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
     String months[]
        = { "Jan", "Feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sep", "Oct", "Nov", "Dec" };
     String years[]
        = { "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019" };
 
    // constructor, to initialize the components
    // with default values.
    public DoctorReg()
    {
        super("Doctor Portal");
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
		
 
        title = new JLabel("Registration Form");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);
 
        name = new JLabel("Name");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        c.add(name);
 
        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(200, 100);
        c.add(tname);
	
 
        pass = new JLabel("Password");
        pass.setFont(new Font("Arial", Font.PLAIN, 20));
        pass.setSize(100, 20);
        pass.setLocation(100, 150);
        c.add(pass);
 
        tpass = new JPasswordField();
        tpass.setFont(new Font("Arial", Font.PLAIN, 15));
        tpass.setSize(150, 20);
        tpass.setLocation(200, 150);
        c.add(tpass);
 
        gender = new JLabel("Gender");
        gender.setFont(new Font("Arial", Font.PLAIN, 20));
        gender.setSize(100, 20);
        gender.setLocation(100, 200);
        c.add(gender);
 
        male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(200, 200);
        c.add(male);
 
        female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(275, 200);
        c.add(female);
 
        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);
 
        dob = new JLabel("DOB");
        dob.setFont(new Font("Arial", Font.PLAIN, 20));
        dob.setSize(100, 20);
        dob.setLocation(100, 250);
        c.add(dob);
 
        date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(200, 250);
        c.add(date);
 
        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setLocation(250, 250);
        c.add(month);
 
        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setLocation(320, 250);
        c.add(year);
 
        add = new JLabel("Department");
        add.setFont(new Font("Arial", Font.PLAIN, 18));
        add.setSize(100, 20);
        add.setLocation(100, 300);
        c.add(add);
 
        tadd = new JTextArea();
        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        tadd.setSize(200, 75);
        tadd.setLocation(200, 300);
        tadd.setLineWrap(true);
        c.add(tadd);
 
        term = new JCheckBox("Accept Terms And Conditions.");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(150, 400);
        c.add(term);
 
        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 450);
        sub.addActionListener(this);
        c.add(sub);
 
        reset = new JButton("Reset");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 450);
        reset.addActionListener(this);
        c.add(reset);
 
        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 400);
        tout.setLocation(500, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);
 
        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(100, 500);
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
 
    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub) {
            if (term.isSelected()) {
                String data1;
                String data
                    = "Name : "
                      + tname.getText() + "\n"
                      + "Password : "
                      + new String(tpass.getPassword()) + "\n";
                if (male.isSelected())
                    data1 = "Gender : Male"
                            + "\n";
                else
                    data1 = "Gender : Female"
                            + "\n";
                String data2
                    = "DOB : "
                      + (String)date.getSelectedItem()
                      + "/" + (String)month.getSelectedItem()
                      + "/" + (String)year.getSelectedItem()
                      + "\n";
 
                String data3 = "Department : " + tadd.getText();
                tout.setText(data + data1 + data2 + data3);
                tout.setEditable(false);
                res.setText("Registration Successfully..");
				
				String name = tname.getText();
				String pass = new String(tpass.getPassword());
				String gender = data1;
				String department = tadd.getText();
				DoctorAccount account=new DoctorAccount(name,pass,gender,department);
				account.addaccount();
				
				try
				{
					file= new File("Data\\doclist.txt");
			
					file.createNewFile();
			
					fwriter= new FileWriter(file,true);
			
					fwriter.write(tname.getText()+"\t");
			
					fwriter.write(tadd.getText()+"\n");
			
					fwriter.flush();
					fwriter.close();		
				}
				catch(IOException ioe)
				{
					ioe.printStackTrace();
				}
				
				
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
            tadd.setText(def);
            tpass.setText(def);
            res.setText(def);
            tout.setText(def);
            term.setSelected(false);
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
            resadd.setText(def);
        }
		else if(e.getSource()==back)
			{
				DoctorPage d1 = new DoctorPage();
				d1.setVisible(true);
				this.setVisible(false);
			}
    }
	}
package Homepage;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class aboutus extends JFrame implements ActionListener
{
	JButton back;
	JLayeredPane panel;
	Color myColor;
	Font myFont;
	
	public aboutus()
	{
		super("About Us");
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
		
		ImageIcon background = new ImageIcon("imgs\\aboutus.png");
		JLabel DEFAULT = new JLabel(background);
		DEFAULT.setBounds (0,0,800,450);
		DEFAULT.setOpaque(true);
		panel.add(DEFAULT, JLayeredPane.DEFAULT_LAYER);
		
		ImageIcon iback = new ImageIcon("imgs\\back.png");
        back = new JButton(iback);
        iback.setImageObserver(back);
        back.setBounds(10, 20 , 60, 60);
        back.setBackground(Color.decode("#d1eaf0"));
		back.addActionListener(this);
        add(back);
		
		
		this.add(panel);
		
		
	}
		
		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==back)
			{
				Homepage Hp = new Homepage();
				Hp.setVisible(true);
				this.setVisible(false);
			}
		}
}
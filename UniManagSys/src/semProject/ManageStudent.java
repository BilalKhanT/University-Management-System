package semProject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class ManageStudent extends JFrame implements ActionListener
{
	JButton add = new JButton("ADD STUDENT");
	JButton remove = new JButton("REMOVE STUDENT");
	ManageStudent()
	{
		Font  f = new Font("serif", Font.BOLD, 40);
		JPanel heading = new JPanel ();
	    heading. setBackground (new Color(0,0,0,100));
	    heading.setBounds (0, 0, 900, 70);
	    JLabel name = new JLabel ("MANAGE STUDENTS");
	    name.setForeground (Color.white);
	    name.setFont(f);
	    heading.add(name);
	    
	    JPanel admin = new JPanel();
	    admin.setLayout(null);
	    admin.setSize(400, 350);
	    admin.setBackground(new Color(0, 0, 0, 100));
	    admin.setBounds(200, 100, 480, 420);
	    
	    Font  font = new Font("serif", Font.BOLD, 15);
	    add.setBackground(Color.black);
	    add.setForeground(Color.white);
	    add.setBounds(150,120,200,50);
	    add.setFont(font);
	    
	    remove.setBackground(Color.black);
	    remove.setForeground(Color.white);
	    remove.setBounds(150,280,200,50);
	    remove.setFont(font);
	    
	    admin.add(add);
	    admin.add(remove);
	    
	    setSize(900, 600);
		setLayout(null);
		
		ImageIcon backgroundImg = new ImageIcon("teacher.jpg");
		Image image = backgroundImg.getImage();
		Image tempImage = image.getScaledInstance(900, 600, Image.SCALE_SMOOTH);
		backgroundImg = new ImageIcon(tempImage);
		JLabel background = new JLabel("", backgroundImg, JLabel.CENTER);
		background.add(admin);
		background.add(heading);
		background.setBounds(0, 0, 900, 600);
		add(background);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
	}
	
}

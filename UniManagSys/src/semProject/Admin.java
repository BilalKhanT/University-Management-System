package semProject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class Admin extends JFrame implements ActionListener
{
	JButton teacher = new JButton("MANAGE TEACHER");
	JButton student = new JButton("MANAGE STUDENT");
	Admin()
	{
		Font  f = new Font("serif", Font.BOLD, 40);
		JPanel heading = new JPanel ();
	    heading. setBackground (new Color(0,0,0,100));
	    heading.setBounds (0, 0, 900, 70);
	    JLabel name = new JLabel ("ADMIN PORTAL");
	    name.setForeground (Color.white);
	    name.setFont(f);
	    heading.add(name);
	    
	    JPanel admin = new JPanel();
	    admin.setLayout(null);
	    admin.setSize(400, 350);
	    admin.setBackground(new Color(0, 0, 0, 100));
	    admin.setBounds(260, 180, 380, 250);
	    
	    //Buttons
	    Font  font = new Font("serif", Font.BOLD, 15);
	    teacher.setBackground(Color.black);
	    teacher.setForeground(Color.white);
	    teacher.setBounds(100,30,200,50);
	    teacher.addActionListener(this);
	    teacher.setFont(font);
	    
	    student.setBackground(Color.black);
	    student.setForeground(Color.white);
	    student.setBounds(100,100,200,50);
	    student.addActionListener(this);
	    student.setFont(font);
	    
	    admin.add(teacher);
	    admin.add(student);
	    
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
		if (e.getSource() == teacher)
		{
			ManageTeacher teacher = new ManageTeacher();
		}
		else if (e.getSource() == student)
		{
			ManageStudent student = new ManageStudent();
		}
		
	}
}




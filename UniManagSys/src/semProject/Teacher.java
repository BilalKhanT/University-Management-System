package semProject;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.font.*;
import java.awt.Image;
import java.awt.event.ActionEvent;

class gui2 extends JFrame implements ActionListener
{
	JButton addMarks = new JButton("ADD MARKS");
	JButton addAttendance = new JButton("VIEW MARKS");
	JButton viewMarks = new JButton("VIEW MARKS");
	JButton viewAttendance = new JButton("VIEW ATTENDANCE");
	
	gui2()
	{
		Font  f = new Font("serif", Font.BOLD, 40);
		JPanel heading = new JPanel ();
	    heading. setBackground (new Color(0,0,0,100));
	    heading.setBounds (0, 0, 900, 70);
	    JLabel name = new JLabel ("TEACHER PORTAL");
	    name.setForeground (Color.white);
	    name.setFont(f);
	    heading.add(name);
	    
	    JPanel login = new JPanel();
	    login.setLayout(null);
	    login.setSize(400, 350);
	    login.setBackground(new Color(0, 0, 0, 100));
	    login.setBounds(200, 100, 480, 420);
	    
	    //BUTTONS
	    Font  font = new Font("serif", Font.BOLD, 15);
	    
	    addMarks.setBackground(Color.black);
	    addMarks.setForeground(Color.white);
	    addMarks.setBounds(150,40,200,50);
	    addMarks.setFont(font);
	    
	    
	    addAttendance.setBackground(Color.black);
	    addAttendance.setForeground(Color.white);
	    addAttendance.setBounds(150,120,200,50);
	    addAttendance.setFont(font);
	    
	    
	    viewMarks.setBackground(Color.black);
	    viewMarks.setForeground(Color.white);
	    viewMarks.setBounds(150,200,200,50);
	    viewMarks.setFont(font);
	    
	    viewAttendance.setBackground(Color.black);
	    viewAttendance.setForeground(Color.white);
	    viewAttendance.setBounds(150,280,200,50);
	    viewAttendance.setFont(font);
	    
	    login.add(addMarks);
	    login.add(addAttendance);
	    login.add(viewMarks);
	    login.add(viewAttendance);
	    
	    //Buttons
	    
	    setSize(900, 600);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ImageIcon backgroundImg = new ImageIcon("teacher.jpg");
		Image image = backgroundImg.getImage();
		Image tempImage = image.getScaledInstance(900, 600, Image.SCALE_SMOOTH);
		backgroundImg = new ImageIcon(tempImage);
		JLabel background = new JLabel("", backgroundImg, JLabel.CENTER);
		background.add(login);
		background.add(heading);
		background.setBounds(0, 0, 900, 600);
		add(background);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource() == addMarks)
		{
			
		}
		else if (e.getSource() == addAttendance)
		{
			
		}
		else if (e.getSource() == viewMarks)
		{
			
		}
		else if (e.getSource() == viewAttendance)
		{
			
		}
	}
	
}

public class Teacher {

	public static void main(String[] args) {
		gui2 aa = new gui2();

	}

}

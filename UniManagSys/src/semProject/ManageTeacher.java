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
import javax.swing.JTextField;

class ManageTeacher extends JFrame implements ActionListener
{
	JButton add = new JButton("ADD TEACHER");
	JButton remove = new JButton("REMOVE TEACHER");
	ManageTeacher()
	{
		Font  f = new Font("serif", Font.BOLD, 40);
		JPanel heading = new JPanel ();
	    heading. setBackground (new Color(0,0,0,100));
	    heading.setBounds (0, 0, 900, 70);
	    JLabel name = new JLabel ("MANAGE TEACHERS");
	    name.setForeground (Color.white);
	    name.setFont(f);
	    heading.add(name);
	    
	    JPanel admin = new JPanel();
	    admin.setLayout(null);
	    admin.setSize(400, 350);
	    admin.setBackground(new Color(0, 0, 0, 100));
	    admin.setBounds(260, 180, 380, 250);
	    
	    Font  font = new Font("serif", Font.BOLD, 15);
	    add.setBackground(Color.black);
	    add.setForeground(Color.white);
	    add.setBounds(100,30,200,50);
	    add.addActionListener(this);
	    add.setFont(font);
	    
	    remove.setBackground(Color.black);
	    remove.setForeground(Color.white);
	    remove.setBounds(100,100,200,50);
	    remove.addActionListener(this);
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
		if (e.getSource() == add)
		{
			AddTeacher add = new AddTeacher();
		}
		else if (e.getSource() == remove)
		{
			
		}
		
	}
}

class AddTeacher extends JFrame implements ActionListener
{
	JButton addTeacher = new JButton("ADD ENTRY");
    JTextField TfPassword = new JTextField();
    JTextField TfUsername = new JTextField();
	AddTeacher()
	{
		Font  f = new Font("serif", Font.BOLD, 40);
		JPanel heading = new JPanel ();
	    heading. setBackground (new Color(0,0,0,100));
	    heading.setBounds (0, 0, 900, 70);
	    JLabel name = new JLabel ("ADD TEACHERS");
	    name.setForeground (Color.white);
	    name.setFont(f);
	    heading.add(name);
	    
	    JPanel admin = new JPanel();
	    admin.setLayout(null);
	    admin.setSize(400, 350);
	    admin.setBackground(new Color(0, 0, 0, 100));
	    admin.setBounds(200, 150, 480, 320);
	    
	    //
	    Font  fLabelInsert = new Font("serif", Font.BOLD, 17);
	    JLabel labelUsername = new JLabel ("USERNAME");
	    labelUsername.setFont(fLabelInsert);
	    labelUsername.setForeground(Color.white);
	    labelUsername.setBounds(50,50,300, 50);
	    labelUsername.setBackground(Color.black);
	    admin.add(labelUsername);
	    
	    TfUsername.setBounds(150, 50, 290, 50);
	    TfUsername.setBackground(new Color(36, 37, 42));
	    TfUsername.setForeground(Color.white);
	    admin.add(TfUsername);
	    
	    JLabel labelPassword = new JLabel ("PASSWORD");
	    labelPassword.setFont(fLabelInsert);
	    labelPassword.setForeground(Color.white);
	    labelPassword.setBounds(50,120,300, 50);
	    labelPassword.setBackground(Color.black);
	    admin.add(labelPassword);
	    

	    TfPassword.setBounds(150, 120, 290, 50);
	    TfPassword.setBackground(new Color(36, 37, 42));
	    TfPassword.setForeground(Color.white);
	    admin.add(TfPassword);
	    
	    addTeacher.setBackground(Color.black);
	    addTeacher.setForeground(Color.white);
	    addTeacher.setBounds(170, 200, 150, 50);
	    addTeacher.setFont(fLabelInsert);
	    addTeacher.addActionListener(this);
	    admin.add(addTeacher);
	    
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
		if (e.getSource() == addTeacher)
		{
			Accounts register = new Accounts (TfUsername.getText(), TfPassword.getText());
			register.AddTeacher();
			register.AddTeacherPass();
		}
		
	}
	
}



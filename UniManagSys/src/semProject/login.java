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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



public class login extends JFrame implements ActionListener
{
	JButton loginButton = new JButton ("LOGIN");
	JButton resetButton = new JButton ("RESET");
	JPasswordField password = new JPasswordField();
    JTextField username = new JTextField();
    JCheckBox showPassword = new JCheckBox("SHOW PASSWORD");
	
	String usernames = "Bilal";
	String passwords = "Khan";
	
	login()
	{
		
		Font  f = new Font("serif", Font.BOLD, 40);
		JPanel heading = new JPanel ();
	    heading. setBackground (new Color(0,0,0,80));
	    heading.setBounds (0, 0, 900, 70);
	    JLabel name = new JLabel ("UNIVERSITY PORTAL");
	    name.setForeground (Color.white);
	    name.setFont(f);
	    heading.add(name);
	    
	    JPanel login = new JPanel();
	    login.setLayout(null);
	    login.setSize(400, 350);
	    login.setBackground(new Color(0, 0, 0, 60));
	    login.setBounds(200, 175, 500, 350);
	    
	    Font  flabel = new Font("serif", Font.BOLD, 17);
	    JLabel usernameL = new JLabel ("ENTER USERNAME");
	    usernameL.setFont(flabel);
	    usernameL.setForeground(Color.white);
	    usernameL.setBounds(10,50,300, 50);
	    usernameL.setBackground(new Color(36, 37, 42));
	    login.add(usernameL);
	    

	    username.setBounds(180, 50, 290, 50);
	    username.setBackground(new Color(36, 37, 42));
	    username.setForeground(Color.white);
	    login.add(username);
	    
	    Font  flabel2 = new Font("serif", Font.BOLD, 17);
	    JLabel passwordL = new JLabel ("ENTER PASSWORD");
	    passwordL.setFont(flabel);
	    passwordL.setForeground(Color.white);
	    passwordL.setBounds(10,150,300, 50);
	    passwordL.setBackground(new Color(36, 37, 42));
	    login.add(passwordL);
	    
	    
	    password.setBounds(180, 150, 290, 50);
	    password.setBackground(new Color(36, 37, 42));
	    password.setForeground(Color.white);
	    login.add(password);
	    
	    Font  f1 = new Font("serif", Font.BOLD, 15);
	    loginButton.setForeground(Color.white);
	    loginButton.setFont(f1);
	    loginButton.setBounds(50,280,150,50);
	    loginButton.setBackground(new Color (36, 37, 42));
	    loginButton.addActionListener(this);
	    login.add(loginButton);
	    
	    resetButton.setForeground(Color.white);
	    resetButton.setFont(f1);
	    resetButton.setBounds(320,280,150,50);
	    resetButton.setBackground(new Color (36, 37, 42));
	    resetButton.addActionListener(this);
	    login.add(resetButton);
	    
	    showPassword.setBounds(200,220,150,40);
	    showPassword.setBackground(Color.black);
	    showPassword.setForeground(Color.white);
	    showPassword.addActionListener(this);
	    login.add(showPassword);
		
		setSize(900, 600);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		ImageIcon backgroundImg = new ImageIcon("bg.jpg");
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
		if (e.getSource() == loginButton)
		{
			Accounts account = new Accounts();
			ArrayList<String> teacherName = account.getTeacherName();
			ArrayList<String> studentName = account.getStudentName();
			ArrayList<String> teacherPassword = account.getTeacherPassword();
			ArrayList<String> studentPassword = account.getStudentPassword();
			if(username.getText().equals(teacherName.get(0)))
				if(String.valueOf(password.getPassword()).equals(teacherPassword.get(0)))
				{
					Admin a = new Admin();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "INCORRECT PASSWORD", "Contact Saved Info", JOptionPane.ERROR_MESSAGE);
				}
			else if (username.getText().equals(teacherName.get(1)))
				if (String.valueOf(password.getPassword()).equals(teacherPassword.get(1)))
				{
					Admin a = new Admin();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "INCORRECT PASSWORD", "Contact Saved Info", JOptionPane.ERROR_MESSAGE);
				}
			else
			{
				JOptionPane.showMessageDialog(null, "INCORRECT EMAIL ","Contact Saved Info", JOptionPane.ERROR_MESSAGE);
			}
				
		}
		else if (e.getSource() == resetButton) 
		{
            username.setText("");
            password.setText("");
        }
		else if (e.getSource() == showPassword) 
		{
            if (showPassword.isSelected()) 
            {
                 password.setEchoChar((char) 0);
            }else 
            {
                password.setEchoChar('*');
            }
		
		}
}

	public static void main(String[] args) 
	{
		login a = new login();
		//ManageTeacher a = new ManageTeacher();

	}

}

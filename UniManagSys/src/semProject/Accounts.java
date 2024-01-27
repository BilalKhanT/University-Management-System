package semProject;

import java.util.ArrayList;

public class Accounts extends Registeration
{
	
	static ArrayList<String> teacherName = new ArrayList<String>();
	static ArrayList<String> studentName = new ArrayList<String>();
	static ArrayList<String> teacherPassword = new ArrayList<String>();
	static ArrayList<String> studentPassword = new ArrayList<String>();
	
	Accounts()
	{
		teacherName.add("Fazila Shams");
		teacherPassword.add("password");
		studentName.add("Bilal");
		studentPassword.add("password");
	}
	
	Accounts(String userName, String password)
	{
		super(userName, password);
	}
	
	@Override
	public void AddStudent() 
	{
		studentName.add(getUserName());
	}
	
	@Override
	public void AddTeacher() 
	{
		teacherName.add(getUserName());
		
	}
	
	@Override
	public void AddStudentPass() 
	{
		studentPassword.add(getPassword());	
	}

	@Override
	public void AddTeacherPass() 
	{
		teacherPassword.add(getPassword());
	}
	
	public ArrayList<String> getTeacherName()
	{
		return teacherName;	
	}
	
	public ArrayList<String> getTeacherPassword()
	{
		return teacherPassword;
	}
	
	public ArrayList<String> getStudentName()
	{
		return studentName;	
	}
	
	public ArrayList<String> getStudentPassword()
	{
		return studentPassword;	
	}

	

}

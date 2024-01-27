package semProject;

public abstract class Registeration 
{
	String userName;
	String password;
	
	Registeration()
	{}
	
	Registeration(String userName, String password)
	{
		this.userName = userName;
		this.password = password;
	}
	
	public String getUserName() 
	{
		return userName;
	}

	public void setUserName(String userName) 
	{
		this.userName = userName;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}
	
	abstract public void AddStudent();
	abstract public void AddTeacher();
	abstract public void AddStudentPass();
	abstract public void AddTeacherPass();



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package business.model.user;

import java.time.LocalDate;

public class User {
	
	LocalDate currentDate = LocalDate.now();
	
	private final int MAXNAMECHAR = 225;
	
	private final int MINPASSCHAR = 8;
	private final int MAXPASSCHAR = 18;
	
	private final int MINYEAR = 1000;
	private final int MAXYEAR = currentDate.getYear();
	
	private int userId;
	private String firstname;
	private String lastname;
	private String DOB;
	private String email;
	private String password;
	
	public User() {}
	
	public User(int id, String fn, String ln, String dob, String email, String password)
	{
		setUserId(id);
		setFirstname(fn);
		setLastname(ln);
		setDOB(dob);
		setEmail(email);
		setPassword(password);
	}
	
	// Setters
	
	public void setUserId(int id)
	{
		if(id >= 0)
		{
			userId = id;
		}
		else
		{
			System.out.println("User id must be greater than 0!");
		}
	}
	
	public void setFirstname(String fn)
	{
		if(fn.length() > 0 && fn.length() < MAXNAMECHAR)
		{
			firstname = fn;
		}
		else
		{
			System.out.println("Given name must be greater than 0 and less than " + MAXNAMECHAR);
		}
	}
	
	public void setLastname(String ln)
	{
		if(ln.length() > 0 && ln.length() < MAXNAMECHAR)
		{
			lastname = ln;
		}
		else
		{
			System.out.println("Surname must be greater than 0 and less than " + MAXNAMECHAR);
		}
	}
	
	public void setDOB(String dob)
	{
		int year, month, day;
		
		year = Integer.parseInt(dob.substring(0, dob.indexOf('-')));
		month = Integer.parseInt(dob.substring(dob.indexOf('-'), dob.lastIndexOf('-')));
		day = Integer.parseInt(dob.substring(dob.lastIndexOf('-')));
		
		if((year > MINYEAR && year < MAXYEAR) && (month > 0 && month <= 12) && (day > 0 && day <= 31))
		{
			DOB = dob;
		}
		else
		{
			System.out.println("Date of birth accepted values:\nYear must be greater than " + MINYEAR + " and less than current year!\nMonth and day must be within the range of current calendar!");
		}
	}
	
	public void setEmail(String email)
	{
		if(email.length() > 0 && email.length() < MAXNAMECHAR)
		{
			this.email = email;
		}
		else
		{
			System.out.println("Email must be greater than 0 and less than " + MAXNAMECHAR);
		}
	}
	
	public void setPassword(String password)
	{
		if(password.length() >= MINPASSCHAR && password.length() <= MAXPASSCHAR)
		{
			this.password = password;
		}
		else
		{
			System.out.println("Password must be greater than " + MINPASSCHAR + " and less than " + MAXPASSCHAR);
		}
	}

	// Getters
	
	public int getUserId()
	{
		return userId;
	}
	
	public String getFirstname()
	{
		return firstname;
	}
	
	public String getLastname()
	{
		return lastname;
	}
	
	public String getDOB()
	{
		return DOB;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	public String getPassword()
	{
		return password;
	}

	public String toString()
	{
		return "User Id: " + userId + "\nGiven Name: " + firstname + "\nSurname: " + lastname + "\nDate of Birth: " + DOB + "\nEmail: " + email + "\nPassword: " + password;
	}
}

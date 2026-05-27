package Doctor;

import java.lang.*;
import java.util.*;
import java.io.*;

public class DoctorAccount
{
	private String username;
	private String pass;
	private String gender;
	private String department;
	
	private File file;
	
	
	
	private FileWriter fwriter;
	private FileReader reader;		//to read from a file
	private BufferedReader bfr;
	
	private Scanner sc;
	
	public DoctorAccount()
	{
		this.username="";
	}
	
	public DoctorAccount(String username,String pass, String gender, String department)
	{
		this.username=username;
		this.pass=pass;	
		this.gender=gender;
		this.department=department;
	}
	
	public void setusername(String username)
	{
		this.username=username;
	}
	public void setpass(String pass)
	{
		this.pass=pass;
	}
	public String getusername()
	{
		return username;
	}
	
	public String getpass()
    {
		return pass;
	}
	
	
	public String getgender()
	{
		return gender;
	}
	public String getdepartment()
	{
		return department;
	}
	
	
	public void addaccount()
	{
		try
		{
			file= new File("Data\\data2.txt");
			
			file.createNewFile();
			
			fwriter= new FileWriter(file,true);
			
			fwriter.write(getusername()+"\t");
			
			fwriter.write(getpass()+"\n");
			
			fwriter.flush();
			fwriter.close();		
		}
		catch(IOException ioe)
		{
		ioe.printStackTrace();
		}
	}
	
	public boolean getAccount(String username,String pass)
	{
		boolean isAuth = false;
		file = new File("Data\\data2.txt");
		
		try
		{
			sc = new Scanner(file);
			
			while(sc.hasNextLine())
			{
				String line= sc.nextLine();
				if(line.trim().isEmpty()) continue;
				String[] value=line.split("\t");
				if(value.length < 2) continue;

				if(value[0].equals(username)&& value[1].equals(pass))
				{
					isAuth=true;
					break;
				}
			}
		}
		
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		
		return isAuth;
	}
	
}
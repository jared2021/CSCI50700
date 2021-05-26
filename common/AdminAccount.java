package CSCI50700.common;

import java.lang.String;
import java.rmi.*;

public class AdminAccount extends EmployeeAccount{

	private String userName;
	private String password;
	private String address;
	private int phoneNumber;
	
	public AdminAccount(String userName, String password, String address, int phoneNumber)
	{
		super(userName, password, address, phoneNumber);
	}

	public void updateDescription()
	{
		//code to be implemented in the future
	}

	public void addAdmin()
	{
		//code to be implemented in the future
	}

	public void addClientAccount()
	{
		//code to be implemented in the future
	}

	public void removeClientAccount()
	{
		//code to be implemented in the future
	}

	public void updatePrice()
	{
		//code to be implemented in the future
	}
}

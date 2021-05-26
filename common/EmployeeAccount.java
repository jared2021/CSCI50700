package CSCI50700.common;

import java.rmi.*;
import java.lang.String;

public class EmployeeAccount{

	private String userName;
	private String password;
	private String address;
	private int phoneNumber;

	public EmployeeAccount(String userName, String password, String address, int phoneNumber)
	{
		this.userName = userName;
		this.password = password;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public String getUserName()
	{
		return userName;
	}

	public String getPassword()
	{
		return password;
	}

	public String getAddress()
	{
		return address;
	}

	public int getPhoneNumber()
	{
		return phoneNumber;
	} 

	public void roomOccupied()
	{
		//code to be implemented in the future
	}

	public void roomUnoccupied()
	{
		//code to be implemented in the future
	}
}

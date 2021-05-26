package CSCI50700.common;

import java.rmi.*;
import java.lang.String;

public class ClientAccount{

	private String userName;
	private String password;
	private String address;
	private int phoneNumber;
	private int creditCard;

	public ClientAccount(String userName, String password, String address, int phoneNumber, int creditCard)
	{
		this.userName = userName;
		this.password = password;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.creditCard = creditCard;
	}

	public String getUserName()
	{
		return userName;
	}

	public String getPassword()
	{
		return password;
	}

	public  String getAddress()
	{
		return address;
	}

	public int getPhoneNumber()
	{
		return phoneNumber;
	}

	public  int getCreditCard()
	{
		return creditCard;
	}
}

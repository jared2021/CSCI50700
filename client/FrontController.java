package CSCI50700.client;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.Serializable;
import CSCI50700.common.*;

public class FrontController{

	private String name;
	private Connection stub;

	public FrontController()
	{
		try{
			name = "//in-csci-rrpc01:2631/HotelRegistration";
			stub = (Connection)Naming.lookup(name);
		}
		catch(Exception e)
		{
			System.out.println("Client err: " +e.getMessage());
			e.printStackTrace();
		}
	}

	public String checkCredentials(ArrayList<String> items)
	{
		if(items.get(0).equals("login"))
		{
			try{
				items.remove(0);
				return stub.checkCredentials(items);
			}
			catch(Exception e){
				System.out.println("Client err: " +e.getMessage());
				e.printStackTrace();
			}
		}
		return "wrong role";
	}
}


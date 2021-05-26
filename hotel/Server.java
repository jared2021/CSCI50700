package CSCI50700.hotel;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import CSCI50700.common.*;

public class Server extends UnicastRemoteObject implements Connection{

	private ClientAccount account;
	private EmployeeAccount employee;
	private AdminAccount admin;

	private ArrayList<AdminAccount> adminAccounts;
	private ArrayList<EmployeeAccount> employeeAccounts;
	private ArrayList<ClientAccount> clientAccounts;

	private Command checkCredentialsCommand;

	public Server() throws RemoteException
	{
		account = new ClientAccount("Jared", "Jarbear", "123 Something Road", 1234567890, 423109013);
		employee = new EmployeeAccount ("Austin", "Patt", "537 Boulevard", 567312489);
		admin = new AdminAccount("Eli", "Folgers", "90 West Street", 315235890);

		adminAccounts = new ArrayList<AdminAccount>();
		employeeAccounts = new ArrayList<EmployeeAccount>();
		clientAccounts = new ArrayList<ClientAccount>();
		
		adminAccounts.add(admin);
		employeeAccounts.add(employee);
		clientAccounts.add(account);

	}
	
	public String checkCredentials(ArrayList<String> items)
	{
		try{
			checkCredentialsCommand = new CheckCredentialsCommand(adminAccounts,employeeAccounts,clientAccounts);
			return checkCredentialsCommand.execute(items);
		}
		catch(Exception e)
		{
			System.out.println("Server err: "+e.getMessage());
			e.printStackTrace();
		}
		return "something went wrong";
	}

	public static void main(String args[])
	{
		try{
			Connection login = new Server();
			String name ="//in-csci-rrpc01:2631/HotelRegistration";
			Naming.rebind(name,login);
			System.out.println("Server is ready");
		}catch(Exception e)
		{
			System.out.println("Server err:"+e.getMessage());
			e.printStackTrace();
		}
	}

}

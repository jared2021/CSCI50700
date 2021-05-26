package CSCI50700.hotel;

import java.util.ArrayList;
import CSCI50700.common.*;

public class CheckCredentialsCommand implements Command{

	private ArrayList <AdminAccount> adminAccounts;
	private ArrayList <EmployeeAccount> employeeAccounts;
	private ArrayList <ClientAccount> clientAccounts;

	public CheckCredentialsCommand(ArrayList <AdminAccount> adminAccounts, ArrayList <EmployeeAccount> employeeAccounts, ArrayList <ClientAccount> clientAccounts)
	{
		this.adminAccounts = adminAccounts;
		this.employeeAccounts = employeeAccounts;
		this.clientAccounts = clientAccounts;
	}

	@Override
	public String execute(ArrayList<String> items)
	{
		for(int i = 0; i<adminAccounts.size();i++)
		{
			if(items.get(0).equals(adminAccounts.get(i).getUserName()) && items.get(1).equals(adminAccounts.get(i).getPassword()))
			{
				return "admin";
			}
		}
		for(int i =0; i<employeeAccounts.size();i++)
		{
			if(items.get(0).equals(employeeAccounts.get(i).getUserName()) && items.get(1).equals(employeeAccounts.get(i).getPassword()))
			{
				return "employee";
			}
		}
		for(int i = 0; i<clientAccounts.size();i++)
		{
			if(items.get(0).equals(clientAccounts.get(i).getUserName()) && items.get(1).equals(clientAccounts.get(i).getPassword()))
			{
				return "client";
			}
		}
		return "none";
	}
}

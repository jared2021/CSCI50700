package CSCI50700.client;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.Serializable;
import CSCI50700.common.*;

public class Client{

	public static void main(String args[]){
		try{
			Scanner readObj = new Scanner(System.in);

			System.out.println("Welcome to our hotel registration site!");
			String input ="-1";
			String userName = "";
			String password = "";
			String role = "login";

			FrontController controller = new FrontController();

			ArrayList<String> items = new ArrayList<String>();

			while(!input.equals("0")&&!input.equals("zero"))
			{
				System.out.println("1. Log in");
				System.out.println("0. Exit program");
				input = readObj.next();
				if(input.equals("1")||input.equals("one"))
				{
					System.out.println("Please type in your username");
					userName = readObj.next();
					System.out.println("Please type in your password");
					password = readObj.next();
					items.add(role);
					items.add(userName);
					items.add(password);
					if(controller.checkCredentials(items).equals("client"))
					{
						role = "client";
						System.out.println("Welcome back" + userName + " how can we help you?");
					}
					else if(controller.checkCredentials(items).equals("employee"))
					{
						role = "employee";
						System.out.println("Thanks for clocking in " + userName + " ready to get to work?");
					}
					else if(controller.checkCredentials(items).equals("admin"))
					{
						role="admin";
						System.out.println("Thanks for clocking in " + userName + " ready to get to work?");
					}
					else
					{
						System.out.println("Incorrect username or password");
					}
					/*if(stub.checkCredentials(userName,password).equals("client"))
					{
						System.out.println("Welcome back " + userName + "how can we help you?");
					}
					else if(stub.checkCredentials(userName,password).equals("employee"))
					{
						System.out.println("Thanks for clocking in " + userName + " ready to get to work?");
					}
					else if(stub.checkCredentials(userName,password).equals("admin"))
					{
						System.out.println("Thanks for clocking in admin " + userName + " ready to get to work?");
					}
					else
					{
						System.out.println("Incorrect username or password");
					}*/
				}
			}
		}
		catch(Exception e){
			System.out.println("Client err : "+e.getMessage());
			e.printStackTrace();
		}
	}
}

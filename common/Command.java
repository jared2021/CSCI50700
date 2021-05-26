package CSCI50700.common;

import java.util.ArrayList;
import java.rmi.*;

public interface Command extends Remote
{
	public String execute(ArrayList<String> items) throws RemoteException;
}

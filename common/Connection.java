package CSCI50700.common;

import java.lang.String;
import java.util.ArrayList;
import java.rmi.*;

public interface Connection extends Remote{

	public String checkCredentials(ArrayList<String> items) throws RemoteException;
}

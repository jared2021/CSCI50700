# CSCI-50700

../client/Client.java Serves as the view in MVC that allows the client to communicate with the server through the FrontController (Client, Employee, and Admin views currently hard-coded into Client.java, but will become their own separate classes in further itterations)

../client/FrontController.java Serves as the front controller in the front controller pattern that communicates with the server using RMI

../common/AdminAccount.java Object to hold Admin account information gained from "database"; extension of EmployeeAccount

../common/ClientAccount.java Object to hold Client account information gained from "database"

../common/Connection.java interface used to build Server.java to allow it to communicate with FrontController.java through RMI

../common/Command.java interface used to build CheckCredentialsCommand.java and will be used to build future command classes

../common/EmployeeAccount.java Object to hold Employee account information gained from "database"; superclass of AdminAccount

../hotel/CheckCredentialsCommand.java Command Object used to return to the FrontController the credential (role) of the user given the username and password if the user exists, else will return no role

../hotel/Server.java instatiation of Connection.java's functions that is used to communicate with FrontController.java and the Dispatcher of the Front Controller pattern, credentials (roles) are just strings that will be passed on the type of object the user's information is in.

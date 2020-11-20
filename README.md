# Automatic_access_resricted_system
An access monitoring system , in which you can register for a timeslot and continue to grant access while entering.

Instructions for database and table generation

-> 	for schema generation and table, there is no extra effort needed for execution 
	of any type of scripts.Because I have added that in my code itself, 
	so that it creates an EMBEDDED DATABASE if there is no database.
	With the help of some derby library files ( that i have included in the project folder itself ), 
	I have created a database_handler ( included this into my code ),
	It creates a table in the database also if there is no table.
	The names of database and table are 'database' and 'user1' respectively.

Instructions for execution and specific requirements

-> 	The folder named 'oom_group_15' is the project folder.

->	All the codes of classes are present in the packages of the 'src' folder of the project folder itself.

->	I have provided the shortcut of the executable jar file in the zip file itself.

->	But actually the excecutable jar file named 'oom_group_15.jar' is located in the 'dist' folder of the project folder.

->	While registration please enter 'A VALID EMAIL ID'.

SYSTEM REQUIREMENTS

	Operating System: Any 
	jdk latest version 
	Proper internet connection .
	Email account of user ( Not a system requirement , but still ) .

Guide to use the automatic access restricted system project

->	Open the ar file using 'java openjdk platform binary' to run the jar file.

->	The registration button in the MAIN MENU redirects you to the REGISTRATION PAGE.

->	In the REGISTRATION PAGE after entering your details and submitting, 
	it will send a confirmation email which confirms you of the slot you have selected 
	and redirects you to a status confirmation frame.

	While registration please enter 'A VALID EMAIL ID'.

->	The Update button in the MAIN MENU redirects you to LOGIN PAGE

-> 	After logging in Successfully you will be redirected to the UPDATION PAGE.

->	In the UPDATE PAGE you can enter the details which are needed to be updated, 
	if you dont need any changes to be updated in specific slots please enter the old details itself.
	after updation it redirects you to a status confirmation frame.

->	The DISPLAY button in the MAIN MENU redirects you to the LOGIN PAGE.

-> 	After logging in Successfully you will be redirected to the DISPLAY PAGE.

->	In the DISPLAY PAGE you can opt for two options
	
	I want to enter
	I want to leave

->	If you have access to enter at that time according to your registration,
	your entry is recorded and you can enter. If you have no access at that time 
	you will be informed about that and if you want to leave 
	your state of leaving can also be recorded. 

FEATURES

* Registration of user 
* Updation of user details
* Login feature.
* Mailing Functionality using the ‘JavaMail’ class which uses the jar files named activation.jar , javax.mail.jar .
* The slot Details in the registration will automatically be sent to the user to the provided Email ID.
* Display of access using the system time.

DEVELOPMENT TOOLS

	Java GUI Frameworks such as Swing & AWT API.
	Abstract Window Toolkit
	Extra Libraries:- 
		( Already exist in the project folder itself )
		used for Mail Functionality, creating an embedded database.
	Use the netbeans or any similar platform and use the import project option 
		by importing the project folder named ‘oom_group_15’ for further development.


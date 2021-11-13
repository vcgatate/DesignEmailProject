
package emailProject;

import java.util.Scanner;

public class Email {

	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private int mailboxCapacity=500;
	private int defaultpassword=10;
	private String email;
	private String companyname="wipro.com";
	private String alternateEmail;
	
	//constructor to receive fname and lname
	public Email(String firstname, String lastname)
	{
		this.firstname=firstname;
		this.lastname=lastname;
		System.out.println("Email created : " + "  " + this.firstname + " " + this.lastname);
		
		this.department = SetDepartment();
		System.out.println("Department is = " + this.department);
		
		this.password = setPassword(defaultpassword);
		System.out.println("Your password is= " + this.password);
		
		this.email= firstname.toLowerCase() + lastname.toLowerCase() + "@" + department + "." + companyname;
		System.out.println("Your email is= " + this.email);
	}
	
	// constructor to receive department
	private String SetDepartment() {
		System.out.print("Enter the department details\n1.Sales \n2.Development\n3.Accounting\n4.None\n Enter the department code \n" );
		Scanner sc=new Scanner (System.in);
		int data=sc.nextInt();
		
		if(data==1) {return "Sales"; }
		else if(data ==2) {return "Development"; }
		else if(data ==3) {return "Acconting";}
		else return "  ";
					
	}

	//Generator to receive password
	private String setPassword(int length) {
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@$%^";
		char[] pwd=new char[length];
		for(int i=0;i<length;i++) {
			int rand= (int) (Math.random()* passwordSet.length());
			pwd[i]=passwordSet.charAt(rand);
		}
		
		return new String(pwd);
	}
	// Set the mailbox capacity
	
	public void setmailboxcapacity(int capacity)
	{
		this.mailboxCapacity= capacity;
	}
	
	//Set the alternate email
	public void setAlternateemail(String altEmail)
	{
		this.alternateEmail=altEmail;
	}
	
	// change the password
	public void changepassword(String Password)
	{
		this.password=Password;
	}
	
	public int mailboxcapacity()
	{
		return mailboxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public String showInfo()
	{
		return "Display Name = " + firstname + " " + lastname +
				"\nCompany Email = " + email  +
				"\nMailBoxCapacity = " + mailboxCapacity + "GB";
		
	}
	
	
}

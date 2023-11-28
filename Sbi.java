package All.details;

import java.util.Scanner;

import Account.details.Account;
import Service.details.Rbi;

public class Sbi implements Rbi
{
	
	private static final String Gender = null;
	private static final String AccNo = null;
	Account a=new Account();
	boolean Account =true;
	Scanner sc=new Scanner(System.in);
	private String MobNo;
	
	
	
	
	public void createAccount() {
		
			Scanner sc=new Scanner (System.in);
			System.out.println("!!!*** Welcome to your SBI Account ***!!!");
			System.out.println("Create Your Personal Account:   ");
			
			System.out.println("Enter Username:");
			String Username=sc.next();
			a.setUsername(Username);
			
			System.out.println("Enter Password");
			String Password=sc.next();
			a.setPassword(Password);
		
			System.out.println("Enter your Account Type:");
			String aactype=sc.next();
			a.setAcctype(aactype);
			
	
			System.out.println("Enter Holder Account No:");
			a.setAccNo(sc.next());
		while(true) 
		{
			if(a.getAccNo().length()==10)	
			{
				
				break;
			}
		else
			{
			System.out.println("please Enter 10 digit Account no:");
			a.setAccNo(sc.next());
			}
		
		}
			
			
			
			System.out.println("Enter Account holder Name:");
			String Name=sc.next()+sc.nextLine();
			a.setName(Name);
		
		
				System.out.println("Enter Your Mob No:");
				a.setMobNo(sc.next());
			while(true) 
			{
				if(a.getMobNo().length()==10)	
				{
					
					break;
				}
			else
				{
				System.out.println("Enter valid 10 digit Moblie no:");
				a.setMobNo(sc.next());
				}
			
			}
			
			
			
				System.out.println("Enter Your Adhar No:");
				a.setAdharNo(sc.next());
			while (true) 
			{
				if (a.getAdharNo().length()==12)
				{
					
					break;
				}
				else 
				{
				System.out.println("Enter valid 12 digit Adhar no:");
				a.setAdharNo(sc.next());
				}
			}
			
			
				System.out.println("Enter Your Age:");
				int Age=sc.nextInt();
				a.setAge(Age);
			
					
			
				System.out.println("Enter Your Gender:");
				a.setGender(sc.next());
			while(true)
				{	
				if((a.getGender().equalsIgnoreCase("Female") ||(a.getGender().equalsIgnoreCase("M")||(a.getGender().equalsIgnoreCase("Male")||(a.getGender().equalsIgnoreCase("m")||(a.getGender().equalsIgnoreCase("f")||(a.getGender().equalsIgnoreCase("male")||(a.getGender().equalsIgnoreCase("f")))))))))
				{
					
					break;
				}
				else 
				{
					System.out.println("Enter valid Gender Type:");
					a.setGender(sc.next());
				}
			}
		
		
				System.out.println("Please Enter your First deposite:\n" + "Enter Minimum Amount is Rs.1000/-: ");
				a.setBalance(sc.nextDouble());
			while(true) 
			{
				if (a.getBalance()>=1000)
				{
				
				break;
				}
			else
			 	{
				System.out.println("please Enter Minimum Amount is Rs.1000/-:");
				a.setBalance(sc.nextDouble());	
			 	}
				
			}
			System.out.println("Thank you!!! You have created Your Account Successfully: ");
	}
				

			
	


	@Override
	public void displayAllDetails() {
		
		if (true)
		{
			System.out.println("Account Number  :   "+a.getAccNo());
			System.out.println("Name of Account Holder :     "+a.getName());
			System.out.println("Mob No :   "+a.getMobNo());
			System.out.println("Adhar No :  "+a.getAdharNo());
			System.out.println("Gender :   "+a.getGender());
			System.out.println("Age :  "+a.getAge());
			System.out.println("Account Type :   "+a.getAcctype());
			System.out.println("Balance :  "+a.getBalance());
			System.out.println("Username :  "+a.getUsername());
			System.out.println("Password :   "+a.getPassword());
		}
		
		else
		{
			System.out.println("Create your Account Carefully:");
		}

		
	}

	@Override
	public void depositeMoney() {
		
		System.out.println("Enter Your Account no: \n" +"Enter Your Amount to deposite....!!!!Amount Should be Minimum Rs.1000/-:");
		//a.setBalance(sc.nextDouble());
		double da=sc.nextDouble();
		//while(true) 
		//{
			if (da>=1000) 
				
			{
		
			double d=a.getBalance();
			d=d + da;//a.getBalance();
			a.setBalance(d);
			//System.out.println("Current Available balance is : "+a.getBalance());
			
			
			}
		else
			{
			System.out.println("plz Enter Minimum Rs.1000/- Deposite:");	
			a.setBalance(sc.nextDouble());
			}
			
	}

	@Override
	public void withdrawal() {
	
			//if (Account ==true)
	//	{
			//boolean b=true;
			//while (b)
		//	{
				System.out.println("Enter Withdraw Amount");
				double d=sc.nextDouble();		
				//double oldamount =a.getBalance();
				//double newamount = oldamount-Withdrawlamount;
				if (d>0&&d <= d) 
				{
					double d1=a.getBalance();
					d=d1-d;
					a.setBalance(d);
					System.out.println(a.getBalance());
					//b=false;
				}
				else {
					System.out.println("plz maintain your Account Balance is Rs/-1000:");
				}
			}
		//}
		
	
	//}
	

	@Override
	public void balanceCheck() 
		{
			System.out.println(" Check your Balance...!!!");
		
		
			{
			System.out.println("Account Balance is :   "+a.getBalance());
			}
		
	
		}
	
	
	
	public void Updateinformation()
	
			{
				System.out.println("Enter New Mob No:");
				a.setMobNo(sc.next());
	while(true) 
			{
		if(a.getMobNo().length()==10)	
			{
			System.out.println("Your Mobile No haas been Updated successfully");
			break;
			}
		else 
			{
			System.out.println("Enter valid 10 digit Moblie no:");
			a.setMobNo(sc.next());
			}
			
		
			
				
			}
		}
	
}

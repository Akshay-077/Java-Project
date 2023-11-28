package Data.Test;

import java.util.Scanner;

import All.details.Sbi;

import Service.details.Rbi;


public class Test {

	public static void main(String[] args) {

		Sbi s=new Sbi();
		Scanner sc=new Scanner(System.in);
		
		
		while(true)
		{
			System.out.println("!!!Enter no which information you want!!!");
			System.out.println("1.Create Account:-\n"+"2.Display All Details:-\n"+"3.Deposite money:-\n"+"4.Withdrwal:-\n"+"5.Balance Check:-\n"+"6.Update iformation:-");
			System.out.println("Enter your choice");
			int i=sc.nextInt();
			
			switch(i) {
			
			
			case 1:
				s.createAccount();
				break;
				
			case 2:
				s.displayAllDetails();
				break;
				
			case 3:
				s.depositeMoney();
				break;
				
			case 4:
				s.withdrawal();
				break;
				
			case 5:
				s.balanceCheck();
				break;
			
			case 6:
				s.Updateinformation();
				break;
				
			case 7:
				System.exit(0);
				break;
				
			default:
				System.out.println("Enter correct choice:");
			}
		
		}
	}
}
		
		
			
		
		
		
	
	
	

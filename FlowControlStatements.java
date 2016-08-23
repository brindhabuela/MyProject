package JavaFundamentals;

import java.util.Scanner;

public class FlowControlStatements 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=s.nextInt();
		
		for(int i=2;i<=n;i++)
		{
				if(i==n)
				{
				System.out.println("it is prime number");
				break;
			
			}
			
				
			if(n%i==0)
			{
				System.out.println("it is not a prime number");
				break;
			}
	}


	}
}

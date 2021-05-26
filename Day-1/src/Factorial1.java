//6:Write a program to find factorial of a given number.

import java.util.Scanner;

public class Factorial1
{
	public static void main(String[] args) 
	{
		int i, n;
		int fact = 1;
		
		System.out.println("Enter a no:");
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
		
		 fact = fact*i;
	}
		System.out.println("factoial of given no " + n +" is: "+ fact);
		
}
}

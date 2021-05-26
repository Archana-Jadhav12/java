////11:Write a  program to find sum of all even and odd numbers between 1 to n. 

import java.util.Scanner;

public class SumOfEvenOdd 
{
	public static void main(String[] args)
	{
		int i,num;  
		int oddSum=0,evenSum=0;
		System.out.println("Enter the number: ");

		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();

		for(i=1; i<=num; i++)
		{  
		if(i%2==0) 
		    evenSum = evenSum + i;
		else
		    oddSum = oddSum + i;
		}
		
		System.out.println("Sum of all even numbers are: "+evenSum);
		
		System.out.println("Sum of all odd numbers are: "+oddSum);
			
	}
}

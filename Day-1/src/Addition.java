//2:Write a program to adddition of two numbers also addition of two characters.

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) 
	{
		int a,b,result;
				
		System.out.println("Enter First no:");
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		System.out.println("Enter Second no:");
		
		Scanner sc1 = new Scanner(System.in);
		b = sc1.nextInt();
		
		result = a+b;
		
		System.out.println("Addition is:"+result);
		
		System.out.println("--------------------------------");
		
		//Addition of two char
	
		String c;
		String d;
		System.out.println("Enter First Char:");
		
		Scanner sc2 = new Scanner(System.in);
		c = sc.next();
		
		System.out.println("Enter Second Char:");
		
		Scanner sc3 = new Scanner(System.in);
		d = sc3.next();
		
		String result1 = c+d;
		
		System.out.println("Addition is:"+result1);
		
	}

}

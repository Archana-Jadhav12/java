//12: Write a  program to enter a number and print its reverse.

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args)
	{
		int num,rev=0;
		
		System.out.println("Enter a Number: ");
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		while(num!=0)
		{
	          rev = rev * 10;
	          rev = rev + num % 10;
	          num = num/10;
	      
		}
	      System.out.println("Reverse of input number is: "+rev);

		
	}

}

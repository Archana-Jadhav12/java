////7:Write a program to find m to the power n

import java.util.Scanner;

public class mpower {

	public static void main(String[] args) 
	{
		  int basenumber, exponent;
		  long temp = 1;
		  
		  System.out.println("Enter a basenumber:");
			
			Scanner sc = new Scanner(System.in);
			basenumber = sc.nextInt();
			
			System.out.println("Enter a exponent:");
				
			Scanner sc1 = new Scanner(System.in);
			exponent = sc1.nextInt();

			

		  while (exponent != 0) {
		   temp *= basenumber;
		   --exponent;
		  }

		  System.out.println("Result: " + temp);
		 
	
	}

}

//13:Write a  program to print all Prime numbers between 1 to n. 

import java.util.Scanner;

public class PrimeNoAll 
{

	public static void main(String[] args) 
	{
		int n,num,i;
        System.out.println("Find prime numbers upto : ");

		Scanner sc = new Scanner(System.in);

         n = sc.nextInt();

        System.out.println("All prime numbers upto " + n + " are : ");

        for( num = 2; num <= n; num++) 
        {
            for(i = 2; i <= (num / 2); i++) 
            {

               if(num % i == 0) 
               {
                    i = num;
                    break;
                }
            }

            // If the number is prime then print it.
            
            if(i != num) {
                System.out.println(num + " ");
            }
        }
	}

}

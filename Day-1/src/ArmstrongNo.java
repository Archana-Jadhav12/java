//14:Write a program to check entered number is Armstrong number or not.

import java.util.Scanner;

public class ArmstrongNo 
{

	public static void main(String[] args) 
	{
        int num, number, temp, total = 0;
        System.out.println("Ënter 3 Digit Number:"
        		+ "");
        
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
       
        number = num;

        for( ;number!=0;number /= 10)
	
		{
            temp = number % 10;
            total = total + temp*temp*temp;
        }

        if(total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
	}

}

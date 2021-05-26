//9:Sum of series :	1+2+3+….+n

import java.util.Scanner;

public class SumOfSeries
{

	public static void main(String[] args)
	{
	    int n,sum=0,i;
	    System.out.println("Enter the range of number:");

	    Scanner sc = new Scanner(System.in);
	    n=sc.nextInt();

	    for(i=1;i<=n;i++)
	        sum+=i;
	    
	    System.out.println("The sum of the series = "+sum);

	}

}

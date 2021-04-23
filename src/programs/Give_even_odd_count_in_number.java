package programs;

import java.util.Scanner;

public class Give_even_odd_count_in_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int oddcount=0;
		int evencount=0;
	
		while(num>0)
		{
		int rem=num%10;
		if(rem==0)
		{
			System.out.println("the zero value present is  whole num");
		}
		num=num/10;		
		if(rem%2==0)
		{
			if(rem==0)
			{
				continue;
			}
			evencount++;			
		}
		else
		{
			oddcount++;
		}
	}
	System.out.println("evencount is :"+evencount);
	System.out.println( "oddcount is :"+oddcount);
}
}

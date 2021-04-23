package programs;

import java.util.Scanner;


public class Armstrongnumber {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the number ");
		int num=obj.nextInt();
		int org=num;
		int sum=0;
		while(num>0)
		{
			int remainder=num%10;
				num=num/10;
				sum=sum+remainder*remainder*remainder;
	
		}
	
		System.out.println(sum);
		if(org==sum)
		{
			System.out.println("It is a armstrong Number" );
		}
		else {
			System.out.println("not a armstrong number");
		}
	}
}

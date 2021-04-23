package programs;

import java.util.Scanner;

public class Reverse_number {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int num=sc.nextInt();
		int org=num;
		System.out.println("original number is     :"+num);
		int rev=0;
		while(num>0)
		{
			rev=rev*10+(num%10);
			num=num/10;			
		}
		System.out.println("the reverese number is :"+rev);
		
		// to check wether the number is palindrome or not
			if(org==num)
			{
				System.out.println("num is a palindrome");
			}
			else
			{
				System.out.println("not a palindrome num");
			}
		
	}

}

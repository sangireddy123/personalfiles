package programs;

import java.util.Scanner;

public class Num_of_digits_in_a_number {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int num=sc.nextInt();
		int count=0;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		System.out.println("num of degits in a number is :"+count);

	}

}

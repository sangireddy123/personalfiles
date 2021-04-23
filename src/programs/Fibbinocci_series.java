package programs;

import java.util.Scanner;

public class Fibbinocci_series {

	public static void main(String[] args) {
		int a=0,b=1,sum=0;
		System.out.println(a);
		System.out.println(b);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			sum=a+b;
			System.out.print("  "+sum);
			a=b;
			b=sum;
			
		}
		
	}

}

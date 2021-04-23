package programs;

import java.util.Scanner;

public class NumofdigitsinAnumber {

	public static void main(String[] args) {
		int count=0;
		int num;
		Scanner obj=new Scanner(System.in);
		num=obj.nextInt();
		if(num<0)
		{
			num=num*-1;
			
		}else if(num==0)
		{
			num=1;
		}
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("the number of digits in a number is :"+count);
		
	}

}

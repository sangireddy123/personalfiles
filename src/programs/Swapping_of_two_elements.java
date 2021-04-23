package programs;

public class Swapping_of_two_elements {

	public static void main(String[] args) {
			// swapping means a vlue shoulb be assigned to b ,and the b value shoul be assigned to a, 
		
			// in another words interchanging the values of variables
			//1. swapping using 3rd variable temp
		String s1="Eswar";
		String s2="Reddy";
		System.out.println("swapping values before swapping:        "+s1+" "+s2);
		String temp=s1;
		s1=s2;
		s2=temp;
		System.out.println("swapping values after swapping:         "+s1+" "+s2);
		
		//2.without using third variable
		int a=100,b=200;
		System.out.println("swapping values before swapping:        "+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("swapping values after swapping:         "+a+" "+b);
	}

}

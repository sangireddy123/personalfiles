package programs;

import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;

public class Ramndom_number_generation {

	public static void main(String[] args) {
		
		// Approach:1
		Random rand=new Random();
		int x=rand.nextInt(1000);  //it will randomly generate between 0 to 99 when given 100,similarly  0-999 when give 1000.
		System.out.println(x);

	
		double y=rand.nextDouble();
		System.out.println(y);
		
		// Approach:2  Math
		System.out.println(Math.random());
		
		// Approach:3  Apache commons-lang API
		String randumnum=RandomStringUtils.randomNumeric(10);
	
		System.out.println(randumnum);
		String randalpha=RandomStringUtils.randomAlphabetic(1);
	System.out.println(randalpha);
	String randumnm=RandomStringUtils.randomAlphanumeric(10);
	System.out.println(randumnm);
	
	
	
	}	
}

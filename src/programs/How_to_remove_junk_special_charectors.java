package programs;

public class How_to_remove_junk_special_charectors {

	public static void main(String[] args) {
		String str="@#$%^&*()?/'''' string eswarreddy";
		String charectos=str.replaceAll("[^a-zA-Z0-9]", "");   //^ this symbol makes replace all special charectors with alphabets
		
		System.out.println(charectos);
		
		
		// removes  all charectors,numerical values and retrives only special charectors
		String onlyspecialcharectors=str.replaceAll("[a-zA-Z0-9]", "");
		System.out.println(onlyspecialcharectors);
	}

}

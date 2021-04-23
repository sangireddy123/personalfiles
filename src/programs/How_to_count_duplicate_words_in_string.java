package programs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class How_to_count_duplicate_words_in_string {

	public static void main(String[] args) {
		String str="i am am eswar eswar reddy";
		String[] strarray=str.split(" ");
		Set<String> myset=new LinkedHashSet<String>();
		for(String x:strarray)
		{
			myset.add(x);
		}
		
		Iterator<String> itr=myset.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
		
		
	}

}

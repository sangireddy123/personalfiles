package programs;

import java.util.HashMap;
import java.util.Set;

public class Hashmapsyntaxtoprintdata {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "eswarreddy");
		map.put(101, "siri");
		map.put(102, "ammulu");
		Set<Integer> onlykeys=map.keySet();
		System.out.println(onlykeys);
		//System.out.println(map);
		for(Object i:map.keySet())
		{
			System.out.println(i+"    "+map.get(i));
		}
		System.out.println(map);
		
	}

}

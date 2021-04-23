package programs;

public class Finding_duplicate_charector_in_String {

	public static void main(String[] args) {
		String sa="eswarreddy";
		char ch[]=sa.toCharArray();
		int length=sa.length();
		
		for(int i=1;i<length;i++)
		{
			for(int j=i+1;i<length;j++)
			{
				if(ch[i]==ch[j])
				{
					
					System.out.println(ch[i]);
				
					
				}
			}
		}	
	}
}
		//String s="sangireddy eswar reddy";
	//	int length=s.length();
	//	char[] ch=s.toCharArray();
		
		/*String S="eswarreddy";
		char cha[]=S.toCharArray();
		int lengthh=S.length();
		for(int i=0;i<lengthh;i++)
		{
		for(int j=i+1;j<lengthh;j++)
		{
		if(cha[i]==cha[j])
		{
		System.out.println("dublicate char in string:"+cha[j]);
		}
		}
		}
	}
}*/
		
		/*int totalcount=s.length();
		System.out.println(totalcount);
		int Afterremovings=s.replace("s", "").length();
		int scount=totalcount-Afterremovings;
		System.out.println("count of occurance of s:"+scount);
		int Afterremovinga=s.replace("d", "").length();
		int acount=totalcount-Afterremovinga;
		System.out.println("count of occurance of d:"+acount);
	
		*/
		/*int count=0;
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(ch[j]==ch[i])
				{
					System.out.println("duplicated values are " +ch[j]);
					
					count+=1;
				}
			}
		}
		
		System.out.println(count);*/
	
		
	
	
	
	

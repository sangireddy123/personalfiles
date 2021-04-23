package programs;

class Stringmethods
{
	
	String s1="Eswar";
	String s2="EswarReddy";
	Stringmethods(String name,String College)
	{
		String empname=name;
		String empcollege=College;
		
		System.out.println(empname+empcollege);
	}
	
	void string()
	{
		System.out.println(s2.contains(s1));
		System.out.println(s1.charAt(0));
		System.out.println(s1.equals(s2));	
		System.out.println(s1.length());
		System.out.println(s1+" "+s2);
		System.out.println(s1);
		System.out.println(s2);
		
	}
	abstract class chaid
	{
	abstract void add(int p1,int p2);
	abstract void add(int p1,int p2,int p3);
	abstract void display();
	
	}
	class B 
	{
		public int  sum=0;
	}
		void add(int p1,int p2)
		{
			int sumodtwo=p1+p2;
			System.out.println(sumodtwo);
		}
		void add(int p1,int p2,int p3)
		{
			int sum=p1+p2+p3;
			System.out.println(sum);		
	     }
}
		public class MethodsforString {

	public static void main(String[] args) {
		Stringmethods str=new Stringmethods("eswarreddy","kluniversity");
		//Stringmethods str1=new Stringmethods();
		str.string();
		

	}

}

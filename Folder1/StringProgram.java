package Basics;

public class StringProgram {
	
public static void main(String[] args) {
	
		
//		     String Reverse Program
		
//		String Original="ABCDEF";
//		String Reverse=" ";
//		
//		System.out.println("Length of Original String is:"+Original.length());
//		
//		for(int i=Original.length()-1;i>=0;i--)
//		{
//			Reverse=Reverse+Original.charAt(i);
//			
//		}
//		
//		System.out.println("Reverse String is:"+Reverse);
		
		

	
//	          Palindrome String
	
//	String Original="ab";
//	String Reverse="";
//	
//	for(int i=Original.length()-1;i>=0;i--) {
//		Reverse=Reverse+Original.charAt(i);
//	}
//		if(Original.equals(Reverse)) {
//			System.out.println("Given String is Palindrome");
//		}
//		else {
//			System.out.println("Given String is not Palindrome");
//		}
	

		
//		    Fibonacci Example
		
	int n1=0,n2=1,n3,i,count=10;
	
	System.out.print(n1+" "+n2);
	for(i=2;i<count;i++)
	{
		n3=n1+n2;
		System.out.print(" "+n3);
		n1=n2;
		n2=n3;
		
	}
		
	
}


}

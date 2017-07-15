
public class StringInternExample {
	
	//String Palindrome Check
//	public static void main (String [] args){
//		
//		String pali = "MALAYALAM";
//		
//		int length = pali.length();
//		
//		System.out.println(length/2);
//		
//		for (int i = 0; i < length/2; i++) {
//			
//			if(pali.charAt(i) != pali.charAt(length - (i + 1))){
//				System.out.println("Not a Palindrome");
//			}
//			
//		}
//		
//	}
	public static void main (String [] args){
		
		
	
	
	String s2 = "abc";
	String s1 = new String ("abc");	
	s1.intern();
	System.out.println(s1 == s2);
	
	}
}

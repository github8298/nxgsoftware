import java.util.*;

public class RemoveDuplicates {
	
	
	
	
	public static String removeDuplicates(String str) {
		
		Set<Character> st = new HashSet<>();
		StringBuffer sf = new StringBuffer();
		
		for(int i=0;i<str.length();i++) {
			
			Character c = str.charAt(i);
			
			if(!st.contains(c)) {
				st.add(c);
				sf.append(c);
			}
			
		}
		
		return sf.toString();
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter value");
		String s=scn.next();
		
		System.out.println("The Result is =  "+removeDuplicates(s));
	
		scn.close();
	}

}

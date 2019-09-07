import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter first word");
		String 	s1=scn.next();
		System.out.println("Enter second word");
		String  s2=scn.next();
		
		System.out.println(checkAnagram(s1, s2));

		scn.close();
	}

	
	public static boolean checkAnagram(String str1 , String str2) 
	{
		char[] charstr1=str1.toCharArray();
		char[] charstr2=str2.toCharArray();
	
		Arrays.sort(charstr1);
		Arrays.sort(charstr2);
		
		return Arrays.equals(charstr1, charstr2);
		
	}
	
	
}

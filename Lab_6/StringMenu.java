package Lab_6;
import java.util.*;

public class StringMenu {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.print("Choose an option: ");
		int op = s.nextInt();
		
		switch (op) {
		case 1:
			s.nextLine();
			System.out.print("Enter string: ");
			String pstr = s.nextLine();
			checkPalindrome(pstr);
			break;
			
		case 2:
			s.nextLine();
			System.out.print("Enter strings (separated by space): ");
			String astr = s.nextLine();
			String[] strArray = sortAlphabetic(astr);
			System.out.println("Sorted Words: ");
			for (String e: strArray) {
				System.out.println(e);
			}
			break;
			
		case 3:
			s.nextLine();
			System.out.print("Enter string: ");
			String rstr = s.nextLine();
			String rev = reverseString(rstr);
			System.out.println("Reversed Word: "+ rev);
			break;
			
		case 4:
			s.nextLine();
			System.out.print("Enter string: ");
			String rostr = s.nextLine();
			String reverse = reverseString(rostr);
			
			String newString = rostr + reverse;
			
			System.out.println("Concatenated String: "+ newString);
			
			break;
		}
		
		s.close();
	}
	
	static void checkPalindrome(String str) {
		str = str.toLowerCase();
		int n = str.length();
		Boolean isPalindrome = true;
		
		for (int i = 0; i < n; i++) {
			if (str.charAt(i) != str.charAt(n-i-1)) {
				isPalindrome = false;
				break;
			}
		}
		
		if (isPalindrome) { System.out.print(str + " is a palindrome.");} 
		else { System.out.print(str + " is not a palindrome.");}
	}
	
	static String reverseString(String str) {
		String rev = "";
		int n = str.length();
		
		for (int i = 0; i < n; i++) {
			rev += str.charAt(n-i-1);
		}
		
		return rev;
	}
	
	static String[] sortAlphabetic(String str) {
		String[] strArray = str.split(" ");
		Arrays.sort(strArray);
		
		return strArray;
	}
	

}

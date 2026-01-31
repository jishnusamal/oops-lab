package Lab_0;
import java.util.Scanner;

public class TypeCast {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("©️ Jishnu Samal 2026");
		
		System.out.print("Enter an integer: ");
		int intNum = s.nextInt();
		
		System.out.print("Enter a double: ");
		double doubleNum = s.nextDouble();
		
		System.out.print("Enter a character: ");
		char ch = s.next().charAt(0);
		
		byte intByte = (byte) intNum;
		int charInt = ch;
		byte doubleByte = (byte) doubleNum;
		int doubleInt = (int) doubleNum;
		
		System.out.println("int to byte: " + intByte);
		System.out.println("char to int: " + charInt);
		System.out.println("double to byte: " + doubleByte);
		System.out.println("double to int: " + doubleInt);
		
	}
}

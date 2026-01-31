package Lab_2;
import java.util.Scanner;

public class DateOfRetirement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter year of birth: ");
		int year = s.nextInt();
		
		System.out.print("Enter month of birth: ");
		int month = s.nextInt();
		
		System.out.print("Enter day of birth: ");
		int day = s.nextInt();
		
		int yearOfRetirement = year + 60;
		
		System.out.println("Age: " + (2026-year));
		System.out.println("Date of Retirement: " + day + "/" + month + "/" + yearOfRetirement);

		s.close();
	}

}

package Lab_2;
import java.util.Scanner;

public class YearJoined {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter Registration Number: ");
		double yoj = s.nextDouble();
		
		while (yoj > 100) {
			yoj /= 10;
		}
		
		System.out.println("Year of Joining: " + (int) yoj);
		s.close();
	}

}

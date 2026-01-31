package Lab_2;
import java.util.Scanner;

public class YearJoined {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter Registration Number: ");
		long yoj = s.nextLong();
		
		while (yoj > 100) {
			yoj /= 10;
		}
		
		System.out.println("Year of Joining: " + (int) (2000 + yoj));
		s.close();
	}

}

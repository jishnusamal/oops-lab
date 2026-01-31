package Lab_2;
import java.util.Scanner;

public class TaxiService {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter distance: ");

		int distance = s.nextInt();
		float price = 0;
		
		if (distance <= 5) {
			price = distance * 10;
		} else if (distance > 5 && distance <= 20 ) {
			price = 5*10 + (distance - 5)*8;
		} else if (distance > 20) {
			price = 5*10 + 15*8 + (distance - 20)*5;
		}
		
		System.out.println("Price = "+ price);

		s.close();
	}

}

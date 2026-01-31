package Lab_2;
import java.util.Scanner;

public class Bill {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter units consumed: ");
		int units = s.nextInt();
		
		int op = 0;
		float price = 0;
		
		if (units <= 100) {
			op = 1;
		} else if (units >= 101 && units <= 200) {
			op = 2;
		} else if (units >= 201) {
			op = 3;
		}
		
		switch (op) {
		case 1:
			price = units*7;
			break;
		case 2:
			price = 100*7 + (units - 100)*8;
			break;
		case 3:
			price = 100*7 + 100*8 + (units - 200)*10;
			break;
		}
		
		System.out.println("Electricity Charge: " + price);
		s.close();

	}

}

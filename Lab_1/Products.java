package Lab_1;
import java.util.Scanner;

public class Products {

	public static void main(String[] args) {
		/*
		 * Write a Java program to manage stock information for multiple products.
		 * The program should store the product name, product price, and quantity in separate one-dimensional arrays for n items.
		 * The user should be able to specify which products they want to purchase and the desired quantity for each.
		 * Based on the user’s input, the program should generate and display the total bill.
		 */
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Number of Products: ");
		int n = s.nextInt();
		
		String[] productName= new String[n];
		double[] productPrice = new double[n];
		int[] productQuantity = new int[n];
				
		for (int i = 0; i<n; i++) {
			System.out.println("Product "+(i+1));
			s.nextLine();     
			System.out.print("Name: ");
			productName[i] = s.nextLine();
			
			System.out.print("Price: ");
			productPrice[i] = s.nextDouble();
			
			System.out.print("Quantity: ");
			productQuantity[i] = s.nextInt();
		}
		
		for (int i = 0; i<n; i++) {
			System.out.print("Product "+(i+1) + ": " + productName[i] + " ₹" + productPrice[i] + " " + productQuantity[i] + "\n");
		}

		System.out.print("Number of Products to Buy: ");
		int nBuy = s.nextInt();
		
		String[] selectedProducts = new String[nBuy];
		int[] selectedQuantities = new int[nBuy];
		double[] selectedPrices = new double[nBuy];
		
		for (int i = 0; i<nBuy; i++) {
			System.out.print("Enter Product ID to buy " + ": ");
			int productID = s.nextInt();
			selectedProducts[i] = productName[productID - 1];

			System.out.print("Enter Quantity: ");
			int quantity = s.nextInt();
			selectedQuantities[i] = quantity;

			selectedPrices[i] = productPrice[productID - 1] * quantity;
		}

		double totalBill = 0;

		System.out.println("----- BILL -----");
		for (double e: selectedPrices) {
			totalBill += e;
		}

		System.out.println("Total Bill: " + totalBill);
		
		s.close();
	}
}

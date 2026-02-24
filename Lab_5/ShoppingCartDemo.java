package Lab_5;
import java.util.Scanner;

class ShoppingCart {
	Item[] items;
	
	class Item {
		String itemName;
		int quantity;
		double price;
		
		Item(String itemName, int quantity, double price) {
			this.itemName = itemName;
			this.quantity = quantity;
			this.price = price;
		}
	}
	
	void addItems(int n, Item[] items) {
		for (int i = 0; i < n; i++) {
			this.items[i] = items[i];
		}
	}
	
	void displayItems() {
		for (Item item: this.items) {
			System.out.println(item.itemName + " " + item.quantity + " ₹" + item.price);
		}
	}
}

public class ShoppingCartDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ShoppingCart cart = new ShoppingCart();
		
		System.out.print("Enter no. of items: ");
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			
		}
//		cart.addItems(n, );
		s.close();
	}

}

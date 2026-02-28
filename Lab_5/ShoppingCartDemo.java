package Lab_5;
import java.util.Scanner;

class ShoppingCart {
	Item[] items = new Item[100];
	
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

	void calculateTotal() {
		double total = 0;
		for (Item item: this.items) {
			if (item == null) break;
			total += item.quantity * item.price;
		}
		System.out.println("Total: ₹" + total);
	}
	
	void displayItems() {
		for (Item item: this.items) {
			if (item == null) break;
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
		ShoppingCart.Item[] items = new ShoppingCart.Item[n];
			
		for (int i = 0; i < n; i++) {
			s.nextLine();
			System.out.print("Enter item name: ");
			String itemName = s.nextLine();
			System.out.print("Enter quantity: ");
			int quantity = s.nextInt();
			System.out.print("Enter price: ");
			double price = s.nextDouble();
			items[i] = cart.new Item(itemName, quantity, price);
		}
		cart.addItems(n, items);
		cart.calculateTotal();
		cart.displayItems();

		s.close();
	}

}

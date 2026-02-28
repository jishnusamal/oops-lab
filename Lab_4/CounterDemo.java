package Lab_4;

class Counter {
	static int counter;
	
	Counter(){
		counter++;
	}
	
	void showCount() {
		System.out.println(counter + " counter instances have been created.");
	}
}

public class CounterDemo {

	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
		Counter c4 = new Counter();
		c4.showCount();
//		System.out.print(Counter.counter);
	}
}

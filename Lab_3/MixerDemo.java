package Lab_3;

class Mixer {
	int[] arr;
	// int[] newArr;

	Mixer(int[] arr) {
		this.accept(arr);
	}
	
	void accept(int[] arr) {
		int n = arr.length;
		for (int i = 0; i<n-1; i++) {
			int smallest = arr[i];
			int pos = i;
			for (int j = i+1; j<n; j++) {
				if (arr[j] < smallest) {
					smallest = arr[j];
					pos = j;
				}
			}
			int temp = arr[i];
			arr[i] = smallest;
			arr[pos] = temp;
		}
		
		this.arr = arr;
	}
	
	void mix (Mixer a) {
		int temp[] = new int[this.arr.length + a.arr.length];

		for (int i = 0; i<this.arr.length; i++) {
			temp[i] = this.arr[i];
		}
		
		for (int i = 0; i<a.arr.length; i++) {
			temp[i+this.arr.length] = a.arr[i];
		}

		this.accept(temp);
	}

	void display () {
		for (int e: this.arr) {
			System.out.print(e + " ");
		}
		System.out.println();
	}
}

public class MixerDemo {

	public static void main(String[] args) {
		int[] arr1 = {5, 3, 8, 1, 2};
		int[] arr2 = {7, 4, 6, 9, 0};
		
		Mixer mixer1 = new Mixer(arr1);
		Mixer mixer2 = new Mixer(arr2);

		mixer1.mix(mixer2);
		mixer1.display();
		// mixer2.display();
	}

}

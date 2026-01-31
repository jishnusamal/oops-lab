package Lab_3;

class Mixer {
	int[] arr;
	
	void accept(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n-1; i++) {
			int pos = i;
			int small = arr[i];
			for (int j = 0; j < n; j++) {
				if (small > arr[j]) {
					pos = j;
					small = arr[j];
				}
			}
			arr[pos] = arr[i];
			arr[i] = small;
		}
		
		this.arr = arr;
	}
	
	void Mix () {
		
	}
}

public class MixerUser {

	public static void main(String[] args) {
		

	}

}

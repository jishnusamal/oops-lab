package Lab_3;

class Mixer {
    int[] arr;

    Mixer(int[] input) {
        accept(input);
    }

    // Accept array in ascending order without duplicates
    void accept(int[] input) {

        // Selection Sort
        for (int i = 0; i < input.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] < input[min]) {
                    min = j;
                }
            }
            int temp = input[i];
            input[i] = input[min];
            input[min] = temp;
        }

        // Remove duplicates
        int temp[] = new int[input.length];
        int k = 0;

        temp[k++] = input[0];
        for (int i = 1; i < input.length; i++) {
            if (input[i] != input[i - 1]) {
                temp[k++] = input[i];
            }
        }

        arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }
    }

    // Merge two Mixer objects
    Mixer mix(Mixer A) {

        int i = 0, j = 0, k = 0;
        int temp[] = new int[this.arr.length + A.arr.length];

        while (i < this.arr.length && j < A.arr.length) {
            if (this.arr[i] < A.arr[j]) {
                temp[k++] = this.arr[i++];
            } else if (this.arr[i] > A.arr[j]) {
                temp[k++] = A.arr[j++];
            } else {
                temp[k++] = this.arr[i++];
                j++;
            }
        }

        while (i < this.arr.length) {
            temp[k++] = this.arr[i++];
        }

        while (j < A.arr.length) {
            temp[k++] = A.arr[j++];
        }

        int result[] = new int[k];
        for (int x = 0; x < k; x++) {
            result[x] = temp[x];
        }

        return new Mixer(result);
    }

    void display() {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

public class MixerDemo {
    public static void main(String[] args) {

        int[] arr1 = {5, 3, 8, 1, 2, 3, 5, 7};
        int[] arr2 = {7, 4, 6, 9, 0};

        Mixer m1 = new Mixer(arr1);
        Mixer m2 = new Mixer(arr2);

        Mixer m3 = m1.mix(m2);

        m3.display();
    }
}

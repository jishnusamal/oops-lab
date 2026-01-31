package Lab_1;
import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		/*
		 * Write a Java program to rotate the elements of an array to the right/left by a given number of steps.
		 * The program should handle arrays of different sizes and should be able to rotate the array in both directions (left and right).
		 */
		Scanner s = new Scanner(System.in);
		
		System.out.print("Number of Elements: ");
		int n = s.nextInt();
		
		int[] a = new int[n];
		int[] newA = new int[n];
		
		for (int i = 0; i<n; i++) {
			System.out.print("Number "+(i+1)+": ");
			a[i] = s.nextInt();
		}
		
		System.out.print("1. Forward\n2. Backward: ");
		int op = s.nextInt();
		System.out.print("Step: ");
		int step = s.nextInt();
		
		switch(op) {
		case 1:
			for (int j = 0; j<a.length; j++) {
				int newIndex = (int) (j+step)%a.length;
				System.out.print(j + " "+newIndex + "\n");
				newA[newIndex] = a[j];
			}
			break;
		case 2:
			for (int j = 0; j<a.length; j++) {
				int newIndex = (int) (j-step+a.length)%a.length;
				System.out.print(j + " "+newIndex + "\n");
				newA[newIndex] = a[j];
			}
			break;
		}
		
		for (int e: newA) {
			System.out.println(e);
		}

		s.close();
	}

}

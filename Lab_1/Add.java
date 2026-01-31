package Lab_1;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = s.nextInt();

        System.out.print("Enter second number: ");
        int b = s.nextInt();

        // Bitwise addition
        while (b != 0) {
            int carry = a & b;      // carry bits
            a = a ^ b;              // sum without carry
            b = carry << 1;         // shift carry left
        }

        int sum = a;

        System.out.println("Sum = " + sum);

        if ((sum & 1) == 0) {
            System.out.println("The sum is even");
        } else {
            System.out.println("The sum is odd");
        }

        s.close();
    }
}

package assignments.function;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers");

        product(sc.nextInt(), sc.nextInt());

        sc.close();
    }

    static void product(int a, int b) {
        System.out.println("Product of number is " + (a * b));

    }
}

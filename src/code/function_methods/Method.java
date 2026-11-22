package code.function_methods;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sum(sc);
        System.out.println(sum1(sc));

        sc.close();
    }

    // Method 1: Void
    static void sum(Scanner sc) {

        System.out.print("Enter number ");

        int num1 = sc.nextInt();
        System.out.print("Enter number ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum of two number are " + sum);

    }

    // Method 2: Return Type
    static int sum1(Scanner sc) {
        System.out.print("Enter number ");
        int a = sc.nextInt();
        System.out.print("Enter number ");
        int b = sc.nextInt();

        int sum = a + b;
        return sum;

    }

}

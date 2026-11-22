package assignments.conditionals_loops.basic;

import java.util.Scanner;

public class Leetcode1281 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number ");

        int product = 1;
        int sum = 0;
        int rem;

        int result;

        int num = sc.nextInt();
        while (num != 0) {

            rem = num % 10;
            product = product * rem;
            sum = sum + rem;
            num = num / 10;
        }

        System.out.println("Product of digits " + product);
        System.out.println("Sum of digits " + sum);

        result = product - sum;
        System.out.println("Subtraction of product and Sum " + result);

        sc.close();
    }
}

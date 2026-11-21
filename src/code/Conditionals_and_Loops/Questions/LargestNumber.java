package code.Conditionals_and_Loops.Questions;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter a number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter a number: ");
        int num3 = sc.nextInt();

        // Find the largest number among them
        int max = num1;
        if (num2 > max) {
            max = num2;
        } else if (num3 > max) {
            max = num3;
        }
        System.out.println("Maximum Number is " + max);

        int max1 = Math.max(num1, Math.max(num2, num3)); // Built in Function that java provide

        System.out.println(max1);

        sc.close();
    }
}

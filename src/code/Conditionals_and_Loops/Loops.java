package code.Conditionals_and_Loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        // Print number from 1 to 5
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);

        System.out.println();

        // For Loop-
        // Printing number from 1 to 5
        for (int num = 1; num <= 5; num++) {
            System.out.print(num + " ");
        }

        System.out.println();

        // Print number from 1 to n
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number ");
        int num1 = sc.nextInt();
        for (int i = 0; i <= num1; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        // While Loop-
        int num2 = 1;
        while (num2 < 10) {
            System.out.println("Hey buddy!");
            num2++;
        }

        // Do-While - In do-while loop program is always execute at least once after
        // that it execute while condition is true.
        int num3 = 1;
        do {
            System.out.println(num3);
        } while (num3 <= 5);

        sc.close();
    }
}

package assignments.conditionals_loops.basic;

import java.util.Scanner;

public class SumNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numberS (Press 0 to stop!) ");

        int num = sc.nextInt();
        int sum = 0;

        while (num != 0) {
            sum += num;
            System.out.print("Enter numberS (Press 0 to stop!) ");

            num = sc.nextInt();
        }

        System.out.println("Sum of all numbers " + sum);

        sc.close();

    }
}

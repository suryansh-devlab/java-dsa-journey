package assignments.conditionals_loops.basic;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number ");
        int num = sc.nextInt();

        int largest = 0;

        while (num > 0) {
            largest = num;
            System.out.print("Enter a number ");
            num = sc.nextInt();
        }

        System.out.println("Largest Number " + largest);

        sc.close();
    }
}

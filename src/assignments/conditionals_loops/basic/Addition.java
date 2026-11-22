package assignments.conditionals_loops.basic;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number ");
        int num1 = sc.nextInt();
        System.out.print("Enter a number ");
        int num2 = sc.nextInt();

        System.out.print("Addition of two numbers are " + (num1 + num2));

        sc.close();
    }
}

package assignments.function;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two number for addition");
        sum(sc.nextInt(), sc.nextInt());

        sc.close();
    }

    static void sum(int a, int b) {
        System.out.println("Sum of number is " + (a + b));
    }
}

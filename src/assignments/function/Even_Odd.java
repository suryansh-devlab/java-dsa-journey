package assignments.function;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number ");
        num(sc.nextInt());

        sc.close();
    }

    static void num(int a) {

        if (a % 2 == 0) {
            System.out.println("Even number " + a);
        } else if (a % 2 != 0) {
            System.out.println("Odd number " + a);
        } else {
            System.out.println("Enter a positive number");
        }

    }
}

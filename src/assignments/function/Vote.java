package assignments.function;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age of the candidate ");
        eligible(sc.nextInt());

        sc.close();

    }

    static void eligible(int a) {
        if (a >= 18) {
            System.out.print("Eligible to vote");
        } else {
            System.out.print("Not Eligible to vote");
        }
    }
}

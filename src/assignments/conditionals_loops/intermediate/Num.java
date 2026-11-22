package assignments.conditionals_loops.intermediate;

import java.util.Scanner;

public class Num {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number ");
        int num = sc.nextInt();

        int sumNeg = 0;
        int sumEven = 0;
        int sumOdd = 0;
        while (num != 0) {
            if (num < 0) {
                sumNeg = sumNeg + num;
            } else if (num % 2 == 0) {
                sumEven = sumEven + num;
            } else {
                sumOdd = sumOdd + num;
            }

            System.out.print("Enter a number ");
            num = sc.nextInt();
        }

        System.out.println("Sum of Negative Number " + sumNeg);
        System.out.println("Sum of Even  Number " + sumEven);
        System.out.println("Sum of Positive Odd Number " + sumOdd);

        sc.close();
    }
}

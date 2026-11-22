package assignments.conditionals_loops.intermediate;

import java.util.Scanner;

class Sum_of_Digit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;
        int rem;
        while (num != 0) {

            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.print("Sum of digits of a number " + sum);

        sc.close();
    }

}
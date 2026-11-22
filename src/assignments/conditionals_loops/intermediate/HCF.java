package assignments.conditionals_loops.intermediate;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number ");
        int num1 = sc.nextInt();
        System.out.print("Enter a number ");
        int num2 = sc.nextInt();

        int min = Math.min(num1, num2);
        while (true) {

            if (num1 % min == 0 && num2 % min == 0) {
                System.out.println("HCF = " + min);
                break;
            }
            min--;
        }
        sc.close();
    }
}

package code.Conditionals_and_Loops.Questions;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your operator ");
        int ans = 0;

        while (true) {
            char op = sc.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                System.out.print("Enter Number ");
                int num = sc.nextInt();
                System.out.print("Enter Number ");
                int num1 = sc.nextInt();

                if (op == '+') {
                    ans = num + num1;
                }
                if (op == '-') {
                    ans = num - num1;
                }
                if (op == '/') {
                    ans = num / num1;
                }
                if (op == '*') {
                    ans = num * num1;
                }
                if (op == '%') {
                    ans = num % num1;
                }

            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid Operator!");
            }
            System.out.println(ans);
        }

        sc.close();
    }
}

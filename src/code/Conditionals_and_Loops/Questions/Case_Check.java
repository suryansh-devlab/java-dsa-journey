package code.Conditionals_and_Loops.Questions;

import java.util.Scanner;

public class Case_Check {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0); // trim remove extra spaces
        if (ch >= 97 && ch <= 122) {
            System.out.println("Lower case letter " + ch);
        } else if (ch >= 65 && ch <= 90) {
            System.out.println("Upper Case letter " + ch);
        } else {
            System.out.println("Enter a Valid Value");
        }

        sc.close();
    }
}

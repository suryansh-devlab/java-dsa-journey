package assignments.function;

import java.util.Scanner;

public class Min_Max {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        max(a, b, c);
        min(a, b, c);

        sc.close();
    }

    static void max(int a, int b, int c) {
        int result = Math.max(a, Math.max(b, c));
        System.out.println("Maximum among three " + result);
    }

    static void min(int a, int b, int c) {
        int result = Math.min(a, Math.min(b, c));
        System.out.println("Minimum among three " + result);
    }
}

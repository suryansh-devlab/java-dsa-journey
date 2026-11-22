package assignments.function;

import java.util.Scanner;

public class Pythagorean {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = Math.max(a, Math.max(b, c));

        check(a, b, c, max);

        sc.close();
    }

    static void check(int a, int b, int c, int h) {

        int x, y;

        if (h == a) {
            x = b;
            y = c;
        } else if (h == b) {
            x = a;
            y = c;
        } else {
            x = a;
            y = b;
        }
        if (h * h == x * x + y * y) {
            System.out.println("Given triplet is Pythagorean ");
        } else {
            System.out.println("Not a Pythagorean Triplet");
        }
    }
}

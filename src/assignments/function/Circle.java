package assignments.function;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius ");
        int radius = sc.nextInt();

        area(radius);
        circum(radius);

        sc.close();
    }

    static void area(int r) {
        int ar = (int) ((Math.PI) * r * r);
        System.out.println("Area of a circle is " + ar);
    }

    static void circum(int r) {
        int cir = (int) (2 * Math.PI * r);
        System.out.println("Circumference of a circle is " + cir);
    }
}

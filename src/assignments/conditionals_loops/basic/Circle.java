package assignments.conditionals_loops.basic;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle ");
        int radius = sc.nextInt();

        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;

        System.out.println("Area of a circle is " + area);
        System.out.println("Area of a perimeter is " + perimeter);

        sc.close();
    }
}

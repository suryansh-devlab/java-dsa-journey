package assignments.conditionals_loops.basic;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length ");
        int length = sc.nextInt();
        System.out.println("Enter breadth ");
        int breadth = sc.nextInt();

        int area = length * breadth;
        System.out.println(area);

        sc.close();
    }
}

package assignments.function;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mark ");
        grade(sc.nextInt());

        sc.close();
    }

    static void grade(int a) {

        // if (a >= 91 && a <= 100) {
        // System.out.println("AA");
        // } else if (a >= 81 && a <= 90) {
        // System.out.println("AB");
        // } else if (a >= 71 && a <= 80) {
        // System.out.println("BB");
        // } else if (a >= 61 && a <= 70) {
        // System.out.println("BC");
        // } else if (a >= 51 && a <= 60) {
        // System.out.println("CD");
        // } else if (a >= 41 && a <= 50) {
        // System.out.println("DD");
        // } else if (a <= 40 && a >= 0) {
        // System.out.println("FAIL");
        // } else {
        // System.out.println("Enter a valid mark ");
        // }

        // Method 2
        switch (a) {
            case 100, 99, 98, 97, 96, 95, 94, 93, 92, 91 ->
                System.out.println("AA");
            case 90, 89, 88, 87, 86, 85, 84, 83, 82, 81 ->
                System.out.println("AB");

            case 80, 79, 78, 77, 76, 75, 74, 73, 72, 71 ->
                System.out.println("BB");

            case 70, 69, 68, 67, 66, 65, 64, 63, 62, 61 ->
                System.out.println("BC");

            case 60, 59, 58, 57, 56, 55, 54, 53, 52, 51 ->
                System.out.println("CD");
            case 50, 49, 48, 47, 46, 45, 44, 43, 42, 41 ->
                System.out.println("DD");

            default -> {
                if (a >= 0 && a <= 40) {
                    System.out.println("FAIL");
                } else {
                    System.out.println("Enter a valid mark ");
                }
            }
        }
    }
}

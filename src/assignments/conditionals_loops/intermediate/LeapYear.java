package assignments.conditionals_loops.intermediate;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Year ");
        int yr = sc.nextInt();

        if (yr % 400 == 0 || yr % 4 == 0) {
            System.out.println("It is a leap year " + yr);
        } else {
            System.out.println("Not a leap year " + yr);
        }

        sc.close();
    }
}

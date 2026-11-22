package assignments.conditionals_loops.basic;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base ");
        int base = sc.nextInt();
        System.out.print("Enter height ");
        int height = sc.nextInt();

        int ans = 1 / 2 * (base * height);

        System.out.println(ans);
        sc.close();
    }
}

package code.function_methods;

import java.util.Scanner;

public class Greet {

    public static void main(String[] args) {

        String name = greet();

        System.out.println("Hello " + name);
    }

    static String greet() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");

        String greeting = sc.nextLine();

        sc.close();

        return greeting;
    }
}

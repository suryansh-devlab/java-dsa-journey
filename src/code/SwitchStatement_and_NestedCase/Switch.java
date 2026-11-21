package code.SwitchStatement_and_NestedCase;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String fruit = sc.next();

        switch (fruit) {
            case "Mango":
                System.out.println("King of fruit");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Orange":
                System.out.println("A round fruit");
                break;
            case "Papaya":
                System.out.println("Summer  fruit");
                break;
            case "Banana":
                System.out.println("Fav fruit");
                break;
            default:
                System.out.println("Please enter a valid fruit");
        }

        // Enhanced Switch Statement here break is not needed...
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruit");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Orange" -> System.out.println("A round fruit");
            case "Papaya" -> System.out.println("Summer  fruit");
            case "Banana" -> System.out.println("Fav fruit");
            default -> System.out.println("Please enter a valid fruit");
        }

        int day = sc.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }

        sc.close();
    }
}

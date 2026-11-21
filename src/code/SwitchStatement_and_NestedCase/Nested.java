package code.SwitchStatement_and_NestedCase;

import java.util.Scanner;

public class Nested {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int empId = sc.nextInt();

        switch (empId) {
            case 1:
                System.out.println("Suryansh Kushwaha");
                break;
            case 2:
                System.out.println("Kunal Kushwaha");
                break;
            case 3:
                System.out.println("Emp number 3");
                String department = sc.next();
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department for this!");
                }
                break;

            default:
                System.out.println("Enter a valid empId");
                break;
        }

        sc.close();
    }
}

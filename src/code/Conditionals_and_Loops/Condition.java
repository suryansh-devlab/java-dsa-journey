package code.Conditionals_and_Loops;

public class Condition {
    public static void main(String[] args) {

        // IF-ELSE CASE

        int salary = 25000;

        if (salary > 15000) {
            salary = salary + 2000;
        } else {
            salary = salary + 30000;
        }

        System.out.println(salary);

        // Multiple if-else statement

        if (salary > 20000) {
            salary += salary + 500;

        } else if (salary > 22000) {
            salary += 560;
        } else {
            salary += 100;
        }
        System.out.println(salary);
    }
}

package assignments.conditionals_loops.intermediate;

public class Go_out {
    public static void main(String[] args) {

        /*
         * Kunal is allowed to go out with his friends only on the even days of a given
         * month. Write a program to count the number of days he can go out in the month
         * of August
         */

        int Aug = 31;
        int count = 0;
        for (int i = 1; i <= Aug; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("Number of days Kunal Go-out is " + count);
    }
}

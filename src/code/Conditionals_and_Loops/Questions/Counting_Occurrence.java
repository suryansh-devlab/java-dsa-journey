package code.Conditionals_and_Loops.Questions;

public class Counting_Occurrence {
    public static void main(String[] args) {
        int n = 8090100;

        int count = 0;
        while (n > 0) {
            int rem = n % 10;

            if (rem == 0) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}

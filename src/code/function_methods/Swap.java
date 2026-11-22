package code.function_methods;

public class Swap {
    public static void main(String[] args) {

        int a = 10, b = 20;
        swap(a, b);
        /*
         * You cannot directly swap two primitive variables in Java by calling a method
         * like swap(a, b) Why? Java uses pass-by-value. The method receives copies of
         * the values, not the original variables.
         */
    }

    static void swap(int num1, int num2) {

        int temp = num1;
        num1 = num2;
        num2 = temp;
    }
}

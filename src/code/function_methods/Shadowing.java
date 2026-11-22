package code.function_methods;

public class Shadowing {
    static int x = 99;

    public static void main(String[] args) {
        System.out.println(x);
        int x = 40;
        System.out.println(x); // 40 because the higher level scope is hidden is called shadowing
        fun();
    }

    static void fun() {
        System.out.println(x);
    }
}

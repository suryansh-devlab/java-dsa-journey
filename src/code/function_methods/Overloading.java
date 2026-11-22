package code.function_methods;

public class Overloading {
    public static void main(String[] args) {

        /*
         * Method overloading means defining two or more methods with the same name but
         * different parameter lists within the same class.
         */
        fun(3);
        fun("Surya");
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String a) {
        System.out.println(a);
    }
}

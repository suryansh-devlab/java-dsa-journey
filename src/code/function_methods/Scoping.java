package code.function_methods;

public class Scoping {
    public static void main(String[] args) {

        int a = 10;
        // int b = 20;

        random(100);

        // System.out.println(marks); function scope we can access it

        {
            // int a = 30; // already initialize but we can modify it
            a = 30;

            int c = 50;
            System.out.println(c);
        }
        System.out.println(a);

        // System.out.println(c); we can not access it because c it is in a block scope
        // we can access anything beyond block
        int c = 20; // anything initialize inside a block we can reinitialize it outside the block
        System.out.println(c);

    }

    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}

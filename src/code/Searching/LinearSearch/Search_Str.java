package code.Searching.LinearSearch;

public class Search_Str {
    public static void main(String[] args) {

        String name = "Suryansh";

        // System.out.println(search(name, 'y'));
        // System.out.println(search2(name, 'x'));
        System.out.println(search3(name, 'u', 0, 1));
    }

    // Search in a string
    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }

        return false;
    }

    // convert string into array
    static boolean search2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (target == ch) {
                return true;
            }
        }

        return false;
    }

    // Search in a range
    static boolean search3(String str, char target, int start, int end) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = start; i <= end; i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }

        return false;

    }
}

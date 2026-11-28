package code.Searching.LinearSearch;

public class EvenDigits {
    public static void main(String[] args) {

        int[] nums = { 18, 124, 9, 1764, 98, 1 };
        System.out.println(findNumber(nums));

    }

    static int findNumber(int[] nums) {
        int count = 0;
        for (int ele : nums) {
            if (even(ele)) {
                count++;
            }
        }
        return count;
    }

    // function to check whether a number contains even digits or not
    static boolean even(int num) {
        int numberofDigits = digits(num);

        if (numberofDigits % 2 == 0) {
            return true;
        }
        return false;
    }

    // count number of digits in a number
    static int digits(int num) {

        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }

        return count;
    }
}

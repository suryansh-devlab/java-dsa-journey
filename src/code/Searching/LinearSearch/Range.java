package code.Searching.LinearSearch;

public class Range {
    public static void main(String[] args) {
        int[] arr = { 18, 12, -7, 3, 14, 28 };

        System.out.println(range(arr, 3, 0, 4));
    }

    static int range(int[] brr, int target, int start, int end) {

        for (int i = 0; i < brr.length; i++) {
            if (target == brr[i]) {
                return i;
            }
        }

        return -1;
    }
}

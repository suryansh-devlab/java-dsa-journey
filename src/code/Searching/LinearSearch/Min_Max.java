package code.Searching.LinearSearch;

public class Min_Max {
    public static void main(String[] args) {

        int[] arr = { 18, 12, -7, 3, 14, 28 };

        System.out.println(min(arr));
        System.out.println(max(arr));

    }

    static int min(int[] brr) {

        int minimum = brr[0];
        for (int i = 0; i < brr.length; i++) {
            if (brr[i] < minimum) {
                minimum = brr[i];
            }
        }
        return minimum;
    }

    static int max(int[] brr) {

        int maximum = brr[0];
        for (int i = 1; i < brr.length; i++) {
            if (brr[i] > maximum) {
                maximum = brr[i];
            }
        }
        return maximum;
    }
}

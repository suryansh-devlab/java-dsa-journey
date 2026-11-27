import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

        int[] arr = { 1, 3, 23, 9, 18 };

        reverse(arr);

        System.out.println(Arrays.toString(arr));

    }

    static void reverse(int[] brr) {
        int start = 0;
        int end = brr.length - 1;

        while (start < end) {
            swap(brr, start, end);
            start++;
            end--;
        }

    }

    static void swap(int[] brr, int index1, int index2) {
        int temp = brr[index1];
        brr[index1] = brr[index2];
        brr[index2] = temp;
    }
}

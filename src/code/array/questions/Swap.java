import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {

        int[] arr = { 1, 3, 23, 9, 16 };

        swap(arr, 1, 3);

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] brr, int index1, int index2) {
        int temp = brr[index1];
        brr[index1] = brr[index2];
        brr[index2] = temp;
    }
}

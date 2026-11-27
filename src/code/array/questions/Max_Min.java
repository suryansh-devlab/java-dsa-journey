public class Max_Min {
    public static void main(String[] args) {

        int[] arr = { 1, 3, 23, 0, 180 };

        System.out.println(maximum(arr));
        System.out.println(minimum(arr));
        System.out.println(maxRange(arr, 0, 3));
    }

    static int maximum(int[] brr) {

        if (brr.length == 0) {
            return -1;
        }

        int max = brr[0];
        for (int i = 1; i < brr.length; i++) {
            if (brr[i] > max) {
                max = brr[i];
            }
        }

        return max;
    }

    static int minimum(int[] crr) {
        int min = crr[0];
        for (int i = 1; i < crr.length; i++) {
            if (crr[i] < min) {
                min = crr[i];
            }
        }
        return min;
    }

    static int maxRange(int[] drr, int start, int end) {

        if (drr == null) {
            return -1;
        }
        if (start > end) {
            return -1;
        }
        int max = drr[start];
        for (int i = start + 1; i <= end; i++) {
            if (drr[i] > max) {
                max = drr[i];
            }
        }
        return max;
    }

}

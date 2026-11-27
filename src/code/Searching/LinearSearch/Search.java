package code.Searching.LinearSearch;

public class Search {
    public static void main(Search_Str[] args) {

        /*
         * Search in the array, return the index of item found otherwise if not found
         * return -1
         */

        int[] arr = { 1, 3, 25, 66, 785, 152 };

        System.out.println(LinearSearch(arr, 66));
    }

    // return index
    static int LinearSearch(int[] brr, int target) {
        if (brr.length == 0) {
            return -1;
        }

        for (int i = 0; i < brr.length; i++) {
            if (target == brr[i]) {
                return (i);
            }
        }
        return -1;
    }

    // return element
    static int LinearSearch1(int[] brr, int target) {
        if (brr.length == 0) {
            return -1;
        }

        for (int i = 0; i < brr.length; i++) {
            if (target == brr[i]) {
                return (brr[i]);
            }
        }
        return -1;
    }

    // Optimize
    static boolean LinearSearch2(int[] brr, int target) {
        if (brr.length == 0) {
            return false;
        }

        for (int ele : brr) {
            if (ele == target) {
                return true;
            }
        }
        return false;
    }
}

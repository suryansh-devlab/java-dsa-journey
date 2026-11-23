package code.array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int[][] arr = new int[3][3]; // 3 rows and 3 columns Array inside array

        // int[][] arr = {
        // { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }
        // };

        int[][] arr = new int[3][3];

        // Taking Input from user

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        System.out.println();

        // Output

        // Method: 1
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // Method: 2
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        // Method: 3
        System.out.println();
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
        sc.close();
    }
}

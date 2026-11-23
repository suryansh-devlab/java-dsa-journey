package code.array;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // array of primitives 
        int[] arr = new int[5];

        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 233;
        arr[3] = 543;
        arr[4] = 3;
        System.out.println(arr[1]);
        // System.out.println(arr[5]); // error index out of bound

        // Input using for-loop 

        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = sc.nextInt();
        // }
      
        System.out.println(Arrays.toString(arr) + " "); // to-string Method

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        for(int num : arr){
            System.out.print(num + " "); // here num represents the element of an arr
        }

        System.out.println();
        // array of objects 
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));

        sc.close();
    }
}

package pl.coderslab.arrays;

import java.util.Arrays;
import java.util.Random;

public class Main05 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] arr = new int[10];

        for (int i=0;i<arr.length;i++){
            arr[i]=random.nextInt(11);
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

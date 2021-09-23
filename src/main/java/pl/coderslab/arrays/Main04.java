package pl.coderslab.arrays;

import java.util.Arrays;
import java.util.Random;

public class Main04 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];
        int[] arrRev = new int[10];

        for (int i=0;i<arr.length;i++){
            arr[i]=random.nextInt(51);
        }
        int reversCounter =0;
        for (int i =arr.length-1;i>=0;i--){
            arrRev[reversCounter]=arr[i];
            reversCounter++;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrRev));
    }
}
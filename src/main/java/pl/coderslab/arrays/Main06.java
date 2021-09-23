package pl.coderslab.arrays;

import java.util.Arrays;

public class Main06 {

    public static void main(String[] args) {
        int[] numbers = {2, 3};
        int[] secondNumbers = {3, 4};

        int [] sum = new int[numbers.length];


        int second =0;
        for (int i =0; i<sum.length;i++){

            sum[i]= numbers[second] + secondNumbers[second];
            second++;
        }

        System.out.println(Arrays.toString(sum));
    }
}

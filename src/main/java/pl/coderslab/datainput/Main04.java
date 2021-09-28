package pl.coderslab.datainput;

import java.util.Arrays;
import java.util.Scanner;

public class Main04 {

    public static void main(String[] args) {
        rowsColumns();
    }

    public static void rowsColumns(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write rows");
        int rows = read(scanner);
        System.out.println("Write columns");
        int columns = read(scanner);



        int [] [] arr = new int[rows][columns];
        int sum =0;
        int number =1;

        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=number;
                sum+=arr[i][j];
                number++;
            }
        }
        System.out.println("Sum "+sum);
        System.out.println("Ilość "+ (number-1));

    }
    public static int read(Scanner scanner){
        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.println("Only numbers");
        }
        return scanner.nextInt();
    }
}

package pl.coderslab.datainput;

import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {

        operations();
    }

    public static void operations(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write first number");
        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.println("Only numbers");
        }

        int first = scanner.nextInt();
        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.println("Only numbers");
        }
        int second = scanner.nextInt();

        System.out.println("Add " + (first+second));
        System.out.println("Min " + (first-second));
        System.out.println("Divide " + (first/second));
        System.out.println("Multiply " + (first*second));

    }
}

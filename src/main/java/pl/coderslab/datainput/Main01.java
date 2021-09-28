package pl.coderslab.datainput;

import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {
        getInfo();

    }
    public static void getInfo(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write the name");
        String str = scanner.nextLine();

        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.println("write the number");
        }

        int age = scanner.nextInt();

        System.out.println(str+" ma "+age+" lat");
    }
}

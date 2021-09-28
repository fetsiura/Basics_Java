package pl.coderslab.datainput;

import java.util.Scanner;

public class Main03 {

    public static void main(String[] args) {
        getData();

    }

    public static void getData() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;
        int input;

        do {
            input = read(scanner);
            sum+=input;
            if(input!=0){
                counter++;
            }

        } while (input!=0);

        System.out.println("Sum "+sum);
        System.out.println("Ilość "+counter);
    }

    public static int read(Scanner scanner){
        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.println("Only numbers");
        }
        return scanner.nextInt();
    }
}

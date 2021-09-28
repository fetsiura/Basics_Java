package pl.coderslab.datainput;

import java.util.Scanner;

public class Main06 {

    public static void main(String[] args) {
        equation();

    }

    public static void equation() {
        Scanner scanner = new Scanner(System.in);
        int a = readInt(scanner);
        int b = readInt(scanner);
        int c = readInt(scanner);

        double delta = (b*b) - (4 * a * c);

        if(delta < 0) {
            System.out.println("nie ma pierwiastkow");
        } else if (delta == 0) {
            double result = (-b)/(2.0*a);
            System.out.println("Jest jeden pierwiastek = " + result);
        } else {
            double x1 = ((-b)-(Math.sqrt(delta)))/2.0*a;
            double x2 = ((-b)+(Math.sqrt(delta)))/2.0*a;
            System.out.println("x1 = " + x1 + "  x2 = " + x2);
        }


    }

    public static int readInt(Scanner scanner) {
        System.out.println("Podaj liczbe");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Podaj poprawna liczbe");
        }
        return scanner.nextInt();
    }


}
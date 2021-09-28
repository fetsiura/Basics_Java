package pl.coderslab.datainput;

import java.util.Scanner;

public class Main05 {

    public static void main(String[] args) {

        textLines();
    }

    public static void textLines(){
        Scanner scanner = new Scanner(System.in);
        String input ="";

        do {
            input = scanner.nextLine();
            if(!input.equals("quit")){
                System.out.println(input);
            }

        } while (!input.equals("quit"));
    }
}

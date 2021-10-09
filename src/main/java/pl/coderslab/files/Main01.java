package pl.coderslab.files;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        try(PrintWriter printWriter = new PrintWriter("text1.txt")){
            while (scanner.hasNextLine()){
                stringBuilder.append(scanner)
            }
        }catch (FileNotFoundException e){
            System.out.println("nie istnieje");
        }
    }
}

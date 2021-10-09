package pl.coderslab.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main02 {

    public static void main(String[] args) {

        File file = new File("text1.txt");
//
//        try{
//            Scanner scanner = new Scanner(file);
//            while (scanner.hasNextLine()){
//                System.out.println(scanner.nextLine());
//            }
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//        }
        StringBuilder stringBuilder = new StringBuilder();
        try(Scanner scanner = new Scanner(file)){
            while (scanner.hasNextLine()) {
                stringBuilder.append(scanner.nextLine() + "\n");
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

        System.out.println(stringBuilder.toString());
    }
}

package pl.coderslab.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main04 {

    public static void main(String[] args) {

        File file = new File("text4.txt");

        try(Scanner scanner = new Scanner(file)){

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                    if (line.toLowerCase().contains("javy")){
                        System.out.println(line);
                    }
                }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}

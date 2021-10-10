package pl.coderslab.filesnio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main04 {

    public static void main(String[] args) {
        writeToFile("IO_text4.txt");

    }

    public static void writeToFile(String fileName){

        Path path = Paths.get(fileName);

        if(!Files.exists(path)){
            try {
                Files.createFile(path);
            }catch (IOException e){
                e.printStackTrace();
            }
        }

        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        String input = "";
        do {
            input = scanner.nextLine();
            if(!input.equals("quit")) {
                list.add(input);
            }
        } while (!input.equals("quit"));


        try {

                Files.write(path,list);

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

package pl.coderslab.filesnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main05 {

    public static void main(String[] args) {

        readFromFile("IO_lev5.txt");
    }
    public static void readFromFile(String fileName){

        Path path = Paths.get(fileName);
        Path path2 = Paths.get(fileName.substring(0, fileName.lastIndexOf('.'))+".html");

        if(Files.exists(path)){
            try {
                Files.createFile(path2);
                List<String> list = new ArrayList<>();

                for (String line : Files.readAllLines(path)){
                    list.add(line);
                }

                Files.write(path2,list);

            }catch (IOException e){
                e.printStackTrace();
            }
        }




    }
}

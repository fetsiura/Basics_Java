package pl.coderslab.filesnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main02 {

    public static void main(String[] args) {

        createFile("Lev2.txt");
    }

    public static void createFile (String fileName){
        Path path = Paths.get(fileName);

        if(!Files.exists(path)){
            try {

                Files.createFile(path);
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}

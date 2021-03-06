package pl.coderslab.filesnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main01 {

    public static void main(String[] args) {

        createDirectory("Lev1");
    }

    public static void createDirectory(String fileName){
        Path path = Paths.get(fileName);

        if(!Files.exists(path)){
            try {
                Files.createDirectory(path);
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}

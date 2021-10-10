package pl.coderslab.filesnio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main03 {

    public static void main(String[] args) {
        copyFile("Lev1","Lev2.txt","copied.txt");

    }
    public static void copyFile(String directory, String fileName, String secondFileName){
        Path path = Paths.get(directory+"/"+fileName);
        Path path2 = Paths.get(directory+"/"+secondFileName);

        if (Files.exists(path)){

            try {

                Files.copy(path,path2);
            }catch (IOException e){
                e.printStackTrace();
            }
        }


    }
}

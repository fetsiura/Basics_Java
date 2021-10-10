package pl.coderslab.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main05 {

    public static void main(String[] args) {
        File file = new File("text5.txt");
        String [] languages = new String[0];
        try(Scanner scanner = new Scanner(file)){

            while (scanner.hasNextLine()){
                languages = addValue(languages,scanner.nextLine());
            }


        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        Arrays.sort(languages);
        try(PrintWriter printWriter =new PrintWriter("text5_res.txt")){

            for (String val : languages){
                printWriter.println(val);
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }

    public static String[] addValue(String[] tab, String value) {
        String[] tmpTab = Arrays.copyOf(tab, tab.length + 1);
        tmpTab[tmpTab.length - 1] = value;
        return tmpTab;
    }
}

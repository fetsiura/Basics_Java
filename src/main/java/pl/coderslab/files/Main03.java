package pl.coderslab.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main03 {

    public static void main(String[] args) {

        File file = new File("text3.txt");
        double sum=0;
        try(Scanner scanner =new Scanner(file)){

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();

                String [] lines = line.split(",");

                for (String val : lines){

                    try{
                        double number = Double.parseDouble(val);
                        sum+=number;
                    } catch (NumberFormatException e){
                        System.out.println("its not a number");
                    }
                }
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        System.out.println(sum);

    }
}

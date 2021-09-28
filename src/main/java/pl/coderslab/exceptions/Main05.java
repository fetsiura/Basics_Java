package pl.coderslab.exceptions;


import java.util.IllegalFormatException;

public class Main05 {

    public static void main(String[] args) {


        try {
//            int num = Integer.parseInt("xyz") ;
        int num = Integer.parseInt("12") ;
            System.out.println(num);

        } catch (IllegalFormatException e){
            e.printStackTrace();
        }

    }

}

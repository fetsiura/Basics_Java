package pl.coderslab.exceptions;

public class Main02 {

    public static void main(String[] args) {
        int[] tab = {  5, 1, 6, 7, 8 } ;

        try {
            System.out.println(tab[21]);

        } catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("its not exists");
        }
    }

}

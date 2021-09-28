package pl.coderslab.exceptions;

public class Main03 {

    public static void main(String[] args) {

        try{
            showLength(null);

        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }

    static void showLength(String s) {

        System.out.println(s.length());
    }

}

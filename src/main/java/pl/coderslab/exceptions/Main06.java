package pl.coderslab.exceptions;


import java.util.IllegalFormatException;

public class Main06 {

    public static void main(String[] args) {
            try {
                int res = divide(10,0);
            }catch (IllegalFormatException e){
                e.printStackTrace();
            }
    }

    static int divide (int a, int b){
        if(b==0){
            throw new IllegalArgumentException("count by 0");
        }
        return a/b;
    }

}

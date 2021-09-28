package pl.coderslab.exceptions;


public class Main01 {

    public static void main(String[] args) {

        try {
            int res = factorial(-2);
        } catch (IllegalAccessError e){
            e.printStackTrace();
        }
    }

    static int factorial(int number) {
        if(number<0){
            throw new IllegalArgumentException("number is negative");
        }
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}

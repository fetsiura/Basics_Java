package pl.coderslab.methods;

public class Main02 {

    public static void main(String[] args) {
        int res = 3;

        System.out.println(square(res));
    }

    public static int square(int num){
       return (int) Math.pow(num,2);
    }
}

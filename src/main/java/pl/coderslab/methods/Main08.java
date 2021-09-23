package pl.coderslab.methods;

public class Main08 {

    public static void main(String[] args) {
        int a = 3;
        int b = 1;
        int c = 2;

        System.out.println(maxOfThree(a,b,c));

    }

    public static int maxOfThree(int a, int b,int c){
        if(a>b && a>c){
            return a;
        }

        if(b>a && b>c){
            return b;
        } else {
            return c;
        }
    }
}

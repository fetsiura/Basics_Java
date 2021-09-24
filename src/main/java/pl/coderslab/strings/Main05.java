package pl.coderslab.strings;

public class Main05 {

    public static void main(String[] args) {
            String [ ] arr = {"a"+"b"+"c"};

        System.out.println(stringFromArray(arr));

    }

    static String stringFromArray(String[] str){

        return String.join("-",str);
    }
}

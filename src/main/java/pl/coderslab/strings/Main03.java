package pl.coderslab.strings;

public class Main03 {

    public static void main(String[] args) {
        String str = "Jaros";
        String str1 = "CodersLab";

        System.out.println(firstHalf(str));
        System.out.println(firstHalf(str1));

    }

    static String firstHalf(String str){
        return str.substring(0,str.length()/2);
    }
}

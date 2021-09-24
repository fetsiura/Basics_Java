package pl.coderslab.strings;

public class Main06 {

    public static void main(String[] args) {

    String str = "codersLabxyz";
    String res ="";
    for(int i =str.length()-1;i>=0;i--){
        res = res + str.charAt(i);

    }

        System.out.println(res);
    }
}

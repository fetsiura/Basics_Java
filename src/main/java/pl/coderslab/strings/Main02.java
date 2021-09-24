package pl.coderslab.strings;

public class Main02 {

    public static void main(String[] args) {
        String str = "Laska";

        System.out.println(charPos(str,'a'));

    }

    static int charPos(String str, char c) {

        return str.indexOf(c);
    }
}

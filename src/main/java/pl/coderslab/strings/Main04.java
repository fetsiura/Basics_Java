package pl.coderslab.strings;

public class Main04 {

    public static void main(String[] args) {
        String str = "Jaros";
        String search = "ar";
        String search2 = "qqq";
        System.out.println(containsStr(str,search));
        System.out.println(containsStr(str,search2));

    }

    static boolean containsStr(String str, String search){

        return str.contains(search);
    }
}

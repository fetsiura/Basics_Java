package pl.coderslab.methods;

public class Main04 {

    public static void main(String[] args) {

        String n = "A";
        String w = "B";
        String e = "C";

        System.out.println(createName(n,w,e));
    }

    public static String createName(String name, String surname, String nickname){
        return name+" "+surname+" "+nickname;
    }
}

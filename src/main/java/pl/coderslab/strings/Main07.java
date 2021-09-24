package pl.coderslab.strings;

public class Main07 {

    public static void main(String[] args) {

//    String str = "A to kanapa pana kota";
    String str = "kajak";

    String s2 = str.replaceAll(" ","");
    String s1 = s2.toLowerCase();


        for(int i=0; i < s1.length() / 2; i++) { /// бо якщо це паліндром то до половини одне і теж
            char firstChar = str.charAt(i);
            char secondChar = str.charAt(str.length() - 1 - i);
            if(firstChar != secondChar) {
                System.out.println("To nie jest palindrom");
                break;
            } else {
                System.out.println("To jest palindrom");
                break;
            }
        }
    }
}

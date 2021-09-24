package pl.coderslab.cutstrings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main04 {

    public static void main(String[] args) {
        String str ="Java-zadania-podzial-napisow";

        System.out.println(Arrays.toString(onlyTwoElements(str,'-')));

    }

    public static String[] onlyTwoElements(String str, char separator){

        return str.split(Character.toString(separator),1);
    }
}

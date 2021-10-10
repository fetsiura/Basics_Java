package pl.coderslab.externaljar;

import org.apache.commons.lang3.StringUtils;

public class Main04 {


    public static void main(String[] args) {
        System.out.println(checkPalindrome("Gorod dorog"));
    }

    public static boolean checkPalindrome(String str){
        String res = StringUtils.deleteWhitespace(str).toLowerCase();

        String a = res.substring(0,res.length()/2);
        String b = StringUtils.reverse(res);
        return a.equals(b.substring(0,b.length()/2));

    }
}

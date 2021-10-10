package pl.coderslab.externaljar;

import org.apache.commons.lang3.StringUtils;

public class Main03 {
    public static void main(String[] args) {
        String [] str = {"a","b","c"};

        System.out.println(stringFromArray(str));
    }

    public static String stringFromArray(String[] str){
        return StringUtils.join(str);
    }
}

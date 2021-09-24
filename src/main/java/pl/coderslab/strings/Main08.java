package pl.coderslab.strings;

public class Main08 {

    public static void main(String[] args) {
        String str = "JaRo";

        System.out.println(toggleChar(str));
    }

    static String toggleChar(String str) {
        StringBuilder sb= new StringBuilder();

        for (char res : str.toCharArray()){
            if(Character.isLowerCase(res)){
                char up = Character.toUpperCase(res);
                sb.append(up);
            }
            if(Character.isUpperCase(res)){
                char low = Character.toLowerCase(res);
                sb.append(low);
            }
        }
        return sb.toString();
    }
}

package pl.coderslab.strings;

public class Main01 {

    public static void main(String[] args) {

    String str = "CodersLab jak dobrze zacząć programować";

        char string = str.charAt(str.length() - 2);  // довжина з заду
        char [] arr = str.toCharArray();

        int counter =0;
        for(int i =0; i<arr.length;i++){
            if(arr[i]==string){
                counter++;
            }
        }

        System.out.println(counter);
    }
}

package pl.coderslab.cutstrings;

public class Main01 {

    public static void main(String[] args) {

    String str = "Naucz się programować od podstaw i rozwiń wymarzoną karierę w branży IT.";
    String [ ] res = str.split(" ");

    for (String s : res){
        System.out.println(s);
    }
    }
}

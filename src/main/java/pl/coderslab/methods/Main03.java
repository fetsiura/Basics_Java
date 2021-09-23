package pl.coderslab.methods;

public class Main03 {

    public static void main(String[] args) {
     double pln = 100;

        System.out.println(convertToUsd(pln));
    }

    public static double convertToUsd(double pln){
        return pln/4.04;
    }
}

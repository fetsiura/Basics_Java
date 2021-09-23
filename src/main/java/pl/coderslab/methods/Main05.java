package pl.coderslab.methods;

public class Main05 {

    public static void main(String[] args) {
        double b = 1000;
        double vat = 29;

        System.out.println(calculateNetto(b,vat));
    }

    public static double calculateNetto(double brutto, double vat){
        if (vat>0 && vat<100){
            return brutto-(brutto/100*vat);
        } else {
            return 0;
        }
    }
}

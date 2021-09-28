package pl.coderslab.datainput;

import java.util.Scanner;

public class Main07 {

    public static void main(String[] args) {

            nettoBrutto();

        }

        public static void nettoBrutto() {
            Scanner scanner = new Scanner(System.in);
            String mode = readMode(scanner);
            double value = readDouble(scanner);
            double result = 0;
            if(mode.equals("bn")) {
                result = value / 1.23;
            } else {
                result = value * 1.23;
            }
            System.out.println("Wynik = " + result);
        }

        public static String readMode(Scanner scanner) {
            String answer = "";
            do {
                System.out.println("Podaj bn lun nb");
                answer = scanner.nextLine();
            } while (!(answer.equals("bn") || answer.equals("nb")));
            return answer;
        }

        public static double readDouble(Scanner scanner) {
            System.out.println("Podaj liczbe");
            while (!scanner.hasNextDouble()) {
                scanner.next();
                System.out.println("Podaj poprawna liczbe");
            }
            return scanner.nextDouble();
        }

    }
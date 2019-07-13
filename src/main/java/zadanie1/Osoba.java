package zadanie1;

import java.util.Scanner;

public class Osoba extends Portfel {

    public static void main(String[] args) {

        Scanner wejscie = new Scanner( System.in );
        System.out.println( " Podaj kwotę jaką wydasz " );

        double a;
        a = wejscie.nextDouble();
        if (a >= 0) {
            System.out.println( " Jakiej waluty użyjesz " );
            System.out.println( " Dla pl wybierz 1" );
            System.out.println( " Dla euro wybierz 2" );
            System.out.println( " Dla dolar wybierz 3" );
            int e;
            e = wejscie.nextInt();


            switch (e) {
                case 1: {
                    double b = 20;
                    System.out.println( "pl:" );

                }
                break;
                case 2: {
                    double c = 50;
                    System.out.println( "euro:" );
                }
                break;
                case 3: {
                    double d = 15;
                    System.out.println( "dolar:" );
                }
                break;
            }


        } else {
            System.out.println( " kwota musi byc wieksza od zera " );
        }

    }
}
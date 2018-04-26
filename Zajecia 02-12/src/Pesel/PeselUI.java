package Pesel;

import java.util.Scanner;

public class PeselUI {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj numer pesel");
        String pesel=scanner.nextLine();
        //------------------------------------

        PeselWynikiWeryfikacji wyniki=PeselWeryfikator.sprawdzPesel(pesel);
        if(wyniki.isPeselPrawidlowy()){
            System.out.println("Wprowadzonu numer PESEL jest prawidłowy.");
            System.out.println("Data urodzenia: "+wyniki.getDataUrodzenia());
            System.out.println("Plec: "+wyniki.getPlec());
        }else{
            System.out.println("Wprowadzony numer PESEL jest nieprawidłowy");
        }
    }
}

package Parzystosc;

import java.util.Scanner;

public class Parzystosc {

    public static void main(String[] args) {
        //1.Pobieramy liczbe od uzytkownika
        System.out.println("Podaj liczbe: ");
        Scanner scanner=new Scanner(System.in);
        String liczbaString=scanner.nextLine();
        try{
            Integer liczba=Integer.parseInt(liczbaString);
            //2.Sprawdzamy czy jest podzielna przez 2 - warunek parzystosci)
            if(liczba%2==0){
                System.out.println("Liczba jest parzysta");
            }else{
                System.out.println("Liczba jest nieparzysta");
            }
        }catch(NumberFormatException e){
            System.out.println("Podales niepoprawna liczbe-program zakonczy prac.");
            return;
        }
    }
}

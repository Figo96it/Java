package Zadanie1;

import java.util.Scanner;

public class Wielokrotnosc {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj pierwszą liczę: ");
        String liczbaPodstawowaString=scanner.nextLine();
        try{
            Integer liczbaPodstawowa=Integer.parseInt(liczbaPodstawowaString);
            System.out.println("Ile wielokrotnosci wyswietlic: ");
            //Równoważne:
            //String iloscWielokrotnosci=scanner.nextLine();
            //Integer wielokrotnosc=Integer.parseInt(iloscWielokrotnosci);
            Integer wielokrotnosc=Integer.parseInt(scanner.nextLine());
            if(wielokrotnosc<=0){
                System.out.println("Niepoprawna liczba wielokrotności.");
                return;
            }else{
                System.out.println("Mając podaną liczbą "+liczbaPodstawowa+" i ilość wielokrotności "+wielokrotnosc+" wyniki są następujace: ");
                for(int i=0;i<=wielokrotnosc;i++){
                    System.out.println(liczbaPodstawowa*i);
                }
            }
        }catch (NumberFormatException e){
            System.out.println("Wystapil błąd.");
            return;
        }
    }
}

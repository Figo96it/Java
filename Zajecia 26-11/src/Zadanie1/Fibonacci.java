package Zadanie1;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj ile elementów ciągu chcesz obliczyc: ");
        String iloscElementowString=scanner.nextLine();
        try{
            Integer iloscElementów=Integer.parseInt(iloscElementowString);
            //wyznaczanie elementów ciagu
            Integer liczbaMinus1=1;
            Integer liczbaMinus2=0;

            String wynikDoWyswietlenia="%d element ciągu: %d";
            for(int i=0;i<iloscElementów;i++){
                if(i==0){
                    System.out.println(String.format(wynikDoWyswietlenia,i,0));
                }else if(i==1){
                    System.out.println(String.format(wynikDoWyswietlenia,i,1));
                }else{
                    Integer wynik=liczbaMinus1+liczbaMinus2;
                    System.out.println(String.format(wynikDoWyswietlenia,i,wynik));
                    liczbaMinus2=liczbaMinus1;
                    liczbaMinus1=wynik;
                }
            }

        }catch(NumberFormatException e){
            System.out.println("Niepoprawna ilość elementów.");
            return;
        }
    }
}

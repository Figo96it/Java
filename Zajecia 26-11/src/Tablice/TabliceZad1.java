package Tablice;

public class TabliceZad1 {

    public static void main(String[] args) {
        int[] tablica=new int[10];
        //Uzupelniamy kolejno
        for(int i=0;i<tablica.length;i++){
            tablica[i]=i+1;
        }
        wyswietlTablice(tablica);
        //Zwiekszenie co 3 liczby wartoscia poprzednika
        for(int i=2;i<tablica.length;i=i+3){
            tablica[i]+=tablica[i-1];
        }
        wyswietlTablice(tablica);
        //Kazdá parzysta dzielimy przez 2
        for(int i=0;i<tablica.length;i++){
            if(tablica[i]%2==0){
                tablica[i]/=2;
            }
        }
        wyswietlTablice(tablica);
        //Wyswietlamy sume
        int suma=0;
        for(int i=0;i<tablica.length;i++){
            suma+=tablica[i];
        }
        System.out.println("Suma: "+suma);

    }

    public static void wyswietlTablice(int[] tab){
        for(int i=0;i<tab.length;i++){
            System.out.print(tab[i]+" ");
        }
        System.out.println("=========================");
    }
}

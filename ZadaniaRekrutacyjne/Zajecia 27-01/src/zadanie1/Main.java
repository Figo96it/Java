package zadanie1;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static int[] array;

    public static void main(String[] args) {

        getTheSizeOfTheArray();
        fillWithRandomNumbers();
        printArray();
        reverseArray();
        printArray();
        randomEvenNumbers();
        printArray();
        reverseArray();
        printArray();

    }

    public static void getTheSizeOfTheArray(){
        Scanner scan=new Scanner(System.in);
        int size;
        do {
            System.out.println("Wprowadź rozmiar tablicy: ");

            while(!scan.hasNextInt()){
                System.out.println("INVALID");
                scan.next();
            }
            size = scan.nextInt();

        }while(size<0);
        array = new int[size];

    }

    public static void fillWithRandomNumbers(){
        Random rand=new Random();

        for(int i=0;i<array.length;i++){
            array[i]=rand.nextInt(200)-100;
            //WYPELNIAMY TABLICE LICZBAMI Z ZAKRESU -100 DO 99
        }
    }

    public static void reverseArray(){
        int[] newArray=new int[array.length];

        System.out.println("REVERSED");
        for(int i=0,j=array.length-1;i<array.length;i++,j--){
            newArray[i]=array[j];
        }

        array=newArray;
    }

    public static void printArray(){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
            if(i<array.length-1){
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void randomEvenNumbers(){
        Random rand=new Random();
        int x;

        for(int i=0;i<array.length;i++){
            x=rand.nextInt(446)+400;
            if(x%2==0){
                array[i]=x;
            }
        }
    }
}

package zadanie11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    private static List<Integer> linkedList= new LinkedList<>();
    private static List<Integer> arrayList= new ArrayList<>();
    private static int numberOfElement=500_000;

    public static void main(String[] args) {

        System.out.println("=======================");
        System.out.println("Wstawianie na koniec: ");
        System.out.printf("ArrayList: %s ms\n\n", addEnd(arrayList));
        System.out.printf("LinkedList: %s ms\n\n", addEnd(linkedList));


        System.out.println("=======================");
        System.out.println("Wstawianie na poczatek: ");
        System.out.printf("ArrayList: %s ms\n\n", addStart(arrayList));
        System.out.printf("LinkedList: %s ms\n\n", addStart(linkedList));


        System.out.println("=======================");
        System.out.println("Wstawianie prez indeks: ");
        System.out.printf("ArrayList: %s ms\n", sumElements(arrayList));
        System.out.printf("LinkedList: %s ms\n\n", sumElements(linkedList));

    }

    public static long addEnd(List<Integer> lista){
        long start=System.currentTimeMillis();

        for(int i=0;i<numberOfElement;i++){
            lista.add(i);
        }

        long end=System.currentTimeMillis();
        return end-start;
    }

    public static long addStart(List<Integer> lista){
        long start=System.currentTimeMillis();

        for(int i=0;i<numberOfElement;i++){
            lista.add(0,i);
        }

        long end=System.currentTimeMillis();
        return end-start;
    }

    private static long sumElements(List<Integer> list){
        long start=System.currentTimeMillis();
        long suma=0;
        for(int i=0;i< numberOfElement;i++){
            suma+=list.get(i);
        }
        long end=System.currentTimeMillis();
        return end-start;
    }

}

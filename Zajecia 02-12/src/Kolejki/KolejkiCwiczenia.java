package Kolejki;

import Zadanie4.Osoba;
import Zadanie4.PorowynawarkaOsob;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class KolejkiCwiczenia {
    public static void main(String[] args) {
        //testKolejkaZwykla();

        //1 Sposób
        /*
        Comparator porownaniePrzezWiek=new PorowynawarkaOsob();
        Queue<Osoba> kolejka=new PriorityQueue<>(porownaniePrzezWiek);
        */

        //2 Sposób
        /*Comparator<Osoba> porownanieNazwisk=new Comparator<Osoba>() {
            @Override
            public int compare(Osoba o1, Osoba o2) {
                if(o1.getNazwisko().compareToIgnoreCase(o2.getNazwisko())<0){
                    return -1;
                }else if(o1.getNazwisko().compareToIgnoreCase(o2.getNazwisko())>0){
                    return 1;
                }else{
                    if(o1.getImie().compareToIgnoreCase(o2.getImie())<0){
                        return -1;
                    }else if(o1.getImie().compareToIgnoreCase(o2.getImie())>0){
                        return 1;
                    }else{
                        return 0;
                    }
                }
            }
        };
        Queue<Osoba> kolejka=new PriorityQueue<>(porownanieNazwisk);
        */

        //3 Sposób - ale klasa Osoba musi implementowac Comparable
        Queue<Osoba> kolejka=new PriorityQueue<>();

        kolejka.offer(new Osoba("Jan", "Kowalski", 18,"000000000"));
        kolejka.offer(new Osoba("Mariusz", "nowak", 40,"000000000"));
        kolejka.offer(new Osoba("Adam", "nowak", 40,"000000000"));
        kolejka.offer(new Osoba("Agnieszka", "kałamaj", 9,"000000000"));
        System.out.println(kolejka);
        System.out.println(kolejka.poll());
        System.out.println(kolejka.poll());
        System.out.println(kolejka.poll());
        System.out.println(kolejka.poll());
    }

    public static void testKolejkaZwykla(){
        Queue<String> kolejka=new PriorityQueue<>();
        kolejka.offer("Element 1");
        kolejka.offer("Element 2");
        kolejka.offer("Element 3");
        System.out.println(kolejka);
        System.out.println(kolejka.peek()); //Pobieramy element, ale nie usuwamy z kolejki
        System.out.println(kolejka.peek());
        System.out.println(kolejka.poll()); //Pobieramy element i usuwamy z kolejki
        System.out.println(kolejka);
        System.out.println(kolejka.poll());
        System.out.println(kolejka);
        System.out.println(kolejka.poll());
        System.out.println(kolejka.poll());

    }
}

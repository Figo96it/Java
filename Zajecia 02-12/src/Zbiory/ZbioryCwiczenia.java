package Zbiory;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ZbioryCwiczenia {

    public static void main(String[] args) {
        hashSetPrzyklad();
    }

    public static void hashSetPrzyklad(){
        Set<Integer> zbior=new HashSet<>();
        zbior.add(2);
        zbior.add(5);
        zbior.add(8);
        zbior.add(2);
        zbior.add(2);
        System.out.println(zbior.add(3));
        System.out.println(zbior.add(3));
        System.out.println(zbior);
        zbior.remove(5);
        System.out.println(zbior);

        Iterator<Integer> iterator=zbior.iterator();
        while (iterator.hasNext()){
            Integer value=iterator.next();
            System.out.println(value);
        }
    }
}

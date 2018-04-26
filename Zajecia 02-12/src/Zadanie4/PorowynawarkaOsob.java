package Zadanie4;

import java.util.Comparator;

public class PorowynawarkaOsob implements Comparator<Osoba>{
    @Override
    public int compare(Osoba o1, Osoba o2) {
        if(o1.getWiek()<o2.getWiek()){
            return -1;
        }else if(o1.getWiek()>o2.getWiek()){
            return 1;
        }else{
            return 0;
        }
    }
}

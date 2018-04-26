package Mapy;

import Zadanie4.Osoba;

import java.util.HashMap;
import java.util.Map;

public class MapyCwiczenia {

    public static void main(String[] args) {
        //mapaPrzyklad();
        Map<String, Osoba> osoby=new HashMap<>();
        osoby.put("1",new Osoba("Jan","Kowalski",24,"921224215"));
        System.out.println(osoby);
        Map<String, Osoba> kopiaOsoby=new HashMap<>(osoby);
        System.out.println(osoby);
        System.out.println(kopiaOsoby);
        Osoba osoba=kopiaOsoby.get("1");
        System.out.println(osoba);
        osoba.setNazwisko("Orłoś");
        kopiaOsoby.put("1",osoba);

        System.out.println(osoba);
        System.out.println(kopiaOsoby);
    }

    public static void mapaPrzyklad(){
        Map<String, String> mapa=new HashMap<>();
        mapa.put("Ilosc kursantow","17");
        mapa.put("Data","2.12.2017");
        System.out.println(mapa);
        mapa.put("Data","3.12.2017");
        System.out.println(mapa);
        String oldValue=mapa.put("Data","4.12.2017");
        System.out.println(mapa);
        System.out.println("----------------------");
        System.out.println(oldValue);
        Map<String, String> nowaMapa=new HashMap<>(mapa);
        System.out.println(nowaMapa);
        nowaMapa.put("Prowadzacy","Damian Figinski");
        nowaMapa.put("Data","5.12.2017");
        System.out.println(nowaMapa);
        System.out.println(mapa);
        System.out.println("----------------------");

        for(String klucz : nowaMapa.keySet()){
            System.out.println(klucz);
            System.out.println("Wartosc- "+nowaMapa.get(klucz));
        }
        System.out.println("----------------------");

        for(String wartosc : nowaMapa.values()){
            System.out.println(wartosc);
        }
        System.out.println("----------------------");

        for(Map.Entry<String, String> para : nowaMapa.entrySet()){
            System.out.println(String.format("Klucz: %s, Wartosc: %s",para.getKey(),para.getValue()));
        }
    }
}

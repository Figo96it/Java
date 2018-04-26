package sortowanie;

import jdk.internal.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.List;

public class SortowanieSzybkie implements Sortowanie {
    @Override
    public String getNazwaAlgorytmu() {
        return "Sortowanie Szybkie";
    }

    @Override
    public int[] sortuj(int[] tablica) {
        List<Integer> lista=new ArrayList<>();
        for(int element : tablica){
            lista.add(element);
        }
        lista=sortujRekurencyjnie(lista);
        for(int i=0;i<lista.size();i++){
            tablica[i]=lista.get(i);
        }

        return tablica;

    }

    private List<Integer> sortujRekurencyjnie(List<Integer> lista){
        if(lista.size()<2){
            return lista;
        }else if(lista.size()==2){
            if(lista.get(0)>lista.get(1)){
                int tmp=lista.get(0);
                lista.set(0, lista.get(1));
                lista.set(1, tmp);
            }
            return lista;
        }else{
            int srodek=lista.get(0);
            List<Integer> mniejszeRowne=new ArrayList<>();
            List<Integer> wieksze=new ArrayList<>();

            for(int i=1;i<lista.size();i++){
                if(lista.get(i)<=srodek){
                    mniejszeRowne.add(lista.get(i));
                }else{
                    wieksze.add(lista.get(i));
                }
            }
            mniejszeRowne=sortujRekurencyjnie(mniejszeRowne);
            wieksze=sortujRekurencyjnie(wieksze);

            List<Integer> wyniki=new ArrayList<>();
            wyniki.addAll(mniejszeRowne);
            wyniki.add(srodek);
            wyniki.addAll(wieksze);
            return wyniki;
        }
    }

    public static void main(String[] args) {
        int[] tab=new int[]{1,6,1,3,7,9};
        List<Integer> lista=new ArrayList<>();
        for(int i=0;i<tab.length;i++){
            lista.add(tab[i]);
        }

    }
    /*int[] tab1;
        int[] tab2;

        if(tablica.length<2){
            return tablica;
        }else if(tablica.length<3){
            if(tablica[0]>tablica[1]) {
                int tmp = tablica[0];
                tablica[0] = tablica[1];
                tablica[1] = tmp;
            }
            return tablica;
        }else{
            List<Integer> lista = new ArrayList<>();
            lista.add(tablica[0]);
            int elementSrodkowy = lista.get(lista.size() / 2);
            List<Integer> listaMniejszych = new ArrayList<>();
            List<Integer> listaWiekszych = new ArrayList<>();

            for (int i = 0; i < tablica.length; i++) {
                if (tablica[i] < elementSrodkowy) {
                    listaMniejszych.add(tablica[i]);
                }
            }
            tab1=new int[listaMniejszych.size()];
            for (int i = 0; i < listaMniejszych.size(); i++) {
                tab1[i] = listaMniejszych.get(i);
            }
            tab1=sortuj(tab1);

            for (int i = 0; i < tablica.length; i++) {
                if (tablica[i] > elementSrodkowy) {
                    listaWiekszych.add(tablica[i]);
                }
            }
            tab2=new int[listaWiekszych.size()];
            for (int i = 0; i < listaWiekszych.size(); i++) {
                tab2[i] = listaWiekszych.get(i);
            }
            tab2=sortuj(tab2);
        }
        int[] tablicaWynikow=new int[tab1.length+tab2.length-1];
        for(int i=0;i<tablica.length;i++){
            tablicaWynikow[i]=tab1[i];
        }
        for (int i=(tablica.length);i<tablica.length;i++){
            tablicaWynikow[i]=tab2[i];
        }
        return tablica;
        */
}

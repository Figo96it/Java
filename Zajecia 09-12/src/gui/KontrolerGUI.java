package gui;

import sortowanie.Sortowanie;
import sortowanie.SortowanieBabelkowe;
import sortowanie.SortowaniePrzezWstawianie;
import sortowanie.SortowaniePrzezWybor;
import sortowanie.SortowaniePrzezZliczanie;
import sortowanie.SortowanieSzybkie;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class KontrolerGUI {

    @FXML
    private TextArea inputArray;

    @FXML
    private TextArea outputArray;

    public void kliknieciePrzycisku(){
        System.out.println("Przycisk kliknięty");
    }

    public void przepiszTekst(){
        String tekst = inputArray.getText();
        outputArray.appendText("Kod z inputArray \n");
        outputArray.appendText(tekst);
    }

    public void sortowanieBabelkowe(){
        sortuj(new SortowanieBabelkowe());
    }

    public void sortowaniePrzezWstawianie(){
        sortuj(new SortowaniePrzezWstawianie());
    }

    public void sortowaniePrzezZliczanie(){
        sortuj(new SortowaniePrzezZliczanie());
    }

    public void sortowanieSzybkie(){
        sortuj(new SortowanieSzybkie());
    }

    public void sortowaniePrzezWybor(){
        sortuj(new SortowaniePrzezWybor());
    }

    private void sortuj(Sortowanie sortowanie){
        String daneWejsciowe = inputArray.getText();
        try{
            int[] tablicaIntow = zamienNaTabliceIntow(daneWejsciowe);
            long start = System.currentTimeMillis();
            tablicaIntow = sortowanie.sortuj(tablicaIntow);
            long end = System.currentTimeMillis();
            outputArray.appendText(sortowanie.getNazwaAlgorytmu()+"\n");
            for (Integer liczba : tablicaIntow){
                outputArray.appendText(Integer.toString(liczba)+" ");
            }
            outputArray.appendText("\n");
            outputArray.appendText("Czas wykonania: "+Long.toString(end - start)+"\n");
        }catch (IllegalArgumentException e){
            outputArray.appendText(e.getMessage()+"\n");
        }
    }

    private int[] zamienNaTabliceIntow(String tekst) throws IllegalArgumentException{
        String[] elementy = tekst.split(",");
        int[] tablica = new int[elementy.length];
        for(int i=0;i<elementy.length;i++){
            try{
                tablica[i] = Integer.parseInt(elementy[i].trim());
            }catch(NumberFormatException e){
                throw new IllegalArgumentException("Nieprawidłowe dane!!!");
            }
        }
        return tablica;
    }



}
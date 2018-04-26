package com.sda.ui;

import com.sda.controller.Magazyn;
import com.sda.controller.ZarzadzanieBiblioteka;
import com.sda.model.Autor;
import com.sda.model.Biblioteka;
import com.sda.model.Gatunek;
import com.sda.model.Ksiazka;
import com.sda.narzedzia.KopiaZapasowa;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import static com.sda.model.Gatunek.*;

public class DodajKsiazkeKontroler {

    @FXML private TextArea inputArray1;
    @FXML private TextArea inputArray2;
    @FXML private TextArea inputArray3;
    @FXML private TextArea inputArray4;
    @FXML private TextArea inputArray5;
    @FXML private TextArea outputArray;

    public void dodajKsiazke(){
        String daneWejsciowe1=inputArray1.getText();
        String daneWejsciowe2=inputArray2.getText();
        String daneWejsciowe3=inputArray3.getText();
        String daneWejsciowe4=inputArray4.getText();
        String daneWejsciowe5=inputArray5.getText();
        try{
            Ksiazka ksiazka=new Ksiazka();

            ksiazka.setTytul(daneWejsciowe1);
            ksiazka.setLiczbaStron(Integer.parseInt(daneWejsciowe2.trim()));
            ksiazka.setAutor(dodajAutora(daneWejsciowe3));
            ksiazka.setRokWydania(Integer.parseInt(daneWejsciowe5));

            boolean a;
            String a1="HORROR";
            String a2="BAJKA";
            String a3="KRYMINAL";
            String a4="DRAMAT";

            if(daneWejsciowe4.equals(a1)){
                ksiazka.setGatunek(Gatunek.HORROR);
                a=true;
            }else if(daneWejsciowe4.equals(a2)){
                ksiazka.setGatunek(Gatunek.BAJKA);
                a=true;
            }else if(daneWejsciowe4.equals(a3)){
                ksiazka.setGatunek(Gatunek.KRYMINAL);
                a=true;
            }else if(daneWejsciowe4.equals(a4)) {
                ksiazka.setGatunek(Gatunek.DRAMAT);
                a=true;
            }else{
                outputArray.appendText("Wprowadziłeś zły gatunek! Wprowadz (BAJKA, HORROR, KRYMINAŁ, DRAMAT");
                a=false;
            }

            if(a==true){
                Biblioteka biblioteka = Magazyn.getBiblioteka();
                ZarzadzanieBiblioteka.dodajKsiazkeDoBiblioteki(ksiazka, biblioteka);
                KopiaZapasowa.zapiszBibliotekeDoPliku(biblioteka);
                outputArray.appendText("aaa");
            }else{
                outputArray.appendText("Wprowadziłeś złe dane spróbuj ponownie!");
            }

        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }
    }

    private static Autor dodajAutora(String tekst){
        String[] elementy=tekst.split(" ");
        Autor autor=new Autor();
        autor.setImie(elementy[0]);
        autor.setNazwisko(elementy[1]);
        return autor;
    }


}

package streamy;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import sortowanie.Sortowanie;
import sortowanie.SortowanieBabelkowe;
import sortowanie.SortowanieSzybkie;

public class KontrolerGUI {

    @FXML
    private TextArea inputArray;

    @FXML
    private TextArea outputArray;

    public void kliknieciePrzycisku(){
        System.out.println("Klikniecie przycisku.");
    }

    public void przepiszTekst(){
        String tekst=inputArray.getText();
        outputArray.appendText("Kod z inputArray \n");
        outputArray.appendText(tekst);
    }

    public void sortowanieBabelkowe(){
        sortuj(new SortowanieBabelkowe());
    }

    public void sortowanieSzybkie(){
        sortuj(new SortowanieSzybkie());
    }

    public void sortowaniePrzezWstawianie(){
        sortuj(new SortowanieSzybkie());
    }

    private void sortuj(Sortowanie sortowanie){
        String daneWejsciowe=inputArray.getText();
        try{
            int[] tablicaIntow=zamienNaTabliceIntow(daneWejsciowe);
            outputArray.appendText(sortowanie.getNazwaAlgorytmu()+" ");
            System.out.println();
            for(Integer liczba : tablicaIntow){
                outputArray.appendText(Integer.toString(liczba)+" ");
            }
            outputArray.appendText("\n");
        }catch (IllegalArgumentException e){
            outputArray.appendText(e.getMessage()+"\n");
        }
    }

    private int[] zamienNaTabliceIntow(String tekst) throws IllegalArgumentException{
        String[] elementy=tekst.split(",");
        int[] tablica=new int[elementy.length];
        for(int i=0;i<elementy.length;i++) {
            try {
                tablica[i] = Integer.parseInt(elementy[i].trim());
            }catch (IllegalArgumentException e){
                throw  new IllegalArgumentException("Nieprawidlowe dane!");
            }
        }
        return tablica;
    }
}

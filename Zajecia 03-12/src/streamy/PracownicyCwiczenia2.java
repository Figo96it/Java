package streamy;

import model.NarzedziaCSV;
import model.Pracownik;

import java.util.List;

public class PracownicyCwiczenia2 {

    public static void main(String[] args) {
        String sciezkaDoPliku="C:/Users/MSI/Desktop/209307/SDAJAVA/data.csv";
        List<Pracownik> pracownicy= NarzedziaCSV.czytajCSVZPliku(sciezkaDoPliku);
        System.out.println(pracownicy.size());
    }

    private static String wypiszPracownika(Object... parametry){
        StringBuilder sb=new StringBuilder();
        for(Object parametr : parametry){
            sb.append(parametr.toString()+" ");
        }
        return sb.toString();
    }
}

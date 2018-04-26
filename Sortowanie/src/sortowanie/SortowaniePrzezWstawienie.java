package sortowanie;

import java.util.ArrayList;
import java.util.List;

public class SortowaniePrzezWstawienie implements Sortowanie {
    public String getNazwaAlgorytmu(){
        return "Sortowanie przez wstawienie";
    }

    public int[] sortuj(int[] tablica){
        List<Integer> wyniki=new ArrayList<>();
        wyniki.add(tablica[0]);
        for(int i=1;i<tablica.length;i++){
            boolean czyWstawiony=false;
            for(int j=0;j<wyniki.size();j++){
                if(tablica[i]<=wyniki.get(j)){
                    wyniki.add(j, tablica[i]);
                    czyWstawiony=true;
                    break;
                }
            }
            if(!czyWstawiony){
                wyniki.add(tablica[i]);
            }
        }

        int[] wynikiTablica=new int[wyniki.size()];
        for(int i=0;i<wyniki.size();i++){
            wynikiTablica[i]=wyniki.get(i);
        }
        return wynikiTablica;
    }

    public static void main(String[] args) {
        int[] test=new int[]{7,2,8,1,3,2,4,5};
        for(int i=0;i<test.length;i++){
            System.out.print(test[i]+" ");
        }
        System.out.println();
        Sortowanie sortowanie=new SortowaniePrzezWstawienie();
        test=sortowanie.sortuj(test);
        for (int i=0;i<test.length;i++){
            System.out.print(test[i]+" ");
        }
    }
}

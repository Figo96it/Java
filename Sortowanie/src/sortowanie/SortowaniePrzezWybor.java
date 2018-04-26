package sortowanie;

public class SortowaniePrzezWybor implements Sortowanie {

    public String getNazwaAlgorytmu(){
        return "Sortowanie Przez Wybór";
    }

    public int[] sortuj(int[] tablica){
        for(int i=0;i<tablica.length;i++){
            int wartoscMinimalna=tablica[i];
            int indexMin=i;
            for(int j=i+1;j<tablica.length;j++){
                if(tablica[j]<wartoscMinimalna){
                    wartoscMinimalna=tablica[j];
                    indexMin=j;
                }
            }
            if(i!=indexMin){
                int temp=tablica[i];
                tablica[i]=wartoscMinimalna;
                tablica[indexMin]=temp;
            }
        }
        return tablica;
    }

    public static void main(String[] args) {
        int[] test=new int[]{12,1,7,2,8,1,9,3,2,4,5};
        for(int i=0;i<test.length;i++){
            System.out.print(test[i]+" ");
        }
        System.out.println();
        Sortowanie sortowanie=new SortowaniePrzezWybor();
        test=sortowanie.sortuj(test);
        for (int i=0;i<test.length;i++){
            System.out.print(test[i]+" ");
        }
    }
}

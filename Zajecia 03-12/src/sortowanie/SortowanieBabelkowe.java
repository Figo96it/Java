package sortowanie;

public class SortowanieBabelkowe implements Sortowanie {

    @Override
    public String getNazwaAlgorytmu() {
        return "sortowanie bąbelkowe";
    }

    @Override
    public int[] sortuj(int[] tablica) {
        int licznikPorownan = 0;
        for (int i = 0; i < tablica.length; i++) {
            boolean czyBylaZamiana = false;
            for (int j = i + 1; j < tablica.length; j++) {
                licznikPorownan++;
                if (tablica[i] > tablica[j]) {
                    czyBylaZamiana = true;
                    int tmp = tablica[i];
                    tablica[i] = tablica[j];
                    tablica[j] = tmp;
                }
                if (!czyBylaZamiana) {
                    break;
                }
            }
        }
        System.out.println("Licznik porównań: " + licznikPorownan);
        return tablica;
    }

    public static void main(String[] args) {
        int[] tekst = new int[]{2, 4, 2, 3, 544, 23, 4565, 10,99,9};
        for (int i = 0; i < tekst.length; i++) {
            System.out.print(tekst[i] + " ");
        }
        System.out.println();
        Sortowanie sortowanie = new SortowanieSzybkie();
        tekst = sortowanie.sortuj(tekst);
        for (int i = 0; i < tekst.length; i++) {
            System.out.print(tekst[i] + " ");
        }
    }
}

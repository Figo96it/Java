package streamy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamyCwiczenia0 {
    public static void main(String[] args) {
        List<Integer> liczby = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            liczby.add(i);
        }
        System.out.println(liczby);
        System.out.println("Podzielne przez 3:");
        List<Integer> podzielnePrzez3 = new ArrayList<>();
        for (Integer liczba : liczby) {
            if (liczba % 3 == 0) {
                podzielnePrzez3.add(liczba);
            }
        }
        System.out.println(podzielnePrzez3);
        List<Integer> podzielnePrzez3Stream = liczby.stream()
                .filter(liczba -> liczba % 3 == 0)
                .collect(Collectors.toList());
        System.out.println(podzielnePrzez3Stream);

        //podzielne przez 2 i 5 i wieksze od 20
        List<Integer> wyniki=new ArrayList<>();
        for(Integer liczba : liczby){
            if(liczba%2==0 && liczba%5==0){
                wyniki.add(liczba*9);
            }
        }
    }
}
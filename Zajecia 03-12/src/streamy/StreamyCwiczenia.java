package streamy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamyCwiczenia {

    public static void main(String[] args) {
        List<Integer> liczby=new ArrayList<>();
        for(int i=0;i<=100;i++){
            liczby.add(i);
        }

        System.out.println(liczby);
        System.out.println("Wieksze od 20, podzielne przez 2: ");
        List<Integer> podzielnePrzez2WiekszeOd20=new ArrayList<>();
        for(Integer liczba : liczby){
            if(liczba>20 && liczba%2==0){
                podzielnePrzez2WiekszeOd20.add(liczba);
            }
        }
        System.out.println(podzielnePrzez2WiekszeOd20);
        //streamy
        List<Integer> podzielnePrzez2WiekszeOd20Stream=liczby.stream()
                .filter(liczba -> liczba>20 && liczba%2==0)
                .collect(Collectors.toList());
        System.out.println(podzielnePrzez2WiekszeOd20Stream);
    }
}

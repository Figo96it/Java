package zadanie7;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class Zadanie7 {

    private static List<Pair<String, Integer>> lista = new ArrayList<>();

    public static void main(String[] args) {
        creatingAList();
        System.out.println(getCount("orange"));
        getNames(15);
        printList();
    }

    public static void creatingAList() {
        lista.add(new Pair<>("Orange", 6));
        lista.add(new Pair<>("Apple", 2));
        lista.add(new Pair<>("PineApple", 11));
        lista.add(new Pair<>("Cherry", 4));
        lista.add(new Pair<>("Bananas", 6));
        lista.add(new Pair<>("Raspberry", 18));
        lista.add(new Pair<>("Blueberry", 3));
        lista.add(new Pair<>("Pear", 6));
        lista.add(new Pair<>("Orange", 9));


    }

    public static int getCount(String name) {
        int valuesOfFruit = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getKey().toLowerCase().equals(name.toLowerCase())) {
                valuesOfFruit += lista.get(i).getValue();
            }
        }
        return valuesOfFruit;
    }

    public static List<Pair<String, Integer>> getNames(int number) {
        List<Pair<String, Integer>> newList = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            if (getCount(lista.get(i).getKey()) == number) {
                newList.add(lista.get(i));
            }
        }
        lista = newList;
        return lista;
    }

    public static void printList() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i));
            if (i < lista.size() - 1) {
                System.out.print(", ");
            }
        }
    }


}

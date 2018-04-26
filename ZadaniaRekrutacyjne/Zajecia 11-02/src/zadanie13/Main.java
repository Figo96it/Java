package zadanie13;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] tab = {4, 2, 4, 5, 4, 2};
        int[] tab2 = null;
        System.out.println(repeatingElement(tab));
        System.out.println(repeatingElement(tab2));
    }

    private static int repeatingElement(int[] tab) {
        if (tab == null || tab.length < 1) {
            throw new IllegalArgumentException("Input empty or too short.");
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int liczba : tab) {
            if (map.containsKey(Integer.valueOf(liczba))) {
                map.put(Integer.valueOf(liczba), map.get(Integer.valueOf(liczba)) + 1);
            } else {
                map.put(Integer.valueOf(liczba), 1);
            }
        }
        for (int liczba : tab) {
            if (map.get((Integer.valueOf(liczba))) > 1) {
                return liczba;
            }
        }
            throw new IllegalArgumentException("Cannot Find Duplicate!");
    }
}

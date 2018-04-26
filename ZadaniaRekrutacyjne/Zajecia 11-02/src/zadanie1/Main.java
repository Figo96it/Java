package zadanie1;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        method(new int[]{2, 3, 4}, 6);
        method(new int[]{2, 3, 4}, 0);
        method2(new int[]{}, 0);
    }

    private static void method(int[] tab, int number) {
        if (tab == null || tab.length < 1) {
            System.out.println("0");
            return;
        }
        int indexNumber = 0;
        for (int i = 0; i < tab.length; i++) {
            if (number < tab[i]) {
                indexNumber = i;
                break;
            } else {
                indexNumber = tab.length;
            }
        }
        System.out.println(indexNumber);
    }

    private static void method2(int[] tab, int number) {
        if (tab == null || tab.length < 1) {
            System.out.println("0");
            return;
        }
        Arrays.sort(tab);
        for (int i = 0; i < tab.length; i++) {
            if (number < tab[i]) {
                System.out.println(i);
                break;
            } else {
                System.out.println(tab.length);
            }
        }
    }
}

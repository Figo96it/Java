package enoughIsEnough;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EnoughIsEnough {

    private static List<Integer> lista = new LinkedList<>();

    public static int[] deleteNth(int[] elements, int maxOcurrences) {
        for (int i = 0; i < elements.length; i++) {
            lista.add(elements[i]);
        }
        List<Integer> nowaLista=new ArrayList<>();

        for (int i=0;i<lista.size();i++) {
            int counter = 0;
            for (int j=0;j<lista.size();j++) {
                if (counter < maxOcurrences && lista.get(i)==lista.get(j)) {
                    System.out.println("dodane");
                    counter++;
                }
                if (counter == maxOcurrences && lista.get(i)==lista.get(j)) {
                    System.out.println("Usuniete");
                    deleteElement(lista,j);
                    continue;
                }
            }
        }
        lista.remove(2);

        int[] newElements = new int[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            int x=nowaLista.get(i);
            newElements[i] = x;
        }
        return newElements;
    }

    private static List<Integer> deleteElement(List<Integer> lista,int j) {
        lista.remove(j);
        return lista;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 1, 1, 3, 3, 7, 2, 2, 2};
        deleteNth(a, 1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

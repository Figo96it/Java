package zadanie8;

public class Main {

    private static int position(int[] tab) {
        if (tab == null || tab.length < 1) {
            return -1;
        }
        int max = tab[0];
        int position = -1;

        for (int i = 0; i < tab.length; i++) {
            if (i == 0) {
                if (tab[i] > tab[i + 1]) {
                    max = tab[i];
                    position = i;
                }
            } else if (i == tab.length - 1 && tab[i] > max) {
                if (tab[i - 1] < tab[i] && tab[i] > max) {
                    max = tab[i];
                    position = i;
                }
            } else if (tab[i] > max) {
                if (tab[i - 1] < tab[i] && tab[i] > tab[i + 1]) {
                    max = tab[i];
                    position = i;
                }
            }
        }
        return position;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 1};
        int[] b = {1, 2, 2, 2, 1};
        int[] d = {5, 1, 1, 5, 1};
        int[] e = {2, 3};
        int[] f = {3, 1};
        int[] c = null;
        System.out.println(position(a));
        System.out.println(position(b));
        System.out.println(position(d));
        System.out.println(position(e));
        System.out.println(position(f));
        System.out.println(position(c));
    }
}

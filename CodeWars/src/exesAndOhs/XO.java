package exesAndOhs;

public class XO {

    private int x=0,o=0;

    public static boolean getXO(String str) {
        int x = 0, o = 0;
        char[] text = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (text[i] == 'x' || text[i] == 'X') {
                x++;
            } else if (text[i] == 'o' || text[i] == 'O') {
                o++;
            }
        }

        return x==o;
    }

    public static void main(String[] args) {
        System.out.println(getXO("xxxooo"));
        System.out.println(getXO("xxxXooOo"));
    }
}

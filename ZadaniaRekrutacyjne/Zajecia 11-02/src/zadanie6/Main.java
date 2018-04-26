package zadanie6;

public class Main {

    private static String[] bracketsArray = new String[0];

    public static void main(String[] args) {
        String napis = "(Ala (ma) () ( kota))";
        String napis2 = "{ALA(MA[KOTA])";
        String napis3 = ")(ALA)MA(KOTA KOT)MA(ALE";
        String napis4 = "ALA(MA[K)OTA]";
        rightParenthesis(napis);
        rightParenthesis(napis2);
        rightParenthesis(napis3);
        rightParenthesis(napis4);
    }

    private static boolean rightParenthesis(String napis) {
        bracketsArray = new String[0];
        if (napis.length() < 1 || napis == null) {
            return true;
        }
        String[] tekst = napis.split("");

        for (int i = 0; i < tekst.length; i++) {
            if (isBracket(tekst[i])) {
                addBracketToArray(tekst[i]);
            }
        }

        if (isCorrect(bracketsArray)) {
            return true;
        }
        return false;
    }

    private static boolean isCorrect(String[] bracketsArray) {
        if (bracketsArray[0].equals(")") || bracketsArray[0].equals("]") || bracketsArray[0].equals("}")) {
            return false;
        }
        correctBetweenBracket();
        int x = 0, y = 0, z = 0;
        for (int i = 0; i < bracketsArray.length; i++) {
            if (bracketsArray[i].equals("(")) {
                x++;
            } else if (bracketsArray[i].equals(")")) {
                x--;
            } else if (bracketsArray[i].equals("[")) {
                y++;
            } else if (bracketsArray[i].equals("]")) {
                y--;
            } else if (bracketsArray[i].equals("{")) {
                z++;
            } else if (bracketsArray[i].equals("}")) {
                z--;
            }
        }
        if (x != 0 || y != 0 || z != 0) {
            return false;
        }
        return true;
    }

    private static void correctBetweenBracket() {
        String s = bracketsArray[0];
        for (int i = 1; i < bracketsArray.length; i++) {
            if (s.equals("(")) {
                if (bracketsArray[i].equals(")")) {
                    if (i < bracketsArray.length - 1) {
                        s = bracketsArray[i + 1];
                    }
                }else{

                }
            } else if (s.equals("[")) {
                if (bracketsArray[i].equals("]")) {
                    if (i < bracketsArray.length - 1) {
                        s = bracketsArray[i + 1];
                    }
                }
            }
        }
    }

    private static void addBracketToArray(String s) {
        String[] newArray = new String[bracketsArray.length + 1];
        for (int i = 0; i < bracketsArray.length; i++) {
            newArray[i] = bracketsArray[i];
        }
        newArray[bracketsArray.length] = s;
        bracketsArray = newArray;
    }

    private static boolean isBracket(String s) {
        if (s.equals("(") || s.equals(")") || s.equals("[") || s.equals("]") || s.equals("{") || s.equals("}")) {
            return true;
        }
        return false;
    }
}

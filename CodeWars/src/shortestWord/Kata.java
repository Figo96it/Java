package shortestWord;


public class Kata {
    public static int findShort(String s) {
        String[] words = s.split(" ");
        int shortestWords = Integer.MAX_VALUE;
        for (String word : words) {
            if (word.length() < shortestWords) {
                shortestWords = word.length();
            }
        }
        return shortestWords;
    }

    public static void main(String[] args) {
        String s = "turns out random test cases are easier than writing out basic ones";
        int i = findShort(s);
        if (3 == i) {
            System.out.println("tak");
        } else {
            System.out.println("nie");
        }
    }
}
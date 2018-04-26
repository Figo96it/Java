package takeATenMinuteWalk;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        if (walk.length != 10) {
            return false;
        }

        int x = 0, y = 0;
        for (int i = 0; i < walk.length; i++) {
            switch (walk[i]) {
                case 'n':
                    x++;
                    break;
                case 's':
                    x--;
                    break;
                case 'w':
                    y++;
                    break;
                case 'e':
                    y--;
                    break;
            }
        }
        return x == 0 && y == 0;
    }

    public static void main(String[] args) {
        char[] slowo = {'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'};
        char[] slowo2 = {'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's'};
        char[] sl = {'s', 'a'};

        System.out.println(isValid(slowo2));
    }
}

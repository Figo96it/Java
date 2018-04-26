package youAreASquare;
import static java.lang.Math.*;

public class Square {
    public static boolean isSquare(int n) {
        for(double i=0;i<=n/2;i++){
            if((i*i)==n){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isSquare(4));

    }
}
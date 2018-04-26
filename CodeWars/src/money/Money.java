package money;

public class Money {

    public static int calculateYears(double principal, double interest,  double tax, double desired) {
        int year=0;
        if(principal==desired){
            return year;
        }
        while(principal<desired){
            principal+=principal*interest-(principal*interest)*tax;
            year++;
        }
        return year;
    }
}

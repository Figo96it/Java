package dontGiveMeFive;

import java.util.ArrayList;
import java.util.List;

public class Kata {
    public static int dontGiveMeFive(int start, int end) {
        List<Integer> lista=new ArrayList<>();
        int counter=0;
        for(int i=start;i<=end;i++){
            String s=""+start;
            String[] se=s.split("");
            for(String ses : se){
                if(ses!="5"){
                    counter++;
                }
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(dontGiveMeFive(4,17));
    }
}

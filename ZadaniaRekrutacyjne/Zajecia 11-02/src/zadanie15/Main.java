package zadanie15;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] tab={15,3,1,10,11,6};

        System.out.println(minimumNumber(tab));
    }

    private static int minimumNumber(int[] tab){
        Arrays.sort(tab);
        int result=2;
        if(result<tab[0]){
            return result;
        }

        for(int i=0;i<tab.length;i++){
            if(isInTheArray(tab[i],tab)){
                result=4;
            }
        }
        return result;
    }

    private static boolean isInTheSum(int x, int[] tab) {
        for(int i=0;i<tab.length;i++){
            for(int j=0;j<tab.length;j++){
                if(i!=j){
                    tab[j]+=tab[i];
                }
                if(x==tab[j]){
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isInTheArray(int x,int[] tab) {
        for(int i=0;i<tab.length;i++){
            if(x==tab[i]){
                return false;
            }
        }
        return true;
    }
}

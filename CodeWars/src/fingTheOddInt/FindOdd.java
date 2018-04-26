package fingTheOddInt;

public class FindOdd {
    public static int findIt(int[] A) {
        int odd = 0;
        for (int i = 0; i < A.length; i++) {
           int liczba=A[i];
           int counter=0;
           for(int j=0;j<A.length;i++){
               int liczba2=A[j];
               if(liczba==liczba2){

               }
           }
        }
        return odd;
    }

    public static void main(String[] args) {
        int[] a={20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5};
        System.out.println(findIt(a));
    }
}

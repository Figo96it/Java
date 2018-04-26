package fingTheUniqueNumber;

public class Kata {
    public static double findUniq(double arr[]) {
        double foundUnig=0;
        if(arr[0]!=arr[1]){
            if(arr[0]==arr[2]){
                return arr[1];
            }else{
                return arr[0];
            }
        }
        for(int i=1;i<arr.length;i++){
            if(arr[0]!=arr[i]){
                foundUnig=arr[i];
            }
        }
        return foundUnig;
    }
}

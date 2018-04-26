package theHighestProfitWins;

public class MinMax {
    public static int[] minMax(int[] arr) {
        int min=arr[0];
        int max=arr[0];
        int[] newArray=new int[2];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }else if(arr[i]>max){
                max=arr[i];
            }
        }
        if(min>max){
            int temp=min;
            min=max;
            max=temp;
        }
        newArray[0]=min;
        newArray[1]=max;
        return newArray;
    }
}

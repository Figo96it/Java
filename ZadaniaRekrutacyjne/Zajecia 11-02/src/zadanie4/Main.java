package zadanie4;


public class Main {

    private static int[] outputArray;

    public static void main(String[] args) {
        int[][] tab = {
                {2, 3, 4, 5},
                {1, 6, 2},
                {2, 1, 6},
                {3,1,6,7,8,4,2,1},
                {2,3,5},
                {9,9,9,9,9,9,9,9,9}
        };

        sum(tab);
        for (int i = 0; i < outputArray.length; i++) {
            System.out.print(outputArray[i]+" ");
        }
    }

    private static int[] sum(int[][] tab) {
        int maxSize=getMaxSize(tab);
        outputArray=new int[maxSize];
        sumAllRows(tab,maxSize);
        moveValueOften();
        return outputArray;
    }

    private static void moveValueOften() {
        for(int i=outputArray.length-1;i>0;i--){
            if(outputArray[i]>=10){
                int rest=outputArray[i]-10;
                outputArray[i]=rest;
                outputArray[i-1]+=1;
            }
        }

        if(outputArray[0]>=10){
            int[] newOutputArray=new int[outputArray.length+1];
            int rest=outputArray[0]-10;
            newOutputArray[0]=1;
            newOutputArray[1]=rest;
            for(int i=0;i<outputArray.length;i++){
                newOutputArray[i+2]=outputArray[i];
            }
            outputArray=newOutputArray;
        }
    }

    private static void sumAllRows(int[][] tab, int maxSize) {
        for(int i=0;i<tab.length;i++){
            int counter=0;
            for(int j=tab[i].length-1;j>=0;j--){
                outputArray[maxSize-counter-1]+=tab[i][j];
                counter++;
            }
        }
    }

    private static int getMaxSize(int[][] tab) {
        int maxSize=0;
        for(int i=0;i<tab.length;i++){
            if(tab[i].length>maxSize){
                maxSize=tab[i].length;
            }
        }
        return maxSize;
    }

}
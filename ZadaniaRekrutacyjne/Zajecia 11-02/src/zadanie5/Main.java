package zadanie5;

public class Main {

    private static String[] outputData;

    public static void main(String[] args) {
        String inputData="aBBBEEEEGGGGRRRRKKKKJAAABBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBI22";
        String inputData2="";
        String inputData3=null;
        algorithmRLE(inputData);
        algorithmRLE(inputData3);
    }

    private static void algorithmRLE(String inputData) {
        if(inputData==null || inputData.length()<1) {
            System.out.println("ERROR");
        }else{
            String[] newInputData = inputData.split("");
            int size = getArraySize(newInputData);
            outputData = new String[size];
            replaceData(newInputData);
            for (int i = 0; i < outputData.length; i++) {
                System.out.print(outputData[i]);
            }
        }
        System.out.println();
    }

    private static void replaceData(String[] newInputData) {
        int index=0;
        int counter=1;
        for(int i=1;i<newInputData.length;i++){
            if(newInputData[i].equalsIgnoreCase(newInputData[i-1])){
                counter++;
                if(i==newInputData.length-1){
                    outputData[index]=newInputData[i-1].toUpperCase();
                    index++;
                    outputData[index]=";";
                    index++;
                    outputData[index]=""+counter;
                    index++;
                }
            }else{
                if(counter==1){
                outputData[index]=newInputData[i-1].toUpperCase();
                index++;
                }else{
                    outputData[index]=newInputData[i-1];
                    index++;
                    outputData[index]=";";
                    index++;
                    outputData[index]=""+counter;
                    index++;
                }
                counter=1;
            }
            if(i==newInputData.length-1 && !(newInputData[i]).equalsIgnoreCase(newInputData[i-1])){
                outputData[index]=newInputData[i];
            }
        }
    }

    private static int getArraySize(String[] inputData) {
        int counter=1;
        int size=0;
        for(int i=1;i<inputData.length;i++){
            if(inputData[i].equalsIgnoreCase(inputData[i-1])){
                counter++;
                if(i==inputData.length-1){
                    size+=3;
                }
            }else{
                if(counter==1 || i==inputData.length-1){
                    size++;
                }else{
                    size+=3;
                }
                counter=1;
            }
        }
        return size;
    }
}

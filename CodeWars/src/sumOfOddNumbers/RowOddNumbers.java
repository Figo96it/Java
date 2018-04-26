package sumOfOddNumbers;

class RowSumOddNumbers {

    static int[][] array;

    public static int rowSumOddNumbers(int n) {
        return completeTriangleAndSum(n);
    }

    private static int easySolution(int n){
        return n*n*n;
    }

    private static int completeTriangleAndSum(int n) {
        try {
            array = new int[n][];
            for (int i = 0; i < n; i++) {
                array[i] = new int[i + 1];
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        int number=1;
        int suma=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                array[i][j]=number;
                if(i==n-1) {
                    suma += array[i][j];
                }
                number+=2;
            }
        }
        return suma;
    }

    private static void printTriangle() {
        for(int i=0;i<array.length;i++){
            printSpecialCharacters(i);
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]);
                if(j<array[i].length){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void printSpecialCharacters(int x) {
        for(int i=0;i<array.length-x;i++){
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        rowSumOddNumbers(42);
    }
}

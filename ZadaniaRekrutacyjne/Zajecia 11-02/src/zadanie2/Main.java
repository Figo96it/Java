package zadanie2;

public class Main {
    private static int[] outputArray = new int[0];

    public static void main(String[] args) {
        method(new int[]{1, 3, 3, 55, 5, 7, 9, 2, 8, 10, 12, 9, 3});
        showNewArray();
    }

    private static void showNewArray() {
        for (int i = 0; i < outputArray.length; i++) {
            System.out.print(outputArray[i] + " ");
        }
    }

    private static void method(int[] tab) {
        for (int i = 1; i < tab.length - 1; i++) {
            if (tab[i - 1] + 2 == tab[i] && tab[i + 1] % 3 == 0) {
                addElement(i);
            }
        }
    }

    private static void addElement(int number) {
        int[] newOutputArray = new int[outputArray.length + 1];
        for (int i = 0; i < outputArray.length; i++) {
            newOutputArray[i] = outputArray[i];
        }
        newOutputArray[outputArray.length] = number;
        outputArray = newOutputArray;
    }


}

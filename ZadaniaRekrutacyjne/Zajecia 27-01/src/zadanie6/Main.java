package zadanie6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static List<Integer> lista = new ArrayList<>();
    static int length;
    static int start,end;

    public static void main(String[] args) {
        getTheSizeOfList();
        fillingWithRandomNumbers();
        printList();
        getStartEndFromUser();
        addingUp();
    }

    public static void getTheSizeOfList() {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("ENTER THE LENGTH OF LIST: ");
            while (!scan.hasNextInt()) {
                System.out.println("INVALID");
                scan.next();
            }
            length = scan.nextInt();
        } while (length < 0);
    }

    public static void fillingWithRandomNumbers(){
        Random random=new Random();
        for(int i=0;i<length;i++){
            lista.add(random.nextInt(150));
        }
    }

    public static void printList(){
        for (int i=0;i<length;i++){
            System.out.print(lista.get(i));
            if(i<length-1){
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void getStartEndFromUser(){
        Scanner scan=new Scanner(System.in);
        do {
            System.out.println("ENTER THE START OF LIST: ");
            while(!scan.hasNextInt()){
                System.out.println("INVALID");
                scan.next();
            }
            start = scan.nextInt();

            System.out.println("ENTER THE END OF LIST: ");
            while(!scan.hasNextInt()){
                System.out.println("INVALID");
                System.out.println("Wprowadz rozmiar listy: ");
                scan.next();
            }
            end = scan.nextInt();
        }while(!isTheRangeRight());
    }

     static boolean isTheRangeRight(){
        boolean score;
        if(start>end) {
            score=false;
        }else if(start<0 || start>length){
            score=false;
            System.out.println("INVALID !! WAS GIVEN BAD START OF THE LIST  !!");
        }else if(end<0 || end>length){
            score=false;
            System.out.println("INVALID !! WAS GIVEN BAD END OF THE LIST  !!");
        }else{
            score = true;
        }
        return score;
    }

    public static void addingUp(){
         int dim=0;
         for(int i=start-1;i<end-1;i++){
             dim+=lista.get(i);
         }
        System.out.println(dim);
    }
}

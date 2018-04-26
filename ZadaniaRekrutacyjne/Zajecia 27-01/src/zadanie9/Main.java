package zadanie9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static Set<String> set = new HashSet<>();

    public static void main(String[] args) {
        baseData();
        printSet();
        deleteName("Dominik");
        printSet();

    }

    public static void baseData(){
        set.add("Damian");
        set.add("Kamil");
        set.add("Damian");
        set.add("Lucjan");
        set.add("Damian");
        set.add("Ewa");
        set.add("Karol");
        set.add("Mateusz");
        set.add("Dominik");
        set.add("Kamil");
        set.add("Karol");
        set.add("Dominik");
        set.add("Dominik");
        set.add("Adam");
        set.add("Andrzej");
    }

    public static void getDataFromTheUser() {
        Scanner scan = new Scanner(System.in);
        String name;
        do {
            System.out.println("Podaj imie uzytkownika: (JEŻELI CHCESZ ZAKOŃCZYĆ WCIŚNIJ ENTER)");
            name = scan.nextLine();
            if (name.equals("")) {
                break;
            }
            if (!checkTheName(name)) {
                set.add(name);
            }
        } while (true);
    }

    private static void printSet() {
        System.out.println(set);
    }

    private static boolean checkTheName(String name) {
        for (String imie : set) {
            if (name.equalsIgnoreCase(imie)) {
                return true;
            }
        }
        return false;
    }

    public static void deleteName(String name){
        for(String imie : set){
            if(name.equalsIgnoreCase(imie)){
                set.remove(name);
            }
        }
    }


}

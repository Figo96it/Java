package implementacja;

public class Main {

    public static void main(String[] args) {
        OwnList ownList=new OwnList();
        ownList.add(5);
        ownList.add(6);
        ownList.add(7);
        ownList.add(8);
        ownList.add(9);
        ownList.add(10);
        ownList.addAtFirst(2);
        System.out.println(ownList.toString());


    }
}

package implementacja;

public class OwnList {

    private Node head;
    private Integer counter;

    public OwnList() {
        head = null;
        counter = 0;
    }


    public void add(int i) {
        if (head == null) {
            //gry jest to pierwszy element listy
            head = new Node(i, head);
            return;
        } else {

            Node currentElement = head;
            while (currentElement.getNext() != null) {
                currentElement = currentElement.getNext();
            }
            currentElement.setNext(new Node(i, head));
        }
        counter++;
    }

    public void addAtFirst(int newValue){
        Node currentElement=new Node(newValue,head);
        head=currentElement;
        counter++;
    }

    public boolean remove(int index){
        if(index>counter || index<0){
            return false;
        }

        if(index==0){
            head=head.getNext();
            counter--;
            return true;
        }

        Node currentElement=head;

        for(int i=0;i<index-1;i++){
            currentElement=currentElement.getNext();
        }

        currentElement.setNext(currentElement.getNext().getNext());
        counter--;
        return true;

    }

    @Override
    public String toString() {
        StringBuilder message=new StringBuilder("[");

        if(head!=null) {
            Node currentElement = head;
            do{
                message.append(currentElement.getData() + " ");
                currentElement = currentElement.getNext();
            }while(currentElement !=null);
        }
        message.append("]");

        return message.toString();
    }
}

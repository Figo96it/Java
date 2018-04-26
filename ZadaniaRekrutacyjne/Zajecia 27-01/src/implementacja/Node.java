package implementacja;

public class Node {

    Node next;
    Integer data;

    public Node(Node next, Integer data) {
        this.next = next;
        this.data = data;
    }

    public Node(Integer data, Node head) {
        this.data = data;
        next=null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }
}

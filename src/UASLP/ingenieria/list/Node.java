package UASLP.ingenieria.list;

public class Node {
    private int data;
    private Node previus;
    private Node next;

    Node (int data){
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setDato(int data) {
        this.data = data;
    }

    public Node getPrevius() {
        return previus;
    }

    public void setPrevius(Node previus) {
        this.previus = previus;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

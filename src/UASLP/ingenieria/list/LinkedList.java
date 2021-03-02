package UASLP.ingenieria.list;
/** javadoc
 * lista doblemente ligada
*/
public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public void add(int data){
        Node node = new Node(data);

        node.setPrevius(tail);
        if(tail != null){
            tail.setNext(node);
        }

        if(head == null){
            head = node;
        }
        tail = node;
        size++;
    }

    public int getSize() {
        return size;
    }
}

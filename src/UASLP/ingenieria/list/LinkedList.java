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

    public int get(int index){
        Node currentNode = head;
        int currentIndex = 0;
        while(currentIndex < index){
            currentNode=currentNode.getNext();
            currentIndex++;
        }
        return currentNode.getData();
    }

    public void delate(int index){
        Node currentNode = head;
        int currentIndex = 0;

        if(index < 0 || index >= size){
            return;
        }

        if(index == 0){
            head = head.getNext();
            head.setPrevius(null);
        }

        if(index == size-1){
            tail = tail.getPrevius();
            tail.setPrevius(null);

        }

        if(index > 0 && index < size-1){
            while(currentIndex < index){
                currentNode = currentNode.getNext();
                currentIndex++;
            }
            currentNode.getPrevius().setNext(currentNode.getNext());
            currentNode.getNext().setPrevius(currentNode.getPrevius());
        }
        size--;

    }
}

package UASLP.ingenieria.list;
/** javadoc
 * lista doblemente ligada
*/
public class LinkedList<G> implements List<G>{
    private Node<G> head;
    private Node<G> tail;
    private int size;

    public LinkedList(){
        listaCount ++;
    }
    private static int listaCount=getListaCount();
    public static int getListaCount(){
        return listaCount;
    }

    private static class Node<T>{
        private T data;
        private Node<T> previous;
        private Node<T> next;

        Node(T data){
            this.data=data;
        }
        public T getData() {
            return data;
        }
        public Node<T> getPrevious() {
            return previous;
        }
        public void setPrevious(Node<T> previous) {
            this.previous = previous;
        }
        public Node<T> getNext() {
            return next;
        }
        public void setNext(Node<T> next) {
            this.next = next;
        }
    }

    public class ReverseIterator implements Iterator {
        private Node<G> currentNode;

        ReverseIterator(Node<G> tail)
        {
            currentNode = tail;
        }

        public boolean hasNext(){
            return currentNode != null;
        }

        public G next(){
            G data = currentNode.getData();

            currentNode = currentNode.getPrevious();

            return data;
        }

    }
    //ITE

    public class FormardIterator implements Iterator<G> {
        private Node<G> currentNode;

        public FormardIterator() {
            this.currentNode = head;
        }

        //public FormardIterator(FormardIterator iterator) {
         //   currentNode = iterator.currentNode;
       // }

        public boolean hasNext() {
            return currentNode != null;
        }

        public G next() {
            G data = currentNode.getData();

            currentNode = currentNode.getNext();

            return data;
        }

       // Node<G> getCurrentNode() {  // modificador de acceso se llama -> package-private
        //    return currentNode;
       // }
    }
      @Override
    public void add(G data){
        Node<G> node = new Node<>(data);

        node.setPrevious(tail);
        if(tail != null){
            tail.setNext(node);
        }

        if(head == null){
            head = node;
        }
        tail = node;
        size++;
    }
    @Override
    public Iterator<G> getIterator(){
        return new FormardIterator();
    }

    @Override
    public G get(int index){        Node<G> currentNode = head;
        int currentIndex = 0;
        while(currentIndex < index){
            currentNode=currentNode.getNext();
            currentIndex++;
        }
        return currentNode.getData();
    }
    @Override
    public void delate(int index) throws MyIndexOutOfBoundException{
        Node<G> currentNode = head;
        int currentIndex = 0;
        if (index < 0 || index >= size) {
            throw new MyIndexOutOfBoundException();
        }
        size--;

        if (size == 0) {
            head = null;
            tail = null;
            return;
        }

        if(index == 0){
            head = head.next;
            head.previous = null;

        }

        if(index == size){
            tail = tail.previous;
            tail.next = null;
        }

        if(index > 0 && index < size){
            while(currentIndex < index){
                currentNode = currentNode.getNext();
                currentIndex++;
            }
            currentNode.getPrevious().setNext(currentNode.getNext());
            currentNode.getNext().setPrevious(currentNode.getPrevious());
        }
    }

  //  @Override
   /* public void insert(G data, Position position, Iterator<G> it) {
        // ¿qué ofrece java para restringir los valores de position a solamente BEFORE y AFTER?

        Node<G> newNode = new Node<>(data);
        Node<G> currentNode = ((FormardIterator)it).getCurrentNode();

        if (position == Position.AFTER) {
            newNode.setNext(currentNode.getNext());
            newNode.setPrevious(currentNode);
            currentNode.setNext(newNode);
            if (newNode.getNext() != null) {
                newNode.getNext().setPrevious(newNode);
            } else {
                tail = newNode;
            }
        } else if (position == Position.BEFORE) {
            newNode.setPrevious(currentNode.getPrevious());
            newNode.setNext(currentNode);
            currentNode.setPrevious(newNode);
            if (newNode.getPrevious() != null) {
                newNode.getPrevious().setNext(newNode);
            } else {
                head = newNode;
            }
        } else {
            System.out.println("No conozco el valor de position");
        }
        size++;

    }*/


    //Iterador -> patrón de diseño
    @Override
    public int getSize() {
        return size;
    }
    @Override
    public ReverseIterator getReverseIterator() {
        return new ReverseIterator(tail);
        }
}

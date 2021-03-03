package UASLP.ingenieria.list;
//iterar a la lista de atras a adelante

public class ReverseIterator {
    private Node currentNode;

    ReverseIterator(Node tail)
    {
        currentNode = tail;
    }

    public boolean hasNext(){
        return currentNode != null;
    }

    public int next(){
        int data = currentNode.getData();

        currentNode = currentNode.getPrevious();

        return data;
    }

}

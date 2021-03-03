package UASLP.ingenieria;

import UASLP.ingenieria.list.Iterator;
import UASLP.ingenieria.list.LinkedList;


public class Main {

    public static void main(String[] args) {
        LinkedList lista1 =new LinkedList();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        lista1.add(4);


        Iterator it=lista1.getIterator();
        while(it.hasNext()){
            int element = it.next();//regresar el dato y avanzar
            System.out.println("dato" + element);
        }
    }
}

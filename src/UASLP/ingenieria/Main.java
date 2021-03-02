package UASLP.ingenieria;

import UASLP.ingenieria.list.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList lista1 =new LinkedList();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        lista1.add(4);

        System.out.println("El tamaño es"+ lista1.getSize());
    }
}

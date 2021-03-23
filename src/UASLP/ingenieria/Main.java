package UASLP.ingenieria;

import UASLP.ingenieria.list.Iterator;
import UASLP.ingenieria.list.LinkedList;
import UASLP.ingenieria.list.List;
import UASLP.ingenieria.list.Position;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int cuenta=LinkedList.getListaCount();
        List<Integer> lista1 = new LinkedList<>();
        List<String> lista2 = new LinkedList<>();


        lista1.add(1);
        lista1.add(4);
        lista1.add(3);
        lista1.add(7);

        lista2.add("hola");
        lista2.add("Ayer");
        lista2.add("comi");
        lista2.add("posho");
        lista2.add("holiwiz");


       // Iterator<Integer> it = lista1.getIterator();

//        while(it.hasNext()){
//            LinkedList<Integer>.Iterator backupIt = lista1.new Iterator(it);
//            int element = it.next(); //regresar el dato y avanzar el iterador
//
//            if(element == 3){
//                lista1.insert(10, Position.BEFORE, backupIt);
//            }
//
//            if(element == 7){
//                lista1.insert(15, Position.AFTER, backupIt);
//            }
//        }

        lista1.delate(3);

        System.out.println("---------------------");

        System.out.println("El tamaño es:" + lista1.getSize());

       Iterator<Integer> it = lista1.getIterator();

        while(it.hasNext()){
            int element = it.next();

            System.out.println("Dato: " + element);
        }

        System.out.println("---------------------");

        it = lista1.getReverseIterator();

        while(it.hasNext()){
            int element = it.next();

            System.out.println("Dato: " + element);
        }

        System.out.println("---------------------");
        Iterator<String> itstrings = lista2.getIterator();
        while(itstrings.hasNext()){
            System.out.println(itstrings.next());
        }


    }
}




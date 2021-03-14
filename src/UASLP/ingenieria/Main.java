package UASLP.ingenieria;

import UASLP.ingenieria.list.LinkedList;
import UASLP.ingenieria.list.Position;


import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        int cuenta=LinkedList.getListaCount();
        LinkedList<Integer> lista1 = new LinkedList<>();
        LinkedList<String> lista2 = new LinkedList<>();
        LinkedList<Float> lista3 = new LinkedList<>();
        LinkedList<Double> lista4 = new LinkedList<>();

        lista1.add(1);
        lista1.add(4);
        lista1.add(3);
        lista1.add(7);

        lista2.add("hola");
        lista2.add("Ayer");
        lista2.add("comi");
        lista2.add("posho");
        lista2.add("holiwiz");

        lista3.add(1.6f);
        lista3.add(0.4f);
        lista3.add(3.5f);
        lista3.add(8.96f);

        lista4.add(1.3);
        lista4.add(0.45);
        lista4.add(3.9);
        lista4.add(75.4);

        LinkedList<Integer>.Iterator it = lista1.getIterator();

        while(it.hasNext()){
            LinkedList<Integer>.Iterator backupIt = lista1.new Iterator(it);
            int element = it.next(); //regresar el dato y avanzar el iterador

            if(element == 3){
                lista1.insert(10, Position.BEFORE, backupIt);
            }

            if(element == 7){
                lista1.insert(15, Position.AFTER, backupIt);
            }
        }

        lista1.delate(3);

        System.out.println("---------------------");

        System.out.println("El tamaño es:" + lista1.getSize());

        it = lista1.getIterator();

        while(it.hasNext()){
            int element = it.next();

            System.out.println("Dato: " + element);
        }

        System.out.println("---------------------");

        LinkedList<Integer>.ReverseIterator reverseIterator = lista1.getReverseIterator();

        while(reverseIterator.hasNext()){
            int element = reverseIterator.next();

            System.out.println("Dato: " + element);
        }

        System.out.println("---------------------");
        LinkedList<String>.Iterator itstrings = lista2.getIterator();
        while(itstrings.hasNext()){
            System.out.println(itstrings.next());
        }

        System.out.println("---------------------");
        LinkedList<Float>.Iterator flots = lista3.getIterator();
        while(flots.hasNext()){
            System.out.println(flots.next());
        }
        System.out.println("---------------------");
        LinkedList<Double>.Iterator doubles = lista4.getIterator();
        while(doubles.hasNext()){
            System.out.println(doubles.next());
        }


    }
}




package UASLP.ingenieria;

import UASLP.ingenieria.list.*;

public class Main {

    public static void main(String[] args) {
        int cuenta=LinkedList.getListaCount();
        List<Integer> lista1 = new ArrayList<>();
        List<String> lista2 = new LinkedList<>();
        List<String> lista3 = new ArrayList<>();


        lista1.add(1);
        lista1.add(4);
        lista1.add(3);
        lista1.add(7);
        lista1.add(5);
        lista1.add(9);

        lista2.add("hola");
        lista2.add("Ayer");
        lista2.add("comi");
        lista2.add("posho");
        lista2.add("holiwiz");

        lista3.add("dale");
        lista3.add("A");
        lista3.add("Tu");
        lista3.add("cuerpo");
        lista3.add("Alegria");


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



        System.out.println("---------------------");

        System.out.println("El tamaño es:" + lista1.getSize());

       Iterator<Integer> it = lista1.getIterator();

        while(it.hasNext()){
            int element = it.next();

            System.out.println("Dato: " + element);
        }
        lista1.delate(3);
        System.out.println("---------------------");

        it = lista1.getReverseIterator();
        System.out.println("El tamaño es:" + lista1.getSize());
        while(it.hasNext()){
            int element = it.next();

            System.out.println("Dato: " + element);
        }

        System.out.println("---------------------");
        Iterator<String> itstrings = lista2.getIterator();
        while(itstrings.hasNext()){
            System.out.println(itstrings.next());
        }
        System.out.println("---------------------");
        Iterator<String> ituwu = lista3.getIterator();
        System.out.println("El tamaño es:" + lista3.getSize());
        while(ituwu.hasNext()){
            String element = ituwu.next();

            System.out.println("Dato: " + element);
        }
        lista3.delate(3);
        System.out.println("---------------------");

        ituwu = lista3.getReverseIterator();
        System.out.println("El tamaño es:" + lista3.getSize());
        while(ituwu.hasNext()){
        String element = ituwu.next();

        System.out.println("Dato: " + element);
     }
    }
}




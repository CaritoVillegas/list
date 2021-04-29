package UASLP.ingenieria;

import UASLP.ingenieria.list.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTest {
    //given when then
    @Test

    public void givenANewList_ThenListIsEmpty(){
        //given

        //when
        LinkedList<Integer> lista = new LinkedList<>();
        //then
        //aserciones-> asserts
        assertEquals(0,lista.getSize());

    }
    @Test
    public void SizeWhenIsNotExistenElement(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(5);
        lista.add(9);
        lista.add(16);
        lista.delate(3);
        assertEquals(3,lista.getSize());
    }
    @Test
    public void SizeWhenTheListIsEmpty(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(5);
        lista.add(9);
        lista.add(16);
        lista.delate(2);
        lista.delate(1);
        lista.delate(0);
        assertEquals(0,lista.getSize());
    }

    @Test
    public void DeleteLastElement(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(5);
        lista.add(9);
        lista.add(16);
        lista.delate(2);
        assertEquals(9,lista.get(1));
    }

    @Test
    public void DeleteMidleElement(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(5);
        lista.add(9);
        lista.add(16);
        lista.delate(1);
        assertEquals(5,lista.get(0));
        assertEquals(16,lista.get(1));
    }

    @Test
    public void DeleteLfirstElement(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(5);
        lista.add(9);
        lista.add(16);
        lista.delate(0);
        assertEquals(9,lista.get(0));
    }

    @Test
    public void IsSizeIncrementing(){
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(5);
        lista.add(9);
        lista.add(16);

        assertEquals(3,lista.getSize());
    }
    @Test
    public void IteratorHasNextWhenIsCalled(){
        LinkedList<Integer> lista = new LinkedList<>();
        Integer aux=0;
        lista.add(1);
        lista.add(5);
        lista.add(9);
        lista.add(16);

        Iterator<Integer> it = lista.getIterator();

        while(it.hasNext()){
            aux = it.next();
        }

        assertEquals(16,aux);
    }

    @Test
    public void ReverseIteratorHasNextWhenIsCalled(){
        LinkedList<Integer> lista = new LinkedList<>();
        Integer aux=0;
        lista.add(1);
        lista.add(5);
        lista.add(9);
        lista.add(16);
        Iterator<Integer> it = lista.getReverseIterator();

        while(it.hasNext()){
            aux = it.next();
        }
        assertEquals(1,aux);
    }
}

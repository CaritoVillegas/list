package UASLP.ingenieria;

import UASLP.ingenieria.list.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
    public void SizeWhenIsNotExistenElement()throws MyIndexOutOfBoundException{
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(5);
        lista.add(9);
        lista.add(16);
        lista.delate(3);
        assertEquals(3,lista.getSize());
    }
    @Test
    public void DeleteAllElements()throws MyIndexOutOfBoundException{
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(5);
        lista.add(10);
        lista.add(50);

        lista.delate(2);
        lista.delate(1);
        lista.delate(0);

        assertEquals(0,lista.getSize());
    }

    @Test
    public void DeleteLastElement()throws MyIndexOutOfBoundException{
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(5);
        lista.add(9);
        lista.add(16);
        lista.delate(2);
        assertEquals(9,lista.get(1));
    }

    @Test
    public void DeleteMidleElement()throws MyIndexOutOfBoundException{
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(5);
        lista.add(9);
        lista.add(16);
        lista.delate(1);
        assertEquals(5,lista.get(0));
        assertEquals(16,lista.get(1));
    }

    @Test
    public void DeleteLfirstElement()throws MyIndexOutOfBoundException{
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

    @Test
    public void givenAListWith5Element_whenInterator_thenElementsAccesible(){
        LinkedList<Integer> list=new LinkedList<>();
        list.add(500);
        list.add(600);
        list.add(700);
        list.add(800);
        list.add(100);

        Iterator<Integer> it= list.getIterator();

        assertTrue(it.hasNext());
        assertEquals(500,it.next());
        assertTrue(it.hasNext());
        assertEquals(600,it.next());
        assertTrue(it.hasNext());
        assertEquals(700,it.next());
        assertTrue(it.hasNext());
        assertEquals(800,it.next());
        assertTrue(it.hasNext());
        assertEquals(100,it.next());
        assertFalse(it.hasNext());
    }
    @Test
    public void givenAListWith5Element_whenReverseInterator_thenElementsAccesible(){
        LinkedList<Integer> list=new LinkedList<>();
        list.add(500);
        list.add(600);
        list.add(700);
        list.add(800);
        list.add(100);

        Iterator<Integer> it= list.getReverseIterator();

        assertTrue(it.hasNext());
        assertEquals(100,it.next());
        assertTrue(it.hasNext());
        assertEquals(800,it.next());
        assertTrue(it.hasNext());
        assertEquals(700,it.next());
        assertTrue(it.hasNext());
        assertEquals(600,it.next());
        assertTrue(it.hasNext());
        assertEquals(500,it.next());
        assertFalse(it.hasNext());
    }


}

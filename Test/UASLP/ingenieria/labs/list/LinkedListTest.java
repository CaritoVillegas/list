package UASLP.ingenieria.labs.list;

import UASLP.ingenieria.list.ArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTest {
    //given when then
    @Test

    public void givenANewList_ThenListIsEmpty(){
        //given

        //when
        ArrayList<Integer> lista = new ArrayList<>();
        //then
        //aserciones-> asserts
        assertEquals(0,lista.getSize());

    }

}

package UASLP.ingenieria;


import UASLP.ingenieria.list.ArrayList;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayListTest {

    @Test
    public void whenArrayListIsCreate_thenSizeisZero(){
        //inicializacion
        ArrayList<Integer> list = new ArrayList<>();
        //ejecucion
        int size=list.getSize();
        //validacion
        assertThat(size).isZero();
    }

    @Test
    public void givenANewArray_whenAddElementSizeIsOne(){
        //inicializacion
        ArrayList<Integer> list =   new ArrayList<>();
        list.add(500);
        //ejecucion

        //validacion
        assertThat(list.getSize()).isEqualTo(1);
        assertThat(list.get(0)).isEqualTo(500);
    }
}

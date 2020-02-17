package com.piechowicz.adam2;

import org.junit.jupiter.api.Test;

public class LinkedListTest {

    private LinkedList lista = new LinkedList();


    @Test
    void addToEnd(){
        String test = "test";
        LinkedList.addToEnd(lista, test);
    }

    @Test
    void clear(){
        String test = "test";
        String test2 = "testt";
        String test3 = "testt";
        LinkedList.addToEnd(lista, test);
        lista.reset();
    }


}

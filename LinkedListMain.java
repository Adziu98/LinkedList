package com.piechowicz.adam2;

import static com.piechowicz.adam2.LinkedList.*;

public class LinkedListMain {
    public static void main (String[] args) {
        LinkedList list = new LinkedList();
        String test1 = "pizda";
        String test2 = "a";
        String test3 = "d";
        String test4 = "a";
        list = addToEnd(list, test2);
        list = addToBeginning(list, test3);
        printList(list);
//        list = addToEnd(list, pizda3);
//        list = addToEnd(list, pizda);
//        list = addToEnd(list, pizda4);
//        list = addToEnd(list, 2);
//        list = addToEnd(list, 3.23);
//        list = addToEnd(list, 4);
//        list = addToEnd(list, 5);
//        list = addToEnd(list, 6);
//        System.out.println(list);
////        printList(list);
//        list.removeItem(list, 5);
////        printList(list);
//        printList(list);
//        list.getFirst(list);
//        list.getLast(list);
//        list.getLength(list);
//        list.getItem();
//        printList(list);
//        printList(list);
//        list.reset();
//        printList(list);
    }
}

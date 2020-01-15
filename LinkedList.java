package com.piechowicz.adam2;



public class LinkedList {
    Node head; // Poczatek listy

    static class Node {
        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public static LinkedList insert(LinkedList list, int data) {
        // Nowy element z wartością
        Node new_node = new Node(data);
        new_node.next = null;

        // Jesli lista jest pusta
        // zrob nowy element jako glowny
        if (list.head == null) {
            list.head = new_node;
        } else {
            // Else traverse till the last node
            // and insert the new_node there
            Node last = list.head;// Nie do końca rozumiem co się dzieje od lini 32 do lini 37 kiedy dodajemy element 4,5,6
            while (last.next != null) {
                last = last.next;
            }

            // Ustaw nowy element jako ostatni element
            last.next = new_node;
        }

        return list;
    }

    public static void printList(LinkedList list) {
        Node currNode = list.head;
        System.out.println("LinkedList: ");

        while (currNode != null) {
            System.out.println(currNode.data + " ");

            currNode = currNode.next;
        }
    }

    public static LinkedList deleteAtPosition(LinkedList list, int index) {
        Node currNode = list.head, prev = null;

        if (index == 0 && currNode != null) {
            list.head = currNode.next;

            System.out.println(index + "position element deleted");

            return list;
        }

        int counter = 0;
         while (currNode != null) {

             if (counter == index) {

                 prev.next = currNode.next;
                 System.out.println((index + "position element deleted"));
                 break;
             } else {
                 prev = currNode;
                 currNode = currNode.next;
                 counter++;
             }
         }

         if (currNode == null) {
             System.out.println(index + " position element not found");
         }
         return list;
    }

    public static void main (String[] args) {
        LinkedList list = new LinkedList();
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        System.out.println(list);
        printList(list);

        deleteAtPosition(list, 10);
        printList(list);
    }
}

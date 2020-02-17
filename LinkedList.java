package com.piechowicz.adam2;


public class LinkedList<E> {

    Node head;
    private boolean czyPusta = false;

    static class Node <E>{
        E data;
        Node next;
        Node previous;

        Node(E d)
        {
            data = d;
            next = null;
            previous = null;
        }
    }

    public static <E> LinkedList addToEnd(LinkedList list, E data) {
        Node new_node = new Node(data);
        new_node.next = null;

        if (list.head == null) {
            list.head = new_node;
        } else {

            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = new_node;
        }

        return list;
    }
    //TODO
    public static <E> LinkedList addToBeginning(LinkedList list, E data) {
        Node currNode = new Node(data);
        currNode.data = data;
        currNode.next = list.head;
        list.head = currNode;
        return list;
    }

    public static void printList(LinkedList list) {
        Node currNode = list.head;
        System.out.print("LinkedList: ");

        while (currNode != null) {
            System.out.print(currNode.data + " ");

            currNode = currNode.next;
        }
    }

    public static LinkedList removeItem(LinkedList list, int index) {
        Node currNode = list.head, prev = null;

        if (index == 0 && currNode != null) {
            list.head = currNode.next;

            System.out.println(index + " position element deleted");

            return list;
        }

        int counter = 0;
         while (currNode != null) {

             if (counter == index) {

                 prev.next = currNode.next;
                 System.out.println("");
                 System.out.println(("Index " + index + " has been deleted"));
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

    public static void getFirst(LinkedList list) {
        Node currNode = list.head;
        if(currNode == null) {
            System.out.println("List is empty.");
        } else {
            System.out.println();
            System.out.println("First element of the list " + currNode.data);
        }

    }
    public static void getLast(LinkedList list) {
        Node last = list.head;
        if(last == null) {
            System.out.println("List is empty.");
        } else {
            while (last.next != null) {
                last = last.next;
            }

            // Ustaw nowy element jako ostatni element
            last.next = last.previous;
            System.out.println("Last Element of the list " + last.data);
        }
    }
    //do poprawy
    public static void getLength(LinkedList list) {
        Node last = list.head;
        int counter = 0;
        if (last == null) {
            System.out.println("List is Empty.");

        } else {
        while (last != null) {
            System.out.println(last.data + " ");

            last = last.next;
            counter++;
            }
        }

    }

    public static <E> void getItem(LinkedList list, E item){
        Node nodeItem = list.head;
        while (nodeItem.data != item) {
            nodeItem = nodeItem.next;
        }
        System.out.println("That what you searching for " + nodeItem.data);
    }

    public void reset() {
        this.head = null;
        System.out.println("List has been deleted");
    }

    public boolean isEmpty() {
        return(this.head == null);
    }
}

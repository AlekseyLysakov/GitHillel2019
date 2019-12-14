package HW9;

import kotlin.collections.unsigned.UArraysKt;

public class LinkedListTest {

    public static void main (String [] args){
     LinkedList<Integer> linkedList = new LinkedList<>();
     linkedList.add(1);
     linkedList.add(2);
     linkedList.add(3);

        System.out.println("Init LinkedList");
        System.out.println(linkedList);

        System.out.print("Contain 2: ");
        System.out.println(linkedList.contains(2));

        System.out.println("Delete 1");
        linkedList.eDelete(1);
        System.out.println(linkedList);

        System.out.println("Delete 3");
        linkedList.eDelete(3);
        System.out.println(linkedList);

        System.out.println("Delete 2");
        linkedList.eDelete(2);
        System.out.println(linkedList);

        System.out.print("Show size: ");
        System.out.println(linkedList.size());

        linkedList.add(4);
        System.out.print("Show size: ");
        System.out.println(linkedList.size());

    }

}

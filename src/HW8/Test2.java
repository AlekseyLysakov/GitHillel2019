package HW8;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test2 {
    public static void main (String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        for (int i = 0; i <= 1000000; i++) {
            arraylist.add((int) (Math.random()*100));
        }
        Long start = System.nanoTime();

        for (int i = 0; i <= 100000; i++) {
            arraylist.add((int) (Math.random()*100));
        }
        System.out.println(System.nanoTime() - start + " ms");


        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i <= 1000000; i++) {
            linkedList.add((int) (Math.random()*100));
        }
        Long start2 = System.nanoTime();

        for (int i = 0; i <= 100000; i++) {
            ((LinkedList<Integer>) linkedList).addLast((int)(Math.random()*100));
        }

        System.out.println(System.nanoTime() - start + " ms");



    }
}

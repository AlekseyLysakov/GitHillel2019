package HW14;


import kotlin.collections.unsigned.UArraysKt;

public class Class_HW14 {

    public static void main(String[] args) {

        InsertionSort insSort = new InsertionSort(4);
        insSort.arr[0] = 2;
        insSort.arr[1] = 3;
        insSort.arr[2] = 1;
        insSort.arr[3] = 5;
        insSort.insertionSort();
        insSort.display();

        InterpolationSearch intSearch = new InterpolationSearch();
        int index = intSearch.interpolationSearch(new int[]{3,5,9,1,5,7}, 7);
        System.out.println(index);

    }
    }



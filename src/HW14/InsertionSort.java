package HW14;

/*
Сортировка методом вставки - стр 103
 */

public class InsertionSort {

    int[] arr;

    public InsertionSort(int max) {
        arr = new int[max];
    }

    public void insertionSort() {
        int in, out;
        for (out = 1; out < arr.length - 1; out++) {
            int temp = arr[out];
            in = out;
            while (in > 0 && arr[in - 1] >= temp) {
                arr[in] = arr[in - 1];
                --in;
            }
            arr[in] = temp;
        }
    }

    public void display() {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }
}


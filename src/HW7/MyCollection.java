package HW7;

import kotlin.collections.UArraySortingKt;
import kotlin.collections.unsigned.UArraysKt;

import java.util.Arrays;
import java.util.Objects;

/*
HW7
Реализовать простую коллекцию для String на базе массива.
добавить следующие методы для работы с коллекцией:
добавлять (add),
удалять(delete),
доставать по индексу (get),
проверять наличие элемента (contains),
проверять на равенство (equals),
очищать (clear),
находить индекс элемента (find or indexOf),
узнавать размер (getSize).
 */

public class MyCollection {

    public static void main(String[] args) {


    }
}

class Collection {
    String[] array;

    Collection() {
        array = new String[10];
    }

    public int getSize() {
    int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null)
                count += 1;
        }
        return count;
    }

    public boolean add(String str) {
        if (getSize() + 1 <= array.length) {
            array[getSize()] = str;
        } else {
            String[] array2 = new String[(int) (array.length * 1.6)];
            for (int i = 0; i < getSize(); i++) {
                array2[i] = array[i];
            }
            array2[getSize()] = str;
            array = array2;
        }
        return true;
    }

    public boolean delete(int index) { // удаление значения по индексу
        if (index < array.length - 1) {
            for (int i = index; i < array.length-1; i++) {
                array[i] = array[i + 1];
            }
            return true;
        } else if (index == array.length - 1) {
            array[index] = null;
            return true;
        } else {
            return false;
        }
    }

    public boolean delete1(String x) { // удаление значения по значению
        for (int a = 0; a < array.length; a++) {
            if (array[a] == x) {
                for (int i = a; i < array.length - 1; i++) {
                    array[i] = array[i + 1];
                }
                array[array.length - 1] = null;
                return true;
            }
        }
        return false;
    }

    public boolean contains(String x) {
        for (int i = 0; i <array.length ; i++) {
            if(array[i] == x){
                return true;
            }
        }
        return false;
    }

    public String get(int x) {
        if (x < array.length) {
            for (int i = 0; i < array.length; i++) {
                if (i == x) {
                    return array[i];
                }
            }
        }
        return "Вы ввели несуществующий индекс массива";
    }

    public boolean clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
        return true;
    }

    public int findOrIndexOf(String x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                return i;
            }
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Collection that = (Collection) o;
        return Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }
}
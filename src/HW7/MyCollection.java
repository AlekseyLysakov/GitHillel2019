package HW7;

import kotlin.collections.UArraySortingKt;
import kotlin.collections.unsigned.UArraysKt;

import java.util.Arrays;
import java.util.Objects;

public class MyCollection {

    public static void main(String[] args) {

        Collection coll = new Collection();
        coll.array[0] = "содержит";
        coll.array[1] = "не содержит";

        Collection coll1 = new Collection();
        coll1.array[0] = "содержит";
        coll1.array[1] = "не содержит";

        System.out.println(coll.getSize());
        System.out.println(coll.add("добавленное значение"));
        System.out.println(coll.delete(9));
        System.out.println(coll.contains("содержит"));
        System.out.println(coll.delete1("содержит"));
        System.out.println(coll.get(9));
        System.out.println(coll.clear());
        System.out.println(coll.findOrIndexOf("содержит"));
        System.out.println(coll.equals(coll1));

    }
}

class Collection {
    int count = 0;
    String[] array;

    Collection() {
        array = new String[10];
    }

    public int getSize() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null)
                count += 1;
        }
        return count;
    }

    public boolean add(String x) {
        if (getSize() == array.length - 1) {
            String[] array2 = new String[16];
            for (int i = 0; i < array2.length; i++) {
                array2[i] = array[i];
            }
            return false;
        } else {
            array[getSize()+1] = x;
        }
        return true;
    }

    public boolean delete(int index) { // удаление значения по индексу
        if (index < array.length - 1) {
            for (int i = index; i < array.length; i++) {
                array[index] = array[index + 1];
            }
            return true;
        } else if (index == array.length - 1) {
            array[array.length - 1] = null;
            return true;
        } else {
            return false;
        }
    }

    public boolean delete1(String x) { // удаление значения по значению
        for (String i : array) {
            if (i == x) {
                for (int a = 0; a < array.length; a++) {
                    if (array[a] == x) {
                        if (a < array.length - 1) {
                            array[a] = array[a + 1];
                            return true;
                        } else if (a == array.length - 1) {
                            array[array.length - 1] = null;
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public boolean contains(String x) {
        for (String i : array) {
            return (i == x);
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
        } else {
            return "Вы ввели несуществующий индекс массива";
        }
        return null;
    }

    public boolean clear() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                array[i] = null;
            }
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
        return count == that.count &&
                Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
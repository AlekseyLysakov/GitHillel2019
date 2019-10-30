package HW8;


/*
Зарефакторить прошлое задание с учетом разобранного материала и полученных знаний
надо имплементировать следующий интерфейс :

public interface CustomCollection {
boolean add(String str);
boolean addAll(String[] strArr);
boolean addAll(Collection strColl);
boolean delete (int index);
boolean delete (String str);
String get(int index);
boolean contains(String str);
boolean clear();
int size();
boolean trim();
boolean compare(Collection coll);
}
+ проверить что будет быстрей работать увеличение коллекции по 1 элементу или на 60% от предыдущего значения
 */

import kotlin.collections.unsigned.UArraysKt;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Objects;

public class CustomCollectionTest {

    public static void main(String[] args) {

        Collection collection = new Collection();
        for (int i = 0; i < 100; i++) {
            collection.add("я");
        }
        System.out.println(System.nanoTime() + " ms");

            Collection collection2 = new Collection();
            for (int i = 0; i < 100; i++){
            collection2.add2("ты");
        }
        System.out.println(System.nanoTime() + " ms");


    }
}

interface CustomCollection {
    boolean add(String str);
    boolean addAll(String[] strArr);
    boolean addAll(Collection strColl);
    boolean delete(int index);
    boolean delete(String str);
    String get(int index);
    boolean contains(String str);
    boolean clear();
    int size();
    boolean trim();
    boolean compare(Collection coll);
}

class Collection implements CustomCollection {
    String[] array;

    Collection() {
        array = new String[10];
    }

    @Override
    public boolean add(String str) {
        if (size() + 1 <= array.length) {
            array[size()] = str;
        } else {
            String[] array2 = new String[(int) (array.length * 1.6)];
            for (int i = 0; i < size(); i++) {
                array2[i] = array[i];
            }
            array2[size()] = str;
            array = array2;
        }
        return true;
    }

    public boolean add2(String str) { // увеличение по одному элементу
        if (size() + 1 <= array.length) {
            array[size()] = str;
        } else {
            String[] array2 = new String[array.length+1];
            for (int i = 0; i < size(); i++) {
                array2[i] = array[i];
            }
            array2[size()] = str;
            array = array2;
        }
        return true;
    }

    @Override
    public boolean addAll(String[] strArray) {
        if (array.length - size() < strArray.length) {
            String[] array2 = new String[(int) ((array.length + strArray.length) * 1.6)];
            for (int i = 0; i < size(); i++) {
                array2[i] = array[i];
            }
            array = array2;
        }
        for (String str : strArray) {
            add(str);
        }
        return true;
    }

    @Override
    public boolean addAll(Collection strColl) {
        if (array.length - size() < strColl.array.length) {
            String[] array2 = new String[(int) ((array.length + strColl.array.length) * 1.6)];
            for (int i = 0; i < size(); i++) {
                array2[i] = array[i];
            }
            array = array2;
        }
        for (String str : strColl.array) {
            add(str);
        }
        return true;
    }

    @Override
    public boolean delete(int index) {
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

    @Override
    public boolean delete(String str) {
        for (int a = 0; a < array.length; a++) {
            if (array[a] == str) {
                for (int i = a; i < array.length - 1; i++) {
                    array[i] = array[i + 1];
                }
                array[array.length - 1] = null;
                return true;
            }
               }
        return false;
       }


    @Override
    public String get(int index) {
        if (index < array.length) {
            for (int i = 0; i < array.length; i++) {
                if (i == index) {
                    return array[i];
                }
            }
        }
        return "Вы ввели несуществующий индекс массива";
    }

    @Override
    public boolean contains(String str) {
        for (int i = 0; i <array.length ; i++) {
            if(array[i] == str){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
        return true;
    }

    @Override
    public int size() {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null)
                count += 1;
        }
        return count;
    }

    @Override
    public boolean trim() {
        if (size() != 0) {
            String[] array2 = new String[size()];
            for (int i = 0; i < size(); i++) {
                array2[i] = array[i];
            }
            array = array2;
            return true;
        }
        return false;
    }

    @Override
    public boolean compare(Collection coll) {
        if (size() == coll.size()) {
            for (int i = 0; i < size(); i++) {
                if (array[i] != coll.array[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}


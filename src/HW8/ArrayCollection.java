package HW8;

import java.util.Arrays;
import java.util.Objects;

public class ArrayCollection<E> implements CustomCollection<E> {
    Object[] array;

    ArrayCollection() {
        array = new Object[10];
    }

    @Override
    public boolean add(E str) {
        if (size() + 1 <= array.length) {
            array[size()] = str;
        } else {
            Object[] array2 = new Object[(int) (array.length * 1.6)];
            for (int i = 0; i < size(); i++) {
                array2[i] = array[i];
            }
            array2[size()] = str;
            array = array2;
        }
        return true;
    }

    public boolean add2(E str) { // увеличение по одному элементу
        if (size() + 1 <= array.length) {
            array[size()] = str;
        } else {
            Object[] array2 = new Object[array.length + 1];
            for (int i = 0; i < size(); i++) {
                array2[i] = array[i];
            }
            array2[size()] = str;
            array = array2;
        }
        return true;
    }

    @Override
    public boolean addAll(E[] strArray) {
        if (array.length - size() < strArray.length) {
            Object[] array2 = new Object[(int) ((array.length + strArray.length) * 1.6)];
            for (int i = 0; i < size(); i++) {
                array2[i] = array[i];
            }
            array = array2;
        }
        for (E str : strArray) {
            add(str);
        }
        return true;
    }

    @Override
    public boolean addAll(CustomCollection strColl) {
        if (array.length - size() < strColl.size()) {
            Object[] array2 = new Object[(int) ((array.length + strColl.size()) * 1.6)];
            for (int i = 0; i < size(); i++) {
                array2[i] = array[i];
            }
            array = array2;
        }
        for (int i = 0; i < strColl.size(); i++) {
            add((E)strColl.get(i));
        }
        return true;
    }

    @Override
    public boolean delete(int index) {
        if (index < array.length - 1) {
            for (int i = index; i < array.length - 1; i++) {
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
    public boolean delete(E str) {
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
    public E get(int index) {
        if (index < array.length) {
            for (int i = 0; i < array.length; i++) {
                if (i == index) {
                    return (E)array[i];
                }
            }
        }
        throw new IllegalArgumentException("Вы ввели несуществующий индекс массива");
    }

    @Override
    public boolean contains(E str) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == str) {
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
            Object[] array2 = new Object[size()];
            for (int i = 0; i < size(); i++) {
                array2[i] = array[i];
            }
            array = array2;
            return true;
        }
        return false;
    }

    @Override
    public boolean compare(CustomCollection coll) {
        if (size() == coll.size()) {
            for (int i = 0; i < size(); i++) {
                if (array[i] != coll.get(i)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(array, 0, size()));
    }
}
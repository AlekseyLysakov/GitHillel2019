package HW11;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIterator {

    public static <E> Iterator getIterator(final E[] array) {
        return new Iterator<E>() {
            private int count = array.length;
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < count;
            }

            @Override
            public E next() {
                if (index < count) {
                    return array[index++];
                } else {
                    throw new NoSuchElementException("No such element.");
                }
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Cannot remove item from array.");
            }
        };
    }
}


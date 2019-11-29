package HW8;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

//Написать UnitTest для реализованной ранее коллекции на основе массива (реализация ArrayList)

public class ArrayCollectionTest {


    @Test
    public void add() {
        ArrayCollection<String> arrayCollection = new ArrayCollection<>();
        assertTrue(arrayCollection.size() == 0);
        arrayCollection.add("a");
        assertTrue((arrayCollection.size() == 1));
        arrayCollection.contains("a");
    }

    @Test
    public void addAll() {
            ArrayCollection<String> arrayCollectionExpected = new ArrayCollection<>();
            arrayCollectionExpected.addAll(new String[]{"a", null, "b", "Oka"});

            ArrayCollection<String> arrayCollectionReal = new ArrayCollection<>();
            arrayCollectionReal.add("a");
            arrayCollectionReal.add(null);
            arrayCollectionReal.add("b");
            arrayCollectionReal.add("Oka");
            Assert.assertEquals(arrayCollectionExpected, arrayCollectionReal);
    }

    @Test
    public void testAddAll() {
        ArrayCollection<String> arrayCollection1 = new ArrayCollection<>();
        arrayCollection1.addAll(new String[]{"a", null, " ", "", "b", "Oka"});
        ArrayCollection<String> arrayCollection2 = new ArrayCollection<>();
        arrayCollection2.addAll(arrayCollection1);
        assertEquals(arrayCollection2, arrayCollection1);
    }

    @Test
    public void delete() {
        ArrayCollection<String> arrayCollectionActual = new ArrayCollection<>();
        arrayCollectionActual.addAll(new String[]{"a", null, " ", "", "b", "Oka"});
        arrayCollectionActual.delete(0);
        assertFalse(arrayCollectionActual.contains("a"));
    }

    @Test
    public void testDelete() {
        ArrayCollection<String> arrayCollectionActual = new ArrayCollection<>();
        arrayCollectionActual.addAll(new String[]{"a", null, " ", "", "b", "Oka"});
        int x = arrayCollectionActual.size();
        arrayCollectionActual.delete("a");
        assertFalse(arrayCollectionActual.contains("a"));
        assertTrue(arrayCollectionActual.size()<x);
    }

    @Test
    public void get() {
        ArrayCollection<String> arrayCollectionActual = new ArrayCollection<>();
        arrayCollectionActual.addAll(new String[]{"a", null, " ", "", "b", "Oka"});
        assertTrue(arrayCollectionActual.get(0)=="a");
    }

    @Test
    public void contains() {
        ArrayCollection<String> arrayCollectionActual = new ArrayCollection<>();
        arrayCollectionActual.addAll(new String[]{"a", null, " ", "", "b", "Oka"});
        assertTrue(arrayCollectionActual.contains("a"));
    }

    @Test
    public void clear() {
        ArrayCollection<String> arrayCollectionActual = new ArrayCollection<>();
        arrayCollectionActual.addAll(new String[]{"a", "b", "c"});
        arrayCollectionActual.clear();
        assertTrue(arrayCollectionActual.size()==0);
    }

    @Test
    public void size() {
        ArrayCollection<String> arrayCollectionActual = new ArrayCollection<>();
        arrayCollectionActual.addAll(new String[]{"a", "b", "c"});
        assertTrue(arrayCollectionActual.size()==3);
    }

    @Test
    public void trim() {
        ArrayCollection<String> arrayCollectionActual = new ArrayCollection<>();
        arrayCollectionActual.addAll(new String[]{null, null, "b", ""});
        arrayCollectionActual.trim();
        assertFalse(arrayCollectionActual.contains(null));
    }

    @Test
    public void compare() {
        ArrayCollection<String> arrayCollectionExpected = new ArrayCollection<>();
        arrayCollectionExpected.addAll(new String[]{"a", null, "b", "Oka"});

        ArrayCollection<String> arrayCollectionReal = new ArrayCollection<>();
        arrayCollectionReal.add("a");
        arrayCollectionReal.add(null);
        arrayCollectionReal.add("b");
        arrayCollectionReal.add("Oka");
        assertTrue(arrayCollectionExpected.compare(arrayCollectionReal));
    }
}
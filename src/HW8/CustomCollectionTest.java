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


import HW9.LinkedList;

public class CustomCollectionTest {

    public static void main(String[] args) {

        ArrayCollection<String> arrayCollection = new ArrayCollection<>();
        arrayCollection.addAll(new String[]{"a", null, " ", "", "b", "Oka"});

        CustomCollection<String> collection = new LinkedList<>();
        collection.add("Alex");
        collection.add("Luka");
        collection.addAll(new String[]{"Supchik", "Oka"});
        collection.addAll(arrayCollection);

        System.out.println("Init collection");
        System.out.println(collection);

        System.out.println("Delete a");
        collection.delete("a");
        System.out.println(collection);

        System.out.println("Delete 2");
        collection.delete(2);
        System.out.println(collection);

        System.out.println("Delete Oka");
        collection.delete("Oka");
        System.out.println(collection);

        System.out.println("Compare");
        System.out.println(collection.compare(arrayCollection));
        System.out.println(arrayCollection.compare(collection));
        System.out.println(collection.compare(collection));

        System.out.println("Contains");
        System.out.println(collection.contains("fasfsaf"));
        System.out.println(collection.contains("Supchik"));

        System.out.println("Get 4");
        System.out.println(collection.get(4));

        System.out.println("Trim");
        collection.trim();
        System.out.println(collection);

        System.out.println("Size");
        System.out.println(collection.size());

        System.out.println("Clear");
        collection.clear();
        System.out.println(collection);


        //timeTesting();
    }

    private static void timeTesting() {
        ArrayCollection arrayCollection = new ArrayCollection();
        for (int i = 0; i < 100; i++) {
            arrayCollection.add("я");
        }
        System.out.println(System.nanoTime() + " ms");

        ArrayCollection arrayCollection2 = new ArrayCollection();
        for (int i = 0; i < 100; i++) {
            arrayCollection2.add2("ты");
        }
        System.out.println(System.nanoTime() + " ms");
    }
}





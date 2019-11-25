package HW8;

public interface CustomCollection<E> {
    boolean add(E str);
    boolean addAll(E[] strArr);
    boolean addAll(CustomCollection strColl);
    boolean delete(int index);
    boolean delete(E str);
    E get(int index);
    boolean contains(E str);
    boolean clear();
    int size();
    boolean trim();
    boolean compare(CustomCollection coll);
}

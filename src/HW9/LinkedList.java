package HW9;

/*
Домашнее задание 10
Добавлено: 29.10.2019 13:32
HW9
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
на основе интерфейса - реализовать коллекцию на основе связного списка
PS в 5 разделе Связанные списки  - найдете много интресного что поможет вам выполнить ДЗ
 */

import HW8.ArrayCollection;
import HW8.CustomCollection;

public class LinkedList<E> implements CustomCollection<E> {
    Node<E> first;
    Node<E> last;


    @Override
    public boolean add(E str) {
        Node<E> newNode = new Node<>(str, null, null);
        if (first == null) {
            first = newNode;
        } else {
            last.next = newNode;
            newNode.prev = last;
        }
            last = newNode;
        return true;
    }

    public Node<E> eDelete(E str) {
        if (first == null) {
            return null;
        }
        Node current = first;
        while (current.element != str) {
            current = current.next;
            if (current == null) {
                return null;
            }
        }
        if (current == first) {
            first = current.next;

        } else {
            current.prev.next = current.next;
        }
        if (current == last) {
            last = current.prev;


        } else {
            current.next.prev = current.prev;
        }
        return current;
    }

    @Override
    public boolean contains(E str) {
        Node current = first;
        while (current.element != str) {
            current = current.next;
            if (current == null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int size() {
        int size = 0;
        Node current = first;
        while (current!= null) {
            current = current.next;
            size++;
            }
        return size;
    }

    @Override
    public String toString() {
        if (first == null) {
            return "[]";
        }
        StringBuilder output = new StringBuilder("[");
        Node<E> node = first;
        do {
            output.append(node.element);
            if (node.next != null) {
                output.append(", ");
            }
            node = node.next;
        } while (node != null);
        output.append("]");
        return output.toString();
    }

    @Override
    public boolean clear() {
        return false;
    }

    @Override
    public boolean trim() {
        return false;
    }

    @Override
    public boolean compare(CustomCollection coll) {
        return false;
    }


    @Override
    public boolean addAll(E[] strArr) {
        return false;
    }

    @Override
    public boolean addAll(CustomCollection strColl) {
        return false;
    }

    @Override
    public boolean delete(int index) {
        return false;
    }

    @Override
    public boolean delete(E str) { return false; }

    @Override
    public E get(int index) {
        return null;
    }

    private static class Node<E> {
        E element;
        Node<E> next;
        Node<E> prev;

        public Node(E element, Node<E> next, Node<E> prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }

        public void displayNode()
        { System.out.print(element + " "); }
    }
}






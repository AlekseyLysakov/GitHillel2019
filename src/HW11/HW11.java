package HW11;

import HW8.ArrayCollection;

import java.util.*;

// 1. Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.

public class HW11 {


    public static void main(String[] args) {

        // убираем дубликаты из коллекции
        ArrayList<Object> string = new ArrayList<Object>();
        string.add(0,"1");
        string.add(1,"2");
        string.add(2,"3");
        string.add(3,"1");
        string.add(4,"2");
        System.out.println("Origin: " + string);
        DeleteDuplicates delDuplicates = new DeleteDuplicates();
        delDuplicates.deleteDuplicates(string);


        // вывод итератора по массиву
        ArrayIterator arrayIterator = new ArrayIterator();
        Integer[] integers = new Integer[]{3, 6, 5, 7, 4, 5};
        Iterator<Integer> integerIterator = arrayIterator.getIterator(integers);
        while (integerIterator.hasNext()) {
            System.out.println(integerIterator.next());
        }

        // вывод программы для вычисления корней квадратного уравнения
        QuadraticEquation quadraticEquationNew = new QuadraticEquation();
        quadraticEquationNew.quadraticEquation();
    }

        }



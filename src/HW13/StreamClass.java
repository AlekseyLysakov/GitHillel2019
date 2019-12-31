package HW13;

import kotlin.Pair;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamClass {

    public static void main(String[] args) {

        // Имеется коллекция из Integes, используя стримы посчитать среденее значения всех чисел
        List<Integer> collectionIntegers = Arrays.asList(1, 2, 3);
        OptionalDouble average = collectionIntegers.stream().mapToInt(s -> s).average();
        if (average.isPresent()) {
            System.out.println(average.getAsDouble());
        }

        //Имеется коллекция из String, привести все стринги в UPPERCASE и вернуть коллекцию List<Pair>
        List<String> collectionString = Arrays.asList("cat","dog");
        Map<String, Object> map = collectionString.stream().map(String::toUpperCase).collect(Collectors.toMap(Function.identity(), s->s));
        map.forEach((x, y) -> System.out.println("Key: " + x +", value: "+ y));

        //Имеется коллекция из String, отфильтровать и вывести на экран все значения, которые написаны в loverCase and length = 4
        List<String> collectionString2 = Arrays.asList("cats","DOG", "bear", "Fear" );
        List<String> list = collectionString2.stream().filter((s) -> s.length()==4).filter(s -> s.equals(s.toLowerCase())).collect(Collectors.toList());
        System.out.println(list);


    }

}

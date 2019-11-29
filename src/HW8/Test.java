package HW8;

import kotlin.reflect.KClass;

import java.util.ArrayList;
import java.util.List;

public class  Test {

    public static void main(String[] args) {

        String sentence2 ="    Java - очень крутой язык программирования.    ";
        System.out.println(sentence2.trim());

        List<A> a = new ArrayList<>();

        a.add(new A());
        a.add(new B());
        a.add(new A());
        a.add(new B());
        a.add(new A());
        a.add(new B());

        int aCount = 0;
        int bCount = 0;


        for (A b : a) {
            if (b instanceof B) {
                bCount++;
            }else{
                    aCount++;
                }

            }
        System.out.println(aCount + "\n"  + bCount);
        }

    }


class A {
}

class B extends A {
}

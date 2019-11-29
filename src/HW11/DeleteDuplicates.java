package HW11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DeleteDuplicates {
    public static void deleteDuplicates (ArrayList<Object> arrayList){
        Set<Object> unique = new HashSet<>(arrayList);
        arrayList = new ArrayList<>(unique);
        System.out.println("Unique: " + arrayList);
    }
}

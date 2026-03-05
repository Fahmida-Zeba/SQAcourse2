package Javaclass67.Javaclass7;

import java.util.HashSet;
import java.util.Set;

public class Settest {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("pineapple");
        stringSet.add("Berry");
        stringSet.remove("Banana");

        Set<String> anotherset = Set.of("Grapes", "Mango", "Pineapple");
        stringSet.addAll(anotherset);
        stringSet.remove("Mango");

        for (String fruits: stringSet){
            System.out.println("Fruits here: " + fruits);
        }
    }
}

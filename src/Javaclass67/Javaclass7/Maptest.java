package Javaclass67.Javaclass7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maptest {
    public static void main(String[] args) {
        Map<String, Integer> scoreMap = new HashMap<>();
        scoreMap.put("Avea", 80);
        scoreMap.put("Anuvob", 89);
        scoreMap.put("Farhan", 79);

        System.out.println("Marks: " + scoreMap);

        Map<String, Object> newmap= new HashMap<>();
        newmap.put("Name", "Anu");
        newmap.put("Age", 15);
        newmap.put("ID", 1200);
        newmap.put("City", "Dhaka");
        newmap.remove("ID");
        Set<String> anotherset = Set.of("Grapes", "Mango", "Pineapple");
        newmap.put("Anu likes", anotherset);

        System.out.println("Details: " + newmap);
        System.out.println("Age: " + newmap.get("Age"));
    }
}

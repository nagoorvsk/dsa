package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo2 {

    public static void main(String[] args) {

        Map<String, List<String>> empMap = new HashMap<>();
        empMap.computeIfAbsent("name", k->new ArrayList<>()).add("John");
        empMap.computeIfAbsent("name", k->new ArrayList<>()).add("David");

        System.out.println(empMap);
    }
}

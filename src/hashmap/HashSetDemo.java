package hashmap;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {

        String s = "abacd";
        Set<Character> set = new HashSet<>();

        for(char c: s.toCharArray()){
            boolean addResult = set.add(c);
            System.out.println("Boolean Value is: " + addResult);
        }
    }
}

package arrayproblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstUniqueCharacter {

    public static void main(String[] args) {
        String s = "leetcode";
        Map<Character,Integer> frequencyMap = new HashMap<>();
        Set<Character> uniqueSet = new HashSet<>();

        for ( char c: s.toCharArray()){
            frequencyMap.put(c, frequencyMap.getOrDefault(c,0)+1);
        }

        for (char c: s.toCharArray()){
            if (frequencyMap.get(c) == 1 ) {
                System.out.println("First unique character is: " + c);
                break;
            }
        }
    }
}

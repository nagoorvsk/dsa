package arrayproblems;

import java.util.*;

public class GroupAnagram {

    public static void main(String[] args) {

        String[] strings = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String, List<String>> map = new HashMap<>();

        for(String str: strings){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);

            map.computeIfAbsent(sortedString, value -> new ArrayList<>()).add(str);
            //if (!map.containsKey(sortedString)) {
            //    map.put(sortedString, new ArrayList<>());
            //}
            //
            //map.get(sortedString).add(str);
        }

        System.out.println(map);
    }
}

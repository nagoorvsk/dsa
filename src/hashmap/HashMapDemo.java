package hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        int[] arr = {3,3};
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map.put(arr[i], i);
        }

        System.out.println("Map Size" + map.size());
    }
}

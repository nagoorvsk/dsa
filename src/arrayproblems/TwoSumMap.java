package arrayproblems;

import java.util.HashMap;
import java.util.Map;

public class TwoSumMap {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();

        int[] arr = {3,1,7,12,9};
        int sum = 8;

        for(int i = 0; i < arr.length; i++){

            int remainValue = sum - arr[i];

            if(map.containsKey(remainValue)) {
                System.out.println("Indexes are: " + i + " and " + map.get(remainValue));
                break;
            }

            map.put(arr[i], i);
        }
    }
}

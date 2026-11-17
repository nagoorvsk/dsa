package arrayproblems;

import java.util.HashSet;
import java.util.Set;

public class DuplicateProblem {

    public static void main(String[] args) {
        System.out.println(containsDuplicates());
    }

    public static boolean containsDuplicates() {

        int[] nums = {1,2,3,4};
        Set<Integer> uniqueSet = new HashSet<>();

        for(int i=0; i< nums.length;i++){

            if(uniqueSet.contains(nums[i])){
                return true;
            }
            uniqueSet.add(nums[i]);
        }
        return false;
    }
}

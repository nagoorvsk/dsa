package arrayproblems;

public class TwoSum {
    public static void main(String[] args) {

        int[] arr = {2,7,11,15};
        int sum = 9;
        int i=0;
        int j= arr.length-1;

        while(i<j){
            if(arr[i]+arr[j]==sum) {
                System.out.println("Indexes are: " + i + " and " + j);
                break;
            } else if (arr[i]+arr[j] < sum) {
              i++;
            }else {
                j--;
            }
        }
    }
}

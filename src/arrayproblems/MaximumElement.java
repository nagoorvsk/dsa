package arrayproblems;

public class MaximumElement {
    public static void main(String[] args) {
        int[] arr = {3,7,2,9,4,1};
        int maxElement = arr[0];

        for(int i:arr)
        {
            if(i>maxElement)
                maxElement = i;
        }
        System.out.println("Maximum element is: " + maxElement);
    }
}

package arrayproblems;

public class SecLargestElement {

    public static void main(String[] args) {

        int[] arr = {3, 7, 2, 9, 1};
        int maxElement = Integer.MIN_VALUE;
        int secMaxElement = Integer.MIN_VALUE;

        for(int i:arr){
            if(i>maxElement){
                // If array element is greater than current maxElement, the current maxElement becomes second max element...
                secMaxElement = maxElement;
                maxElement = i;
            }else if(i>secMaxElement && i != maxElement){
                // If array element is not greater than maxElement, then we need to compare it with second max element...
                secMaxElement = i;
            }
        }
        System.out.println("Maximum element is: " + maxElement);
        System.out.println("Second maximum element is: " + secMaxElement);
    }
}

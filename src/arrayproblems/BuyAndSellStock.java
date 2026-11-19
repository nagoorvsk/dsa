package arrayproblems;

public class BuyAndSellStock {

    public static void main(String[] args) {

        int[] prices = {3,8,2,10,1,9};
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){

            if(prices[i] < minPrice){
                minPrice = prices[i];
            }

            int todayProfit = prices[i] - minPrice;

            if(todayProfit > maxProfit){
                maxProfit = todayProfit;
            }
        }

        System.out.println("Max Profit is: " + maxProfit);
    }
}

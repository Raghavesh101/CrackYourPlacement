package DSA.ArshGoyalSheet;

public class BuyandSellStock {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buyprice = prices[0];
        for(int i = 1; i<prices.length; i++){
            if(buyprice > prices[i]){
                buyprice = prices[i];
            }
            profit = Math.max(profit,prices[i]-buyprice);
        }
        // System.gc();
        return profit;

    }
}

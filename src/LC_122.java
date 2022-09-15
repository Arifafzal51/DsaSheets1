//public class LC_122 {
//}
class Solution122 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
        for(int i = 1; i < n; i++){
            if(prices[i] > prices[i-1]){
                profit += (prices[i] - prices[i-1]);
            }
        }
        return profit;
    }
}



class Solution2 {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int profit=0;

        for (int i = 0; i < n; i++) {
            if (prices[i] > prices[i-1])
                profit +=(prices[i]-prices[i-1]);

        }
        return profit;

    }
}
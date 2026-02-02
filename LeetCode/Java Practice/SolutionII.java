public class SolutionII {
    public int maxProfit(int[] prices) {
        int maximumProfit = 0;
        int counter = 0;
        for(int count = 0; count < prices.length -  1; count ++){
           counter = count + 1;
            for(; counter < prices.length; counter++){
                 int check = prices[counter] - prices[count];
                 if(maximumProfit < check) maximumProfit = check;

            }
        }
                return maximumProfit;

        
    }
}

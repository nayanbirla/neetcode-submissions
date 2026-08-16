class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;

        for(int i=0;i<prices.length;i++){
            int currMax=0;
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]<prices[j]){
                    currMax=Math.max(currMax,prices[j]-prices[i]);
                }
            }
            maxProfit= Math.max(maxProfit,currMax);
        }
        return maxProfit;
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int max=0;
        int n=prices.length;    
        for(int i=n-1;i>=0;i--){
           if(max<prices[i]){
            max=prices[i];
           }else{
            maxProfit = Math.max(maxProfit,max-prices[i]);
           } 
        }
        return maxProfit;
    }
}

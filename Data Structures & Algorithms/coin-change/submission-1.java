class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount==0) return 0;
        int dp[][]=new int[coins.length][amount+1];
        for(int d[]:dp)
        Arrays.fill(d,-1);
        int val =counter(coins,amount,0,dp);
        return val==1000000?-1:val;
    }

    int counter(int coins[],int amt,int i,int dp[][]){
        if(i>=coins.length) return  1000000;
      
        if(amt==0) return 0;

        if(amt<0) return 1000000;

        if(dp[i][amt]!=-1) return dp[i][amt];

        return dp[i][amt]=Math.min(counter(coins,amt-coins[i],i,dp)+1,counter(coins,amt,i+1,dp));
    }
}

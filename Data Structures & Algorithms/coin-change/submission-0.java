class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount==0) return 0;

        int val =counter(coins,amount,0);
        return val==1000000?-1:val;
    }

    int counter(int coins[],int amt,int i){
        if(i>=coins.length) return  1000000;
      
        if(amt==0) return 0;

        if(amt<0) return 1000000;

        return Math.min(counter(coins,amt-coins[i],i)+1,counter(coins,amt,i+1));
    }
}

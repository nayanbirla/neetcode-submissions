class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if(cost.length==0) return 0;
 
        int dp[]=new int[cost.length];
        Arrays.fill(dp,-1);  
        int zero = minCostClimbingStairs(cost,0,dp);
        Arrays.fill(dp,-1);
        int one = minCostClimbingStairs(cost,1,dp);
        return Math.min(zero,one);
    }

    int minCostClimbingStairs(int cost[],int idx,int dp[]){

        if(idx>=cost.length){
            return 0;
        }
        if(dp[idx]!=-1) return dp[idx];
        return dp[idx]=cost[idx]+ Math.min(minCostClimbingStairs(cost,idx+1,dp),minCostClimbingStairs(cost,idx+2,dp));
    }
}

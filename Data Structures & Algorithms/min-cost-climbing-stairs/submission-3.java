class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if(cost.length==0) return 0;
 
        int dp[]=new int[cost.length+1];
        Arrays.fill(dp,-1);  
        int zero = minCostClimbingStairs(cost,-1,dp);
        return zero;
    }

    int minCostClimbingStairs(int cost[],int idx,int dp[]){

        if(idx>=cost.length){
            return 0;
        }
        if(idx>-1 && dp[idx]!=-1) return dp[idx];
        if(idx==-1) return Math.min(minCostClimbingStairs(cost,idx+1,dp),minCostClimbingStairs(cost,idx+2,dp));
        else{
        return dp[idx]=cost[idx]+Math.min(minCostClimbingStairs(cost,idx+1,dp),minCostClimbingStairs(cost,idx+2,dp));
        }
    }
}
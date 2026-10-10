class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if(cost.length==0) return 0;
 
        int dp[][]=new int[cost.length][cost.length];
        for(int d[]:dp)
        Arrays.fill(d,-1);  
        int zero = minCostClimbingStairs(cost,0,1,dp);
        
        return zero;
    }

    int minCostClimbingStairs(int cost[],int zero,int one,int dp[][]){

        if(zero>=cost.length || one>=cost.length){
            return 0;
        }
        if(dp[zero][one]!=-1) return dp[zero][one];
        return dp[zero][one]=Math.min(cost[zero]+          Math.min(minCostClimbingStairs(cost,zero+1,one,dp),
        minCostClimbingStairs(cost,zero+2,one,dp)),

    cost[one]+ Math.min(minCostClimbingStairs(cost,zero,one+1,dp),
    minCostClimbingStairs(cost,zero,one+2,dp)));
    }
}

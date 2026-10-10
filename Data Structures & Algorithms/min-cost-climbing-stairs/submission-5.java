class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int current=0,next1=0,next2=0;

        for(int i=cost.length-1;i>=0;i--){
            current = cost[i]+Math.min(next1,next2);
            next2=next1;
            next1=current;
        }
        return Math.min(next1,next2);
    }

    
}
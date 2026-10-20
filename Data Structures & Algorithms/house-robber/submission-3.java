class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length+1];
        Arrays.fill(dp,-1);
        return rob(nums,0,dp);
    }

    int rob(int nums[],int i,int dp[]){
        if(i>=nums.length) return 0;

        if(dp[i]!=-1) return dp[i];

        return dp[i]=Math.max(rob(nums,i+2,dp)+nums[i],rob(nums,i+1,dp)); 
    }
}

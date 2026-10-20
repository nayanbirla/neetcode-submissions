class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length+1];
        // Arrays.fill(dp,-1);
        // return rob(nums,0,dp);
        if(nums.length==1) return nums[0];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);

        for(int i=2;i<nums.length;i++){
            dp[i] += Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return dp[nums.length-1];
    }

    int rob(int nums[],int i,int dp[]){
        if(i>=nums.length) return 0;

        if(dp[i]!=-1) return dp[i];

        return dp[i]=Math.max(rob(nums,i+2,dp)+nums[i],rob(nums,i+1,dp)); 
    }
}

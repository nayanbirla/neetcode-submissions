class Solution {
    public int climbStairs(int n) {
        if(n==0) return 0;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);  
        return counter(n,dp);
    }

    int counter(int n,int dp[]){
        if(n==0) return 1;

        if(dp[n]!=-1) return dp[n];

        if(n>=2){
            return dp[n]=(counter(n-2,dp)+counter(n-1,dp));
        }else{
            return dp[n]=counter(n-1,dp);
        } 
    }
}

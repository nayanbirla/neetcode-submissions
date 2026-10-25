class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] abc = new int[2];
        for(int i = 0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]+nums[j]==target && i!=j){
                    abc[0]=i;
                    abc[1]=j;
                    return abc;
                }
            }
        }
        return abc;          
    }
}

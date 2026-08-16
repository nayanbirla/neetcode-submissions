class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int i=1;
        int count=1,max=0;
        while(i<nums.length){
            if(nums[i-1]+1==nums[i]){
                count++;
            }else if(nums[i-1]==nums[i]){}
            else if(nums[i-1]+1<nums[i]){
                max=Math.max(max,count);
                count=1;
            }
           
            i++;
        }
        max=Math.max(max,count);

        return max;
    }
}

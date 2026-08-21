class Solution {
    public int findMin(int[] nums) {
       int i=0,j=nums.length-1;
       if(nums[nums.length-1]>=nums[0]) return nums[0];
       while(i<=j){
        int mid = (i+j)/2;
        if(mid>0 && nums[mid]<nums[mid-1]){
            return nums[mid];
        }else if(nums[mid]>nums[nums.length-1]){
            i=mid+1;
        }else{
            j=mid-1;
        }
       }
       return -1; 
    }
}

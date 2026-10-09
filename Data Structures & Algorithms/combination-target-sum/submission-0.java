class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        combinationSum(nums,target,ans,current,0,0);

        return ans;
    }

    void combinationSum(int nums[],int target,List<List<Integer>> ans,List<Integer> current,int idx,int sum){
        
        if(idx==nums.length) return;

        if(sum>target) return;

        if(sum==target){
            ans.add(new ArrayList(current));
            return;
        }
         
        current.add(nums[idx]);
        combinationSum(nums,target,ans,current,idx,sum+nums[idx]);
        current.remove(current.size()-1);
        combinationSum(nums,target,ans,current,idx+1,sum);
    }
}

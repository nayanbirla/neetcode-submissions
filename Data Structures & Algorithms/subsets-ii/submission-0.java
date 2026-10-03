class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        List<Integer> current = new ArrayList<>();
        Arrays.sort(nums);
        unique(nums,ans,current,0);
        List<List<Integer>> ans1 = new ArrayList<>();
        for(List<Integer> a:ans){
            ans1.add(a);
        }
        return ans1;
    }

    void unique(int nums[], Set<List<Integer>> ans, List<Integer> current, int i){
        if(i>=nums.length){
            
            ans.add(new ArrayList(current));
            return;
        }
        current.add(nums[i]);
        unique(nums,ans,current,i+1);
        current.remove(current.size()-1);
        unique(nums,ans,current,i+1);
    }
}

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> current = new ArrayList<>(); 
        subsets(nums,ans,0,current);
        return ans;
    }

    
    void subsets(int nums[],List<List<Integer>> ans,int i,List<Integer> current){
        if(i==nums.length){
            ans.add(new ArrayList(current));
            return;
        }

        
        current.add(nums[i]); 
        subsets(nums,ans,i+1,current);
        current.remove(current.size()-1);
        subsets(nums,ans,i+1,current);
        
    }
}

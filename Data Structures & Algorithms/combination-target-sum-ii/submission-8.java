class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        HashSet<List<Integer>> ans=new HashSet<>();
        List<Integer> current = new ArrayList<>();
        Arrays.sort(candidates);
        combination(candidates,target,ans,current,0);
        return new ArrayList<>(ans);
    }

    void combination(int can[],int target,HashSet<List<Integer>> ans,List<Integer> curr,int idx){
        
        if(target==0){
            ans.add(new ArrayList<>(curr));
            return;
        }
      
        if(target<0) return;

        if(idx==can.length) return;
    
        curr.add(can[idx]);
        combination(can,target-can[idx],ans,curr,idx+1);
        curr.remove(curr.size()-1);
        int next=idx+1;
        while(next<can.length && can[idx]==can[next]) next++;
        combination(can,target,ans,curr,next);
      
    }
}

class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length==0) return 0;
        
        HashSet<Integer> hs=new HashSet<>();

        for(int i:nums){
            hs.add(i);
        }
        int max=0;
        for(Integer i:hs){
            int count=1;
            if(!hs.contains(i-1)){
               int cur=i;
               while(hs.contains(cur+1)){
                count++;
                cur++;
               } 
            }
            max=Math.max(max,count);
        }
        return max;

    }
        
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        List<List<Integer>> bucket = new ArrayList<>(nums.length);
        for(int i=0;i<nums.length;i++){
            bucket.add(new ArrayList());
        }

        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            bucket.get(e.getValue()-1).add(e.getKey()); 
        }

        int ans[]=new int[k]; 
        int j=0;
        for(int i=nums.length-1;i>=0;i--){
            for(Integer w:bucket.get(i)){
                ans[j++]=w;
                if(j==k) return ans;
            }
        }
        return ans;

    }
}

class Solution {

    static class Pair{
        int key;
        int value;
        Pair(int key,int value){
            this.key=key;
            this.value=value;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
       
        PriorityQueue<Pair> pq=new PriorityQueue<>((p,q)->p.value-q.value);
 
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            pq.add(new Pair(e.getKey(),e.getValue()));
            if(pq.size()>k){
                pq.poll();
            }
        }

        int ans[]=new int[k];
        int i=0;
        while(!pq.isEmpty()){
           ans[i++]=pq.poll().key;
        }

        return ans;

    }
}

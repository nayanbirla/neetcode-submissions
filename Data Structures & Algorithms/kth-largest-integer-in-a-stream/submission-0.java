class KthLargest {

    PriorityQueue<Integer> stream;

    int topK;

    public KthLargest(int k, int[] nums) {
        stream=new PriorityQueue<>();
        topK=k;
        for(int i:nums){
            add(i);
        }
      
    }
    
    public int add(int val) {
        stream.add(val);
        
        if(stream.size()>topK){
            stream.poll();
        }
        
        return stream.peek();
    }
}

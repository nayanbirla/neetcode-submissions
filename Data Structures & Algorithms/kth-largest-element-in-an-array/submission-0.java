class Solution {
    public int findKthLargest(int[] nums, int k) {
        if(nums.length<k){
            return -1;
        }
    PriorityQueue<Integer> topKEle = new PriorityQueue<>();
    for(int i:nums){
        if(topKEle.size()>=k){
            if(topKEle.peek()<i){
                topKEle.poll();
                topKEle.add(i);
            }
        }else{
                topKEle.add(i);
            }
    }
    
    return topKEle.peek();
    }
}

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int ans[]=new int[n-k+1];
        
        Deque<Integer> idx=new LinkedList<>();
        int m=0;
        for(int right=0;right<nums.length;right++){

            while(!idx.isEmpty() && nums[idx.peekLast()]<=nums[right]){
               idx.pollLast();
            }

            idx.addLast(right);

            int left= right - k+1;

            if(!idx.isEmpty() && idx.peekFirst()<left){
                idx.pollFirst();
            }

            if(right>=k-1)
            ans[m++] = nums[idx.peekFirst()]; 

        }

     return ans;
    }
}

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> nums=new ArrayList<>();
        for(int i:nums1){
            nums.add(i);
        }

        for(int i:nums2){
            nums.add(i);
        }

        Collections.sort(nums);

        if(nums.size()%2==0){
            int mid=nums.size()/2;
            double sum = nums.get(mid)+nums.get(mid-1);
            return sum/2;
        }else{
            int mid=nums.size()/2;
            return nums.get(mid);
        }
    }
}

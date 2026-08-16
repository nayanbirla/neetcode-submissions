class Solution {
    public int maxArea(int[] heights) {
        int max=0;

        int i=0,j=heights.length-1;

        while(i<j){

            int current = (Math.min(heights[i],heights[j])*(j-i));
            max=Math.max(max,current);

            if(heights[i]<heights[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}

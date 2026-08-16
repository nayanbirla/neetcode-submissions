class Solution {
    public int largestRectangleArea(int[] heights) {
        int largestArea=0;
        int n=heights.length;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i-1;j>=0;j--){
                if(heights[j]>=heights[i]){
                    count++;
                }else break;
            }
            for(int j=i+1;j<n;j++){
                if(heights[j]>=heights[i]){
                    count++;
                }else break;
            }
            largestArea = Math.max(largestArea,(count+1)*heights[i]);
        }
        return largestArea;
    }
}

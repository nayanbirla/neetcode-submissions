class Solution {
    public int trap(int[] height) {
        // by appling brute force
        int waterCount=0;
        for(int i=1;i<height.length-1;i++){
           int leftMax=height[i];
           for(int j=i-1;j>=0;j--){
              if(height[j]>leftMax){
                leftMax=height[j];
              }
           }
           int rightMax=height[i];
           for(int j=i+1;j<height.length;j++){
             if(height[j]>rightMax){
                rightMax=height[j];
             } 
           }
           int min = Math.min(leftMax,rightMax);
           waterCount+=(min-height[i]); 
        }

        return waterCount;
    }
}

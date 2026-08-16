class Solution {
    public int trap(int[] height) {
       //brute force
       int waterCount=0;
       for(int i=1;i<height.length-1;i++){
           int leftMax=height[i];
           for(int j=i-1;j>=0;j--){
              if(leftMax<height[j]){
                leftMax=height[j];
              }
           }
           int rightMax=height[i];
           for(int j=i+1;j<height.length;j++){
              if(rightMax<height[j]){
                rightMax=height[j];
              } 
           }

           int minHeight = Math.min(leftMax,rightMax);

           waterCount += (minHeight-height[i]);

       }

       return waterCount;
       
    }
}

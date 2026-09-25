class Solution {
    public int trap(int[] height) {
       //brute force
    //    int waterCount=0;
    //    for(int i=1;i<height.length-1;i++){
    //        int leftMax=height[i];
    //        for(int j=i-1;j>=0;j--){
    //           if(leftMax<height[j]){
    //             leftMax=height[j];
    //           }
    //        }
    //        int rightMax=height[i];
    //        for(int j=i+1;j<height.length;j++){
    //           if(rightMax<height[j]){
    //             rightMax=height[j];
    //           } 
    //        }

    //        int minHeight = Math.min(leftMax,rightMax);

    //        waterCount += (minHeight-height[i]);

    //    }

    //    return waterCount;
    // int n= height.length;
    // int leftMax=height[0];
    // int rightMax = height[n-1];

    // int prefix[]=new int[n];
    // int suffix[]=new int[n];
    // prefix[0]=height[0];
    // for(int i=1;i<n;i++){
    //     prefix[i] = Math.max(prefix[i-1],height[i]);
    // } 
    // suffix[n-1] = height[n-1];
    // for(int i=n-2;i>=0;i--){
    //     suffix[i] = Math.max(suffix[i+1],height[i]);
    // }

    // int water=0;
    // for(int i=0;i<n;i++){
    //     int min = Math.min(prefix[i],suffix[i])-height[i];
    //     water+=min;
    // }     
    // return water;
    int left =0 , right =height.length-1;
    int leftMax=0,rightMax=0;

    int water=0;

    while(left<right){
        if(height[left]<height[right]){
            if(height[left]>=leftMax) leftMax=height[left];
            else water += leftMax - height[left];
            left++;
        }else{
            if(height[right]>=rightMax) rightMax=height[right];
            else water += rightMax - height[right];
            right--;
        }
        
    }
    return water;
  }
}

class Solution {
    public int largestRectangleArea(int[] heights) {
        int max=0;
        Stack<Integer> ind=new Stack<>();

        for(int i=0;i<heights.length;i++){
            if(ind.isEmpty()){
                ind.push(i);
            }else{
                while(!ind.isEmpty() && heights[ind.peek()]>heights[i]){
                   int ns = ind.pop(); 
                   int last = ind.isEmpty()?-1:ind.peek();
                   max = Math.max(max, heights[ns]*(i-last-1));  
                }
                ind.push(i);
                
            }
        }
        while(!ind.isEmpty()){
            int curr=ind.pop();
            int last = ind.isEmpty()?-1:ind.peek(); 
            max = Math.max(max, heights[curr]*(heights.length-last-1)); 
        }
        return max;
    }
}

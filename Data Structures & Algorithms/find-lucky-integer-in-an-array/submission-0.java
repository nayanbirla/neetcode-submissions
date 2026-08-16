class Solution {
    public int findLucky(int[] arr) {
        int ans[]=new int[501];
        for(int i=0;i<arr.length;i++){
            ans[arr[i]]++;
        }

        for(int i=ans.length-1;i>0;i--){
            if(i==ans[i]){
                return i;
            }
        }
        return -1;
    }
}
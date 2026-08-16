class Solution {
    public int lengthOfLongestSubstring(String s) {
        int last[]=new int[128];
        Arrays.fill(last,-1);
        int left=0,right=0,max=0;
        while(right<s.length()){
            char c = s.charAt(right);

            if(last[c]>=left){
                left=last[c]+1;
                last[c]=-1;
            }

            last[c]=right;
            max=Math.max(max,right-left+1);
            right++;
        }
        return max;
    }
}

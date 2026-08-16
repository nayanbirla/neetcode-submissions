class Solution {
    public int lengthOfLongestSubstring(String s) {
        Queue<Character> que=new LinkedList<>();
        int max=0;
        for(char c:s.toCharArray()){
           if(que.contains(c)){
            max=Math.max(max,que.size());
            while(que.contains(c)){
                que.poll();
            }
            que.add(c);
           }else{
            que.add(c);
           }
        }
        max=Math.max(max,que.size());
        return max;
    }
}

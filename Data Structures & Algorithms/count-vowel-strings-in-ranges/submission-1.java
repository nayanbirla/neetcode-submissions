class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        HashSet<Character> hs=new HashSet<>();
        hs.add('a');
        hs.add('e');
        hs.add('i');
        hs.add('o');
        hs.add('u');
        int k=0;
        int ans[]=new int[queries.length]; 
        for(int[] que:queries){
            int count=0;
            for(int i=que[0];i<=que[1];i++){
                if(hs.contains(words[i].charAt(0)) && hs.contains(words[i].charAt(words[i].length()-1)) ){
                    count++;
                }
            }
            ans[k++]=count;
        }
        return ans;
    }
}
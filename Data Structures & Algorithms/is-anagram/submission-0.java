class Solution {
    public boolean isAnagram(String s, String t) {
          int ch[]=new int[256];
          for(char c:s.toCharArray()){
            ch[c]++;
          }
          for(char c:t.toCharArray()){
            ch[c]--;
          }

          for(int i=0;i<256;i++){
            if(ch[i]!=0) return false;
          }
          return true;
    }
}

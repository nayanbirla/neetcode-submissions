class Solution {
    public boolean isAnagram(String s, String t) {
         int[] arr = new int[256];
         for(char i :s.toCharArray()){
            arr[i]++;
         }
         for(char i :t.toCharArray()){
            arr[i]--;
         }
         for(int i = 0 ;i<256;i++){
            if(arr[i]!=0) return false;
         }
         return true;
    }
}

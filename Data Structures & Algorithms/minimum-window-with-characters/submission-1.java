class Solution {
    public String minWindow(String s, String t) {
        int tFreq[]=new int[128];
        for(char c:t.toCharArray()){
            tFreq[c]++;
        }
        int j=0;
        int min = Integer.MAX_VALUE,required=t.length();
         int start=0;
        for(int i=0;i<s.length();i++){

           char c= s.charAt(i);
           
           if(tFreq[c]>0){
              required--;
           }
           tFreq[c]--;
          
           while(required==0){
            if (i - j + 1 < min) {
                    min = i - j + 1;
                    start = j;
                }

            char left = s.charAt(j);
            tFreq[left]++;

            if(tFreq[left]>0){
               
                required++;
            }

            j++;

           }

        }

        return min==Integer.MAX_VALUE?"":s.substring(start,start+min);
        
    }
}

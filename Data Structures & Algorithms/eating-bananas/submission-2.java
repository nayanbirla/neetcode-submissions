class Solution {
    public int minEatingSpeed(int[] piles, int h) {
      int low=1,high=  Arrays.stream(piles).max()
                        .getAsInt();;
      int min=0;
      while(low<=high){
        int mid = ((high-low)/2)+low;

        long hours=0;
        for(int pile:piles){
            hours+= (pile+ (long)mid-1)/mid;
        }
        if(hours<=h){
            min=mid;
            high=mid-1;

        }else{
            low=mid+1;
        }
      }
      return min;
    }
}

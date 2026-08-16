class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> duplicate = new HashMap<>();

        for(int i:nums){
            duplicate.put(i,duplicate.getOrDefault(i,0)+1);
        }

        for(Map.Entry<Integer,Integer> e: duplicate.entrySet()){
            if(e.getValue()>1) return true;
        }

        return false;
    }
}
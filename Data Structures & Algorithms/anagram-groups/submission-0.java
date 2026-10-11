class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans =new ArrayList<>();

        HashMap<String,List<String>> hs=new HashMap<>();

        for(String s:strs){
            char curr[]=s.toCharArray();
            Arrays.sort(curr);
            String sortedKey = new String(curr);
            if(hs.containsKey(sortedKey)){
                List<String> current = hs.get(sortedKey);
                current.add(s);
                hs.put(sortedKey,current);
            }else{
                List<String> current = new ArrayList<>();
                current.add(s);
                hs.put(sortedKey,current); 
            }
        }

        for(Map.Entry<String,List<String>> h: hs.entrySet()){
            ans.add(h.getValue());
        }

        return ans;
    }
}

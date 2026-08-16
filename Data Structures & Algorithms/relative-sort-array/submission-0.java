class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:arr1){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }

        int ans[]=new int[arr1.length];
        int k=0; 
        for(int i:arr2){
            if(hm.containsKey(i)){
               for(int j=0;j<hm.get(i);j++){
                ans[k]=i;
                k++;
               }
               hm.remove(i); 
            }
        }

        int last=k;

        for(Map.Entry<Integer,Integer> e:hm.entrySet()){
            for(int i=0;i<e.getValue();i++){
                ans[k]=e.getKey();
                k++;
            }
        }

        Arrays.sort(ans,last,ans.length);

        return ans;


    }
}
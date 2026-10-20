class Solution {
    public List<String> letterCombinations(String digits) {
        String pre[] = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

       

        List<String> ans=new ArrayList<>();
         if(digits.isEmpty())  return ans;
        StringBuilder s=new StringBuilder(); 
        combination(pre,digits,ans,0,s);

        return ans;
    }

    void combination(String pre[],String digits,List<String> ans,int i,StringBuilder curr){
        if(i==digits.length()){
            if(curr.length()==digits.length())
            ans.add(new String(curr));
            return;
        }
        String traversal = pre[Integer.valueOf(digits.charAt(i)+"")-2];
        for(int j=0;j<traversal.length();j++){
            curr.append(traversal.charAt(j));
            combination(pre,digits,ans,i+1,curr);
            curr.deleteCharAt(curr.length() - 1);
        }


    }
}

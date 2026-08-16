class Solution {

    static class Pair{
        int i;
        int j;
        Pair(int i,int j){
            this.i=i;
            this.j=j;
        }
    }

    public int[] dailyTemperatures(int[] temp) {
        Stack<Pair> st=new Stack<>();
        int result[]=new int[temp.length];
        for(int i=temp.length-1;i>=0;i--){
            if(st.isEmpty()){
                result[i]=0;
            }else{
                while(!st.isEmpty() && st.peek().i<=temp[i]){
                    st.pop();
                }
                if(st.isEmpty())
                result[i] = 0;
                else{
                    result[i]= st.peek().j-i;
                }
            }
            st.push(new Pair(temp[i],i));
        }
        return result;
    }
}

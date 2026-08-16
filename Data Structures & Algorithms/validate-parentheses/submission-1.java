class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('){
                stack.push(c);
            }else if(c=='{'){
                stack.push(c);
            }else if(c=='['){
                stack.push(c);
            }else{
                if( !stack.isEmpty() && ((stack.peek()=='(' && c==')') || (stack.peek()=='{' && c=='}') || (stack.peek()=='[' && c==']')))
                {
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        if(stack.isEmpty()) return true;
        return false;
    }
}

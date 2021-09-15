class lc0020_valid_parentheses {
    public boolean isValid(String s) {
        if(s.length()<=0 || s.length()%2!=0) return false;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }else if(s.charAt(i)==')' && !stack.isEmpty() && stack.peek()=='('){
                stack.pop();
            }else if(s.charAt(i)=='}' && !stack.isEmpty() && stack.peek()=='{'){
                stack.pop();
            }else if(s.charAt(i)==']' && !stack.isEmpty() && stack.peek()=='['){
                stack.pop();
            }else{
                return false;
            }
        }
        return stack.isEmpty();
    }
}

//stack.peek()
//TC: O(n)
//SC: O(n)
//worst case: valid str: O(n/2)
            //invalid str: O(n)

//below code results in wrong answer, I don't know why
/*class Solution {
    public boolean isValid(String s) {
        int size = s.length();
        if(size<=0 || size%2!=0) return false;
        Stack<Character> obj = new Stack<Character>();
        if(s.charAt(0)=='}' || s.charAt(0)==')' || s.charAt(0)==']'){
            return false;
        }
        for(int i=0; i<size; i++){
            if(s.charAt(i)=='{' || s.charAt(i)=='(' || s.charAt(i)=='['){
                obj.push(s.charAt(i));
            }else{
            //if the char is not left, need to check if the stack is emtpy first
                if(obj.isEmpty()){
                    return false;
                }if(s.charAt(i)=='}' && obj.peek()=='{'){
                    obj.pop();
                }if(s.charAt(i)==')' && obj.peek()=='('){
                    obj.pop();
                }if(s.charAt(i)==']' && obj.peek()=='['){
                    obj.pop();
				}
            }
            return false;
        }
        if(obj.isEmpty()){
            return true;
        }
        return false;   
    }
}*/

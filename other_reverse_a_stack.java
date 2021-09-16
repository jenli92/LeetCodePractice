//Given a stack, reverse the items in the stack without using any additional data structures
//https://www.geeksforgeeks.org/reverse-a-stack-using-recursion/
//https://www.youtube.com/watch?v=dQsZP8UvHVk&list=WL&index=48&t=41s
import java.util.Stack;
 
class other_reverse_a_stack {
    
    static void insert_at_bottom(Stack<Integer> s, int x){
		if(s.isEmpty()){
			s.push(x);
		}else{
			int temp = s.pop();
			insert_at_bottom(s, temp);
			s.push(temp);
		}
    }
     
    static Stack<Integer> reverse(Stack<Integer> s){
		if(s.isEmpty()) return s;
		int temp = s.pop();
		insert_at_bottom(s, temp);
		reverse(s);
		return s;

    }
     
    // Driver Code
    public static void main(String[] args)
    {
        Stack<Integer> st = new Stack<>();
        // push elements into
        // the stack
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
         
        System.out.println("Original Stack");
         
        System.out.println(st);
         
        // function to reverse
        // the stack
        reverse(st);
         
        System.out.println("Reversed Stack");
         
        System.out.println(st);
    }
}

//https://www.geeksforgeeks.org/reverse-stack-without-using-extra-space/

//Leetcode 232 Implement Queue using Stacks
class MyQueue {
	
	Stack<Integer> s1;
	Stack<Integer> s2;
	
    /** Initialize your data structure here. */
    public MyQueue() {
		s1 = new Stack<>();
		s2 = new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
		s1.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
		if(!s2.isEmpty()){
			return s2.pop();
		}
		moveFromS1toS2();
		return s2.pop();
    }
    
    /** Get the front element. */
    public int peek() {
		if(!s2.isEmpty()){
			return s2.peek();
		}
		moveFromS1toS2();
		return s2.peek();
    }
    
    public void moveFromS1toS2(){
		while(!s1.isEmpty()){
			s2.push(s1.pop());
		}
	}
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
		return (s1.isEmpty() && s2.isEmpty());
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */


//stack s1是中转站，s2是结果，要先把s1挪空，再判断s2是不是空
//TC: O(n)? 
//pop()&peek() TC:Amortized O(1)，Worst-case O(n)
//other methods TC: O(1)
//SC:O(n)？
//push() TC: O(n)
//other methods TC: O(1)

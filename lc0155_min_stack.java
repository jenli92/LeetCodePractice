//LC 155 Min Stack
class MinStack {
	
	Stack<Integer> minSt;
	Stack<Integer> tempSt;

    /** initialize your data structure here. */
    public MinStack() {
		minSt = new Stack<>();
		tempSt = new Stack<>();

    }
    
    public void push(int val) {
		minSt.push(val);
		if(tempSt.isEmpty()){
			tempSt.push(val);
		}else{
			if(val>tempSt.peek()){
				tempSt.push(tempSt.peek());
			}else{
				tempSt.push(val);
			}
		}

    }
    
    public void pop() {
		minSt.pop();
		tempSt.pop();
    }
    
    public int top() {
		return minSt.peek();
    }
    
    public int getMin() {
		return tempSt.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

//TC: O(1)
//SC: O(n)?

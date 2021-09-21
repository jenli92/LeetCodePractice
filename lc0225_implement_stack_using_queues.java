//Leetcode 225 Implement Stack using Queues
class MyStack {
    private Queue<Integer> q1; 
    private Queue<Integer> q2; 
    private int temp;

    /** Initialize your data structure here. */
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        q1.add(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while(q1.size()>1){
            q2.add(q1.remove());
        }
        temp = q1.remove();
        swap();
        return temp;
    }
    
    /** Get the top element. */
    public int top() {
        while(q1.size()>1){
            q2.add(q1.remove());
        }
        temp = q1.remove();
        q2.add(temp);
        swap();
        return temp;
    }
    
    public void swap(){
        Queue<Integer> tempQ = new LinkedList<>();
        tempQ = q1;
        q1 = q2;
        q2 = tempQ;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return (q1.isEmpty() && q2.isEmpty());
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

 //TC: T(n)
 //SC: T(n)?

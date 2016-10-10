package _225;

import java.util.LinkedList;

class MyStack {
	LinkedList<Integer> list;
	public MyStack() {
		this.list = new LinkedList<>();
	}
    // Push element x onto stack.
    public void push(int x) {
        list.add(x);
    }

    // Removes the element on top of the stack.
    public void pop() {
        list.remove(list.size()-1);
    }

    // Get the top element.
    public int top() {
		return list.getLast();
        
    }

    // Return whether the stack is empty.
    public boolean empty() {
		return list.isEmpty();
    }
}
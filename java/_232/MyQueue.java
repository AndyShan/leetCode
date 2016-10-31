package _232;

import java.util.Stack;

class MyQueue {
    // Push element x to the back of queue.
    Stack<Integer> stack = new Stack<Integer> ();
    public void push(int x) {
        stack.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        stack.remove(0);
    }

    // Get the front element.
    public int peek() {
        return stack.get(0);
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack.isEmpty();
    }
}
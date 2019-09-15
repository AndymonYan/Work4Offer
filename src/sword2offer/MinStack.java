package sword2offer;

import java.util.Stack;

public class MinStack {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int node) {
        //stack1存储数据，stack2存储最小值，当这个数大于stack2栈顶才会push进去
        //这样保证stack2栈顶肯定最小
        if (stack2.isEmpty()){
            stack2.push(node);
            stack1.push(node);
        }else {
            if (stack2.peek()>node){
                stack2.push(node);
            }
            stack1.push(node);
        }
    }

    public void pop() {
        if (stack1.peek()==stack2.peek()){
            stack2.pop();
        }
        stack1.pop();
    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
        return stack2.peek();
    }
}

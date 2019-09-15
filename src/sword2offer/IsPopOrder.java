package sword2offer;

import java.util.Stack;

public class IsPopOrder {
    public boolean IsPopOrder(int[] pushA,int[] popA){
        if (pushA.length!=popA.length){
            return false;
        }

        Stack<Integer> stack = new Stack<>();
        int count = 0;
        int length = popA.length;
        for (int i = 0; i < length; i++) {
            stack.push(pushA[i]);
            while (stack.peek()==popA[count]){
                stack.pop();
                count++;
                if(count>=length)
                    break;
            }
        }
        return stack.isEmpty()?true:false;
    }
}

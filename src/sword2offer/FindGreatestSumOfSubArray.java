package sword2offer;

import java.util.Stack;

public class FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array){
        if (array.length==0)
            return 0;

        Stack<Integer> stack = new Stack<>();
        stack.push(Integer.MIN_VALUE);
        int sum = 0;
        for (int i=0;i<array.length;i++){
            sum += array[i];
            if (sum<0){
                if (sum>stack.peek()){
                    stack.push(sum);
                }
                sum = 0;
                continue;
            }else if(sum>stack.peek()){
                stack.push(sum);
            }
        }
        return stack.peek();
    }
}

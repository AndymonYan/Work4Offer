package sword2offer;

import java.util.ArrayList;
import java.util.Stack;

public class PrintZhi {
    static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        int layer = 1;

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        Stack<TreeNode> stack1 = new Stack<>();//stack1存奇数层的节点
        stack1.push(pRoot);
        Stack<TreeNode> stack2 = new Stack<>();//stack2存偶数层的节点

        while (!stack1.isEmpty()||!stack2.isEmpty()){
            if (layer%2==1){
                ArrayList<Integer> temp = new ArrayList<>();
                while (!stack1.isEmpty()){
                    TreeNode node = stack1.pop();
                    if (node!=null){
                        temp.add(node.val);
                        stack2.push(node.left);
                        stack2.push(node.right);
                    }
                }
                if (!temp.isEmpty()){
                    list.add(temp);
                    layer++;
                }
            }else {
                ArrayList<Integer> temp = new ArrayList<>();
                while (!stack2.isEmpty()){
                    TreeNode node = stack2.pop();
                    if (node!=null){
                        temp.add(node.val);
                        stack1.push(node.right);
                        stack1.push(node.left);
                    }
                }
                if (!temp.isEmpty()){
                    list.add(temp);
                    layer++;
                }
            }
        }
        return list;
    }
}

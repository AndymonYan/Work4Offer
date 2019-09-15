package sword2offer;

import java.util.Stack;

public class IsSymmetricalTree2 {
    static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    boolean isSymmetrical(TreeNode pRoot){
        if (pRoot==null)
            return true;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(pRoot.left);
        stack.push(pRoot.right);
        while (!stack.isEmpty()){
            TreeNode left = stack.pop();
            TreeNode right = stack.pop();
            if (left==null&&right==null)
                continue;
            if (left==null||right==null)
                return false;
            if (left.val!=right.val)
                return false;
            stack.push(left.right);
            stack.push(right.left);
            stack.push(left.left);
            stack.push(right.right);
        }
        return true;
    }
}

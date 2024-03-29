package sword2offer;

public class IsSymmetricalTree {
    static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null)
            return true;

        return f(pRoot.left,pRoot.right);
    }

    boolean f(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null)
            return true;

        if (t1 != null && t2 != null)
            return t1.val == t2.val && f(t1.left,t2.right) && f(t1.right, t2.left);

        return false;
    }
}

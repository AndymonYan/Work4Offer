package sword2offer;

public class HasSubtree {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean result = false;
        if (root1!=null&&root2!=null){
            if (root1.val==root2.val)
                result = process(root1,root2);
            if (!result)
                result = process(root1.left,root2);
            if (!result)
                result = process(root1.right,root2);
        }
        return result;
    }

    private boolean process(TreeNode root1,TreeNode root2){
        if (root1==null&&root2!=null)
            return false;
        if (root2==null)
            return true;
        if (root1.val!=root2.val)
            return false;

        return process(root1.left,root2.left)&&process(root1.right,root2.right);
    }
}

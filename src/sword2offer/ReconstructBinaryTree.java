package sword2offer;

public class ReconstructBinaryTree {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if (pre==null||in==null||pre.length!=in.length){
            return null;
        }else {
            return construct(pre,in,0,0,in.length-1);
        }
    }

    private TreeNode construct(int[] pre,int[] in,int preSta,int inSta,int inEnd){
        if (inSta>inEnd)
            return null;
        TreeNode root = new TreeNode(pre[preSta]);
        for (int i = inSta; i <= inEnd ; i++) {
            if (pre[preSta]==in[i]){
                root.left = construct(pre,in,preSta+1,inSta,i-1);
                root.right = construct(pre,in,preSta+i-inSta+1,i+1,inEnd);
                break;
            }
        }
        return root;
    }
}

package sword2offer;

import java.util.ArrayList;

public class FindPathInBinarryTree {
    static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    ArrayList<ArrayList<Integer>> listALl = new ArrayList<>();
    ArrayList<Integer> list = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root==null)
            return listALl;
        list.add(root.val);
        target-=root.val;
        if (target==0&&root.left==null&&root.right==null)
            listALl.add(new ArrayList<>(list));
        FindPath(root.left,target);
        FindPath(root.right, target);
        return listALl;
    }
}

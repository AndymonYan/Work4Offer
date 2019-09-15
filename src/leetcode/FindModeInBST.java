package leetcode;

import leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;

public class FindModeInBST {
    public int[] findMode(TreeNode root) {
        if (root==null) return new int[0];
        HashMap<Integer,Integer> map = new HashMap<>();
        inorder(root,map);
        ArrayList<Integer> arrayList = new ArrayList<>(map.values());
        arrayList.sort(((o1, o2) -> o2-o1));
        int max = arrayList.get(0);
        arrayList.clear();
        for (Integer key:map.keySet()) {
            if (map.get(key)==max) arrayList.add(key);
        }
        int[] keys = new int[arrayList.size()];
        for (int i = 0; i < keys.length; i++) {
            keys[i] = arrayList.get(i);
        }
        return keys;
    }

    private void inorder(TreeNode root,HashMap map){
        if (root==null) return;
        if (root.left!=null){
            inorder(root.left,map);
        }
        if (!map.containsKey(root.val)){
            map.put(root.val,1);
        }else{
            map.put(root.val,(Integer)map.get(root.val)+1);
        }
        if (root.right!=null){
            inorder(root.right,map);
        }
    }
}

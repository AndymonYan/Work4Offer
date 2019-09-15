package leetcode;

import leetcode.util.Node;
import sun.plugin.liveconnect.OriginNotAllowedException;

public class ConnectTree {
    public Node connect(Node root) {//完美二叉树
        if (root==null) return null;
        if (root.left==null){
            return null;
        }
        root.left.next = root.right;
        root.right.next = root.next != null ? root.next.left : null;
        connect(root.left);
        connect(root.right);
        return root;
    }
    public Node connect2(Node root) {
        if (root==null) return null;
        if (root.left!=null){
            if (root.right!=null){
                root.left.next = root.right;
            }else {
                root.left.next = nextNode(root.next);
            }
        }
        if (root.right!=null){
            root.right.next = nextNode(root.next);
        }
        connect(root.right);
        connect(root.left);
        return root;
    }
    private Node nextNode(Node node) {
        while (node != null) {
            if (node.left != null) {
                return node.left;
            }
            if (node.right != null) {
                return node.right;
            }
            node = node.next;
        }
        return null;
    }

}

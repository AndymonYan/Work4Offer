package sword2offer;

public class GetNext {
    static class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }

    public TreeLinkNode GetNext(TreeLinkNode pNode){
        if (pNode==null){
            return null;
        }
        if (pNode.right!=null){
            TreeLinkNode node = pNode.right;
            while (node.left!=null){
                node = node.left;
            }
            return node;
        }
        while (pNode.next!=null){
            if (pNode.next.left==pNode){
                return pNode.next;
            }
            pNode = pNode.next;
        }
        return null;
    }

}

package sword2offer;

public class ConvertToLinkedList {
    static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    static class ListNode{
        int val;
        ListNode pre;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        node4.left = node2;
        node4.right = node6;
        node2.left = node1;
        node2.right = node3;
        node6.left = node5;
        node6.right = node7;
        ListNode listNode = new ConvertToLinkedList().Convert(node4);
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    ListNode head = new ListNode(-1);
    TreeNode treeroot = null;


    public ListNode Convert(TreeNode root){
        ListNode result = new ListNode(-1);
        result.next = head;
        ConvertMethod(root);
        return result.next;
    }

    public void ConvertMethod(TreeNode proot){
        if (proot==null)
            return;
        ConvertMethod(proot.left);
        if (treeroot==null){
            head.val = proot.val;
            treeroot = proot;
        }else {
            ListNode tmp = new ListNode(proot.val);
            head.next = tmp;
            tmp.pre = head;
            head = tmp;
            ConvertMethod(proot.right);
        }
    }
}

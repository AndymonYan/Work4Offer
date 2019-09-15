package leetcode;

import leetcode.util.ListNode;

public class ReverseList {


    public ListNode reverseList(ListNode head) {
        if (head==null||head.next==null)
            return head;
        ListNode tmp = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return tmp;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        ReverseList r = new ReverseList();
        ListNode n = r.reverseList(n1);
        while (n!=null){
            System.out.println(n.val);
            n = n.next;
        }
    }
}

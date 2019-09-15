package leetcode;

import leetcode.util.ListNode;

public class SwapPairs {
    public ListNode swapPairs(ListNode head){
        if (head==null||head.next==null){
            return head;
        }

        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }
}

package sword2offer;

public class FindKthToTail {
    static class ListNode{
        int val;
        ListNode next = null;

        public ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode p,q;
        p = q = head;
        int count = 0;
        while (p!=null){
            if (count>=k)
                q = q.next;
            p = p.next;
            count++;
        }
        return count<k?null:q;
    }

}

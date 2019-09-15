package sword2offer;

public class DeleteDuplication {
    static class ListNode{
        int val;
        ListNode pre;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode deleteDuplication(ListNode pHead)
    {
        if (pHead==null||pHead.next==null)
            return pHead;

        ListNode first = new ListNode(-1);//设置一个trick

        first.next = pHead;

        ListNode start = pHead;
        ListNode last = first;//保证last指针一直在start前一个

        while (start!=null&&start.next!=null){
            if (start.val==start.next.val){
                int val = start.val;
                while (start!=null&&start.val==val){
                    start = start.next;
                }
                last.next = start;
            }else {
                last = start;
                start = start.next;
            }
        }
        return  first.next;
    }
}

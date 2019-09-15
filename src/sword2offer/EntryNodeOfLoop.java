package sword2offer;

public class EntryNodeOfLoop {
    static class ListNode{
        int val;
        ListNode pre;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ListNode meetnode = null;
        if (pHead==null||pHead.next==null||pHead.next.next==null)
            return meetnode;
        ListNode fast = pHead,slow = pHead;
        while (fast!=null){
            fast = fast.next.next;
            slow = slow.next;
            if (slow==fast){
                meetnode = slow;
                break;
            }
        }
        //此时快慢指针相遇了
        ListNode tmp = meetnode;
        int circleLen = 0;
        while (tmp!=null){
            tmp = tmp.next;
            circleLen++;
            if (tmp==meetnode){
                break;
            }
        }
        //circleLen为环的长度
        ListNode a = pHead,b = pHead;
        while (circleLen!=0){
            b = b.next;
            circleLen--;
        }
        while (a!=b){
            a = a.next;
            b = b.next;
        }
        return b;
    }
}

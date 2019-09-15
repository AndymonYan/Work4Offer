package sword2offer;

import java.util.ArrayList;

public class ReverseList {
    static class ListNode{
        int val;
        ListNode next = null;

        public ListNode(int val) {
            this.val = val;
        }
    }
    //通过递归从尾到头打印链表
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (listNode==null){
            return arrayList;
        }
        process(listNode,arrayList);
        return arrayList;
    }

    private static void process(ListNode head,ArrayList list){
        if (head.next!=null){
            process(head.next,list);
        }
        list.add(head.val);
    }
}

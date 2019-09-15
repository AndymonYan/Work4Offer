package leetcode;

import leetcode.util.ListNode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length==0) return null;

        ListNode head = new ListNode(-1);
        ListNode node = head;

        PriorityQueue<ListNode> minHeap = new PriorityQueue<>(new Comparator<ListNode>() {
            public int compare(ListNode o1, ListNode o2) {
                return o1.val-o2.val;
            }
        });

        for (ListNode list: lists) {
            if (list!=null){
                minHeap.add(list);
            }
        }
        while (!minHeap.isEmpty()){
            ListNode nextnode = minHeap.poll();
            node.next = nextnode;
            node = node.next;
            if (nextnode.next!=null){
                minHeap.add(nextnode.next);
            }
        }

        return head.next;
    }
}

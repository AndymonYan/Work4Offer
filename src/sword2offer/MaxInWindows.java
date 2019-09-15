package sword2offer;

import java.util.*;

public class MaxInWindows {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int length = num.length;
        if (size>length||size==0){
            return list;
        }
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(size,(o1,o2)->o2-o1);
        for (int i = 0; i < length; i++) {
            if (i<size){
                maxheap.offer(num[i]);
            }else {
                list.add(maxheap.peek());
                maxheap.remove(num[i-size]);
                maxheap.offer(num[i]);
            }
        }
        list.add(maxheap.peek());
        return list;
    }


}

package sword2offer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class GetLeastNumbers {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (input==null||k>input.length||k==0){
            return arrayList;
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k,new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (int i = 0; i < input.length; i++) {
            if (maxHeap.size() != k) {
                maxHeap.offer(input[i]);
            } else if (maxHeap.peek() > input[i]) {
                Integer temp = maxHeap.poll();
                temp = null;
                maxHeap.offer(input[i]);
            }
        }
        for (int num:
             maxHeap) {
            arrayList.add(num);
        }
        return arrayList;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,2,6,11,3,9,3};
        ArrayList<Integer> arrayList = new GetLeastNumbers().GetLeastNumbers_Solution(nums,5);
        arrayList.stream().forEach(System.out::print);
    }
}

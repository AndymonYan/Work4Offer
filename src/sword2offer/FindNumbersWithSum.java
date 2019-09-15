package sword2offer;

import java.util.ArrayList;

public class FindNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        int start = 0;
        int end = array.length-1;
        int result = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (start<end){
            result = array[start]+array[end];
            if (result<sum){
                start++;
            }else if (result>sum){
                end--;
            }else {
                arrayList.add(array[start]);
                arrayList.add(array[end]);
                break;
            }
        }
        return arrayList;
    }
}
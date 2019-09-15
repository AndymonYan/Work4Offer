package sword2offer;

import java.util.Arrays;

public class MoreThanHalfNum {
    public int MoreThanHalfNum_Solution(int [] array) {
        if (array==null)
            return 0;
        Arrays.sort(array);
        int length = array.length;
        int mid = length>>1;
        int count = 0;
        for (int i=0;i<length;i++){
            if (array[mid]==array[i]){
                count++;
            }
        }
        return (count<<1)<=length?0:array[mid];
    }
}

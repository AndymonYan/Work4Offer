package leetcode;

import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums,int target){
        Arrays.sort(nums);
        int length = nums.length;
        if (length<3)
            return 0;
        int smallest = nums[0]+nums[1]+nums[2];
        for (int i = 0; i < length-2; i++) {
            int j = i+1,k = length-1;
            while (j<k){
                int tmp = nums[i]+nums[j]+nums[k];
                if (Math.abs(tmp-target)<Math.abs(smallest-target)){
                    smallest = tmp;
                }
                if (tmp>target){
                    k--;
                }else if (tmp<target){
                    j++;
                }else {
                    return target;
                }
            }
        }
        return smallest;
    }
}

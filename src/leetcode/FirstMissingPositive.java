package leetcode;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums){
        if (nums.length<1) return 1;
        int length = nums.length;
        int index = 0,tmp = 0;
        while (index<length){
            if (nums[index]>0&&nums[index]<=length&&nums[index]!=index+1&&nums[nums[index]-1]!=nums[index]){
                tmp = nums[index];
                nums[index] = nums[tmp-1];
                nums[tmp-1] = tmp;
            }else {
                index++;
            }
        }

        for (int i = 0; i < length; i++) {
            if (nums[i]!=i+1){
                return i+1;
            }
        }
        return length+1;
    }
}

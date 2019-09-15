package leetcode;

public class SearchRange {

    public static void main(String[] args) {
        SearchRange sr = new SearchRange();
        int[] target = sr.searchRange(new int[]{2},2);
        System.out.println(target[0]+" "+target[1]);
    }
    public int[] searchRange(int[] nums, int target) {
        int[] targetRange = new int[]{-1,-1};
        if (nums.length<=0) return targetRange;
        int left = 0,right = nums.length-1,mid = 0;
        while (left<=right){
            mid = (left+right)>>1;
            if (nums[mid]<target){
                left = mid+1;
            }else if (nums[mid]>target){
                right = mid-1;
            }else {
                while (mid-1>=0&&nums[mid-1]==nums[mid]){
                    mid--;
                }
                targetRange[0] = mid;
                while (mid+1<nums.length&&nums[mid+1]==nums[mid]){
                    mid++;
                }
                targetRange[1] = mid;
                break;
            }
        }
        return targetRange;
    }
}

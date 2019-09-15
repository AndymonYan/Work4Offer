package leetcode;

public class MaxArea {
    public int maxArea(int[] height) {
        if (height.length==0)
            return 0;
        int maxArea = 0,l = 0,r = height.length-1;
        while (l<r){
            maxArea = Math.max(maxArea,(r-l)*(Math.min(height[l],height[r])));
            if (height[l]<height[r]){
                l++;
            }else {
                r--;
            }
        }
        return maxArea;
    }
}

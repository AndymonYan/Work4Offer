package sword2offer;

public class Sum_Solution {
    public int Sum_Solution(int n) {
        int num = n;
        boolean ans = (n>0) && ((num+=Sum_Solution(n-1))>0);
        return num;
    }
}

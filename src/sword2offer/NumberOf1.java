package sword2offer;

public class NumberOf1 {
    public int numOf1(int n){
        int count = 0;
        while (n!=0){
            n = n&(n-1);
            count++;
        }
        return count;
    }
}

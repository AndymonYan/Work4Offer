package sword2offer;

public class Fibonacci {
    public int fibonacci(int n){
        if (n==0||n==1){
            return n;
        }
        int l1=1,l2=0,res=0;
        int N = 2;
        while (N++<n){
            res = l1+l2;
            l2 = l1;
            l1 = res;
        }
        return res;
    }
}

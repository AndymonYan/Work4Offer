package sword2offer;

public class Power {
    public double Power(double base, int exponent) {
        int n=Math.abs(exponent);
        if(n==0)
            return 1;
        if(n==1)
            return base;
        double  result=Power(base,n>>1);
        result*=result;
        if((n%2)==1)
            result*=base;
        if(exponent<0)
            result=1/result;
        return result;
    }
}

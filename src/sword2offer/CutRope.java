package sword2offer;

public class CutRope {
    public int cutRope(int target) {
        int numOf2 = 0;
        int numOf3 = 0;

        if (target<=1)
            return 0;
        if (target==2||target==3)
            return target-1;

        if (target==4)
            return target;
        numOf3 = target/3;

        if ((target-numOf3*3)==1){
            numOf3--;
            numOf2+=2;
        }else if ((target-numOf3*3)==2){
            numOf2++;
        }

        if (numOf2==0){
            return (int) Math.pow(3,numOf3);
        }else {
            return (int)Math.pow(3,numOf3)*(int)Math.pow(2,numOf2);
        }

    }
}

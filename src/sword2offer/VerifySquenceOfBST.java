package sword2offer;

public class VerifySquenceOfBST {
    public static boolean VerifySquenceOfBST(int[] sequence){
        if (sequence==null||sequence.length==0){
            return false;
        }
        return verify(sequence,0,sequence.length);
    }

    private static boolean verify(int[] sequence,int start,int end){
        if (end<=start){
            return true;
        }
        int root = sequence[end];
        int i = start;
        while (i<end){
            if (sequence[i]>root)
                break;
            i++;
        }

        int j = i;
        while (j<end){
            if (sequence[j]<root)
                return false;
            j++;
        }
        return verify(sequence,start,j-1)&&verify(sequence, j, end-1);
    }
}

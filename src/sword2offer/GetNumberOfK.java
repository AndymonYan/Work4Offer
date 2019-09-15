package sword2offer;

public class GetNumberOfK {
    public int GetNumberOfK(int [] array , int k) {
        if (array==null||k>array[array.length-1]||k<array[0]){
            return 0;
        }
        int firstK = getFirstK(array,k,0,array.length-1);
        int lastK = getLastK(array,k,0,array.length-1);
        if (firstK==-1||lastK==-1)
            return 0;
        else
            return lastK-firstK+1;
    }

    private int getFirstK(int[] array,int k,int start,int end){
        if (start>end)
            return -1;
        int mid = start+((start+end)>>1);
        if (array[mid]>k){
            return getFirstK(array,k,start,mid-1);
        }else if (array[mid]<k){
            return getFirstK(array,k,mid+1,end);
        }else if (mid-1>=start&&array[mid-1]==k){
            return getFirstK(array,k,start,mid-1);
        }else {
            return mid;
        }
    }

    private int getLastK(int[] array,int k,int start,int end){
        if (start>end)
            return -1;
        int mid = (start+end)>>1;
        if (array[mid]>k)
            return getLastK(array,k,start,mid-1);
        else if (array[mid]<k)
            return getLastK(array,k,mid+1,end);
        else if (mid+1<array.length&&array[mid+1]==k)
            return getLastK(array,k,mid+1,end);
        else
            return mid;
    }
}

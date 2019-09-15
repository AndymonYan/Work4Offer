package sword2offer;

public class FindNumInArray {
    public boolean Find(int target,int[][] array){
        if (array==null||array.length==0){
            return false;
        }

        int m = array.length;//行数
        int n = array[0].length;//列数

        //由于数组是从上到下，从左到右递增的，所以应该从右上方遍历
        int r = 0;
        int c = n-1;
        while (r<m&&c>=0){
            if (target==array[r][c]){
                return true;
            }else if (target>array[r][c]){
                r++;
            }else {
                c--;
            }
        }
        return false;
    }
}

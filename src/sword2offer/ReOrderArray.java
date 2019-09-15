package sword2offer;

public class ReOrderArray {
    public void reOrderArray(int[] array){
        int m = array.length;
        int k = 0;//记录奇数的位置
        for (int i = 0; i < m; i++) {
            if (array[i]%2==1){
                int j = i;
                while (j>k){
                    int tmp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tmp;
                    j--;
                }
                k++;
            }
        }
    }
}

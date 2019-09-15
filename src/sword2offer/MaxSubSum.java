package sword2offer;

public class MaxSubSum {


    public int getMaxSub(int[] array){
        int max = 0;
        int tmp = 0;
        for (int i = 0; i < array.length; i++) {
            tmp += array[i];

            if (tmp>max){
                max = tmp;
            }

            if (tmp<0){
                tmp = 0;
            }
        }
        return max;
    }

    public int getMaxSub2(int[] array){
        int max = 0;
        int tmp = 0;
        int begin = 0;

        for (int i = 0; i < array.length; i++) {
            if (tmp>0){
                tmp+=array[i];
            }else {
                tmp = array[i];
                begin = i;
            }

            if (tmp>max){
                max = tmp;
            }
        }
        return max;
    }
}

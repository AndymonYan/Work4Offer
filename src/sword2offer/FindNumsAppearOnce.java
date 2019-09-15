package sword2offer;

public class FindNumsAppearOnce {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            num ^= array[i];//num为那两个数异或的结果
        }

        int count = 0;
        for (; count < array.length; count++) {
            if ((num&(1<<count))!=0){//count记录num第一个1出现的位置
                break;
            }
        }

        int num_1 = 0;
        int num_2 = 0;

        for (int i = 0; i < array.length; i++) {
            if ((array[i]&(1<<count))==0){
                num_1 ^= array[i];
            }else {
                num_2 ^= array[i];
            }
        }

        num1[0] = num_1;
        num2[0] = num_2;
    }
}

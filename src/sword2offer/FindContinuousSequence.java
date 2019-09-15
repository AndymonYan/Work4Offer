package sword2offer;

import java.util.ArrayList;

public class FindContinuousSequence {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int plow = 1,phigh = 2;
        while (phigh>plow){
            //由于是连续的，差为1的一个序列，那么求和公式是(a0+an)*n/2
            int cur = (phigh+plow)*(phigh-plow+1)/2;
            if (cur==sum){
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = plow; i <= phigh; i++) {
                    list.add(i);
                }
                result.add(list);
                plow++;
            }else if (cur<sum){
                phigh++;
            }else {
                plow++;
            }
        }
        return result;
    }
}

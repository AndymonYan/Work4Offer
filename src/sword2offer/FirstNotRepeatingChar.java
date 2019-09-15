package sword2offer;

import java.util.HashMap;
import java.util.Map;

public class FirstNotRepeatingChar {
    public int FirstNotRepeatingChar(String str){
        if (str==""||str.length()==0)
            return -1;
        String[] strings = str.split("");
        Map<String,Integer> timeMap = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (timeMap.containsKey(strings[i])){
                int val = timeMap.get(strings[i]);
                timeMap.put(strings[i],++val);
            }else {
                timeMap.put(strings[i],1);
            }
        }
        for (int i = 0; i < strings.length; i++) {
            if (timeMap.get(strings[i])==1){
                return i;
            }
        }
        return -1;
    }
}

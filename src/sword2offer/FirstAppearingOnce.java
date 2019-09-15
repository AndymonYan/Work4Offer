package sword2offer;

import java.util.ArrayList;
import java.util.HashMap;

public class FirstAppearingOnce {
    //Insert one char from stringstream
    HashMap<Character,Integer> hashMap = new HashMap<>();
    ArrayList<Character> arrayList = new ArrayList<>();
    public void Insert(char ch)
    {
        if (hashMap.containsKey(ch)){
            hashMap.put(ch,hashMap.get(ch)+1);
        }else {
            hashMap.put(ch,1);
        }
        arrayList.add(ch);
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        char c = '#';
        for (char key:arrayList){
            if (hashMap.get(key)==1){
                c = key;
                break;
            }
        }
        return c;
    }
}

package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindSubstring {
    public static void main(String[] args) {
        FindSubstring f = new FindSubstring();
        String s = "wordgoodgoodgoodbestword";
        String[] words = new String[]{"word","good","best","good"};
        List<Integer> list = f.findSubstring(s,words);
        list.stream().forEach(System.out::println);
    }
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> list = new ArrayList<>();
        if (s.equals("")||words.length<=0) return list;
        HashMap<String,Integer> map = new HashMap<>();
        for (String str: words) {
            map.put(str,map.getOrDefault(str,0)+1);
        }
        int wordLen = words[0].length();
        int wordNum = words.length;
        int len = wordLen*wordNum;

        for (int i = 0; i <= s.length()-len; i++) {
            HashMap tmpMap = new HashMap(map);
            if (isMatch(s.substring(i,i+len),tmpMap,wordLen)) list.add(i);
        }
        return list;
    }

    private boolean isMatch(String s,HashMap<String,Integer> map,int wordLen){
        for (int i = 0; i < s.length(); i=i+wordLen) {
            String tmp = s.substring(i,i+wordLen);
            if (map.containsKey(tmp)){
                if (map.get(tmp)<0){
                    return false;
                }
                map.put(tmp,map.get(tmp)-1);
            }
        }
        for(Integer value:map.values()){
            if (value!=0) return false;
        }
        return true;
    }
}

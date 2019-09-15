package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {
    public List<String> letterCombinations(String digits) {
        int length = digits.length();
        List<String> list = new ArrayList<>();
        if (length<=0)
            return list;
        String[] strings = new String[length];
        for (int i = 0; i < length; i++) {
            switch (digits.charAt(i)){
                case '2':strings[i]="abc";break;
                case '3':strings[i]="def";break;
                case '4':strings[i]="ghi";break;
                case '5':strings[i]="jkl";break;
                case '6':strings[i]="mno";break;
                case '7':strings[i]="pqrs";break;
                case '8':strings[i]="tuv";break;
                case '9':strings[i]="wxyz";break;
            }
        }
        String tmp = "";
        process(strings,0,tmp,list);
        return list;
    }

    private void process(String[] strings,int i,String tmp,List<String> list){
        if (i==strings.length-1){
            for (int j = 0; j < strings[i].length(); j++) {
                list.add(tmp+strings[i].charAt(j));
            }
        }else {
            for (int j = 0; j < strings[i].length(); j++) {
                process(strings,i+1,tmp+strings[i].charAt(j),list);
            }
        }
    }
}

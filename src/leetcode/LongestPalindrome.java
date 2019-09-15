package leetcode;

public class LongestPalindrome {
    public String longestPalindrome(String s){
        if (s==null||s.length()==0)
            return "";
        int start = 0,end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = process(s,i,i);
            int len2 = process(s,i,i+1);
            int len = Math.max(len1,len2);
            if (len>end-start){
                start = i-(len-1)/2;
                end = i+len/2;
            }
        }
        return s.substring(start,end);
    }

    private int process(String s,int left,int right){
        int L = left,R = right;
        while (L>=0&&R<s.length()&&s.charAt(L)==s.charAt(R)){
            L--;
            R++;
        }
        return R-L-1;
    }
}

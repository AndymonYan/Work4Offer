package sword2offer;

public class ReverseSentence {
    public static void main(String[] args) {
        ReverseSentence sentence = new ReverseSentence();
        System.out.println(sentence.ReverseSentence("i am bone of my sword"));
    }
    public String ReverseSentence(String str) {
        if (str.length()==0){
            return "";
        }
        if (str.split(" ").length==1)
            return str;
        char[] strs = str.toCharArray();

        reverse(strs,0,strs.length-1);
        int start = 0;
        int end = 0;
        int i = 0;
        while (i<strs.length){
            while (i<strs.length&&strs[i]==' '){
                i++;
            }
            end = start = i;
            while (i<strs.length&&strs[i]!=' '){
                end++;
                i++;
            }
            reverse(strs,start,end-1);
        }
        return new String(strs);
    }

    private void reverse(char[] chars,int i,int j){
        char tmp;
        while (i<j){
            tmp = chars[i];
            chars[i++] = chars[j];
            chars[j--] = tmp;
        }
    }
}
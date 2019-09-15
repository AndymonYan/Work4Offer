package sword2offer;

public class LeftRotateString {
    public String LeftRotateString(String str,int n) {
        int length = str.length();
        if (length==0){
            return "";
        }
        n%=length;
        char[] chars = str.toCharArray();
        //原理：YX = (XT YT)T
        reverse(chars,0,n-1);
        reverse(chars,n,length-1);
        reverse(chars,0,length-1);
        return new String(chars);
    }

    private void reverse(char[] arrays,int i,int j){
        char tmp;
        while (i<j){
            tmp = arrays[i];
            arrays[i++] = arrays[j];
            arrays[j--] = tmp;
        }
    }
}

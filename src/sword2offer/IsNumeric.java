package sword2offer;

public class IsNumeric {
    private int index = 0;
    public boolean isNumeric(char[] str){
        if (str==null)
            return false;
        boolean flag = scanInteger(str);

        if (index<str.length&&str[index]=='.'){
            index++;
            flag = flag||scanUnsignedInteger(str);
        }

        if (index<str.length&&(str[index]=='E'||str[index]=='e')){
            flag = flag&&scanInteger(str);
        }

        return flag&&index==str.length;
    }

    private boolean scanInteger(char[] str){
        if (index<str.length&&(str[index]=='+'||str[index]=='-'))
            index++;
        return scanUnsignedInteger(str);
    }

    private boolean scanUnsignedInteger(char[] str){
        int start = index;
        while (index<str.length&&str[index]>='0'&&str[index]<='9')
            index++;
        return start<index;//是否存在整数
    }
}

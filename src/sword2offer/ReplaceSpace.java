package sword2offer;

public class ReplaceSpace {
    public String replaceSpace(StringBuffer str){
        int length = str.length()-1;
        for (int i = 0; i <= length ; i++) {
            if (str.charAt('i')==' '){
                str.append("  ");
            }
        }

        int lengthNew = str.length()-1;
        while (length>=0&&lengthNew>=length){
            char c = str.charAt(length--);
            if (c==' '){
                str.setCharAt(lengthNew--,'0');
                str.setCharAt(lengthNew--,'2');
                str.setCharAt(lengthNew--,'%');
            }else {
                str.setCharAt(lengthNew--,c);
            }
        }
        return str.toString();
    }
}

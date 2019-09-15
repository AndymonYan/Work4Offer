package leetcode;

public class IntToRoman {
    public String intToRoman(int num) {
        int[] nums = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] rome = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 13; i++) {
            while (num>=nums[i]){
                num -= nums[i];
                sb.append(rome[i]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        IntToRoman intToRoman = new IntToRoman();
        System.out.println(intToRoman.intToRoman(3));
    }
}

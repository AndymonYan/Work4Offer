package sword2offer;

import java.util.ArrayList;
import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        Permutation p = new Permutation();
//        p.permutate("abc");
//        System.out.println(p.Permutation("abc"));
        ArrayList<String> arrayList = p.Permutation("abc");
        for (String a:
             arrayList) {
            System.out.println(a);
        }
    }

    public ArrayList<String> Permutation(String str) {
        if (str==null||str.length()==0)
            return list;
        permutate(str);
        return list;
    }
    private char[] data;
    private int length;
    private ArrayList<String> list = new ArrayList<>();

    public void permutate(String input) {
        // change the data type to we needed
        changeToData(input);
        // sort the data from small to big
        Arrays.sort(data);
        // output all the order
        list.add(new String(data));
        while (nextPermutate()) {
            list.add(new String(data));
        }
    }


    private void changeToData(String input) {
        if (input == null)
            return;
        data = input.toCharArray();
        length = data.length;
    }

    private boolean nextPermutate() {
        int end = length - 1;
        int swapPoint1 = end, swapPoint2 = end;
        // the actual swap-point is swapPoint1 - 1
        while (swapPoint1 > 0 && data[swapPoint1] <= data[swapPoint1 - 1])
            swapPoint1--;
        if (swapPoint1 == 0)
            return false;
        else {
            while (swapPoint2 > 0 && data[swapPoint2] <= data[swapPoint1 - 1])
                swapPoint2--;
            swap(data, swapPoint1 - 1, swapPoint2);
            reverse(data, swapPoint1, end);
            return true;
        }
    }

    private void swap(char[] data, int left, int right) {
        char temp = data[left];
        data[left] = data[right];
        data[right] = temp;
    }

    private void reverse(char[] data, int left, int right) {
        for (int i = left, j = right; i < j; i++, j--)
            swap(data, i, j);
    }


}

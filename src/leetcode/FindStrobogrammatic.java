package leetcode;


import java.util.*;

public class FindStrobogrammatic {
    public static void main(String[] args) {
        List<String> list = new FindStrobogrammatic().findStrobogrammatic(5);
        for (String s:
             list) {
            System.out.println(s);
        }
    }
    public List<String> findStrobogrammatic(int n) {
        if (n==1){
            return Arrays.asList(new String[]{"0","1","8"});
        }
        HashMap<Integer,List<String>> map = new HashMap<>();
        List<String> strings = find(n,map);
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()){
            if (iterator.next().startsWith("0")){
                iterator.remove();
            }
        }
        return strings;
    }

    public List<String> find(int n,HashMap map) {
        if (map.containsKey(n)){
            return (List<String>) map.get(n);
        }
        if (n==1){
            List<String> list = new ArrayList<>();
            list.add("0");
            list.add("1");
            list.add("8");
            map.put(1,list);
            return list;
        }
        if (n==2){
            List<String> list = new ArrayList<>();
            list.add("00");
            list.add("11");
            list.add("69");
            list.add("88");
            list.add("96");
            map.put(2,list);
            return list;
        }
        List<String> list1 = find(2,map);
        List<String> list2 = find(n-2,map);
        List<String> result = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                result.add(list1.get(i).charAt(0)+list2.get(j)+list1.get(i).charAt(1));
            }
        }
        return result;
    }
}

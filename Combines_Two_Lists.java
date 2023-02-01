package Assignment1;

import java.util.ArrayList;
import java.util.List;

public class Combines_Two_Lists {
    public static List<String> combine(List<String> s1,List<String> s2){
        if (s1==null){
            return s2;
        }
        if (s2==null){
            return s1;
        }
        List<String> list = new ArrayList<String>();
        for (int i = 0, j = 0;i < s1.size()&&j<s2.size();i++,j++){
            list.add(s1.get(i));
            list.add(s2.get(j));

        }
        return list;
    }
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();


        list1.add("a");
        list1.add("b");
        list1.add("c");
        List<String> list2 = new ArrayList<String>();


        list2.add("1");
        list2.add("2");
        list2.add("3");
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(combine(list1,list2));


    }
}

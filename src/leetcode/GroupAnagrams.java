package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> stringListList = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str:strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedString  = new String(charArray);

            if(!map.containsKey(sortedString)){
                List<String> stringList = new ArrayList<>();
                stringList.add(str);
                map.put(sortedString,stringList);
            } else {
                List<String> stringList = map.get(sortedString);
                stringList.add(str);
                map.put(sortedString,stringList);
            }
        }

        for(String string: map.keySet()){
            stringListList.add(map.get(string));
        }

        return stringListList;
    }

    public static void main(String[] args) {
        String[] strinArray = new String[]{"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strinArray));

        strinArray = new String[]{""};
        System.out.println(groupAnagrams(strinArray));

        strinArray = new String[]{"a"};
        System.out.println(groupAnagrams(strinArray));
    }
}

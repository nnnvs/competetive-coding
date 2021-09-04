package leetcode;

import java.util.HashMap;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int sSum = 0;
        for(int i=0;i<s.length();i++){
            if(!map.containsKey((int) s.charAt(i))){
                map.put((int) s.charAt(i), 1);
            } else {
                int val = map.get((int) s.charAt(i)) + 1;
                map.put((int) s.charAt(i), val);
            }
        }

        for(int i=0;i<t.length();i++){
            if(!map.containsKey((int) t.charAt(i))){
                return false;
            } else if (map.get((int) t.charAt(i))==1) {
                map.remove((int) t.charAt(i));
            } else {
                int val = map.get((int) t.charAt(i)) - 1;
                map.put ((int) t.charAt(i), val);
            }
        }

        if(map.isEmpty()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
        System.out.println(isAnagram("rat","car"));
    }
}

package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MinimumWindowSubstring {

    public static class MinimumWindowSubstringMap<K,V> extends HashMap<K,V>{

        @Override
        public boolean equals(Object o) {
            if (o == this)
                return true;

            if (!(o instanceof Map))
                return false;
            Map<?,?> m = (Map<?,?>) o;
            if (m.size() != size())
                return false;

            try {
                for (Entry<K, V> e : entrySet()) {
                    K key = e.getKey();
                    V value = e.getValue();
                    if (value == null) {
                        if (!(m.get(key) == null && m.containsKey(key)))
                            return false;
                    } else {
                        if (((int) m.get(key)) > ((int) value))
                            return false;
                    }
                }
            } catch (ClassCastException unused) {
                return false;
            } catch (NullPointerException unused) {
                return false;
            }

            return true;
        }
    }

    public static String minWindow(String s, String t) {

        if (s.length() == 0 || t.length() == 0) {
            return "";
        }

        int n = s.length();
        int minLength = Integer.MAX_VALUE;
        String minString = "";
        int l=0;
        int r=0;

        MinimumWindowSubstringMap<Character,Integer> reset = new MinimumWindowSubstringMap<>();
        for(int i=0;i<t.length();i++){
            reset.put(t.charAt(i),reset.getOrDefault(t.charAt(i),0)+1);
        }

        MinimumWindowSubstringMap<Character,Integer> temp = new MinimumWindowSubstringMap<>();
        while(l<=r && l<n && r<=n){

            if(temp.keySet().equals(reset.keySet())){
                if(minLength>r+1-l){
                    minString = s.substring(l,r);
                    minLength = minString.length();
                }
                int val = temp.getOrDefault(s.charAt(l),1)-1;
                if(val==0){
                    temp.remove(s.charAt(l));
                } else {
                    temp.put(s.charAt(l), val);
                }
                l++;

            } else if(r<n){
                if (reset.containsKey(s.charAt(r))) {
                    int val = temp.getOrDefault(s.charAt(r),0)+1;
                    temp.put(s.charAt(r),val);
                }
                r++;
            } else {
                break;
            }
        }

        return minString;
    }

    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC","ABC"));
        System.out.println(minWindow("a","a"));
        System.out.println(minWindow("a","aa"));
    }
}

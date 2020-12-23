package leetcode;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

    // O(N*N) solution
    public static int lengthOfLongestSubstringSlow(String s) {
        int maxCount = 0;
        for(int i=0; i<s.length(); i++){
            HashSet<Character> hashSet = new HashSet();
            char c1 =  s.charAt(i);
            hashSet.add(c1);
            int count = 1;
            for(int j=i+1;j<s.length();j++){
                char c2 =  s.charAt(j);
                if(!hashSet.contains(c2)){
                    hashSet.add(c2);
                    count++;
                } else {
                    break;
                }
            }
            if(count > maxCount){
                maxCount = count;
            }
        }
        return maxCount;
    }

    public static int lengthOfLongestSubstring(String s) {
        int maxCount = 0, i=0, j=0;
        HashSet<Character> hashSet = new HashSet();
        while (i < s.length() && j < s.length()){
            if(!hashSet.contains(s.charAt(j))){
                hashSet.add(s.charAt(j++));
                maxCount = Math.max(maxCount,j-i);
            } else {
                hashSet.remove(s.charAt(i++));
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring("abcabcde"));
    }
}

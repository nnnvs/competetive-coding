package leetcode;

public class RegularExpressionMatching {
    public static boolean isMatch(String text, String pattern) {

        if (pattern.isEmpty()) return text.isEmpty();
        boolean first_match = (!text.isEmpty() &&
                (pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.'));

        if (pattern.length() >= 2 && pattern.charAt(1) == '*'){
            return (isMatch(text, pattern.substring(2)) ||
                    (first_match && isMatch(text.substring(1), pattern)));
        } else {
            return first_match && isMatch(text.substring(1), pattern.substring(1));
        }
    }

    public static void main(String[] args) {
//        System.out.println(isMatch("abcdefgh",".*"));
//        System.out.println(isMatch("abcdefgh","abc.*"));
//        System.out.println(isMatch("abcdefgh","adsfbc.*"));
//        System.out.println(isMatch("abcdefgh","abc.*h"));
//        System.out.println(isMatch("aa","a"));
//        System.out.println(isMatch("aa","a*"));
//        System.out.println(isMatch("aab","c*a*b"));
//        System.out.println(isMatch("mississippi","mis*is*p*."));
        System.out.println(isMatch("aaa","a*a"));
    }
}

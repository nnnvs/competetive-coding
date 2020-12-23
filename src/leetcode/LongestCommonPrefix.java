package leetcode;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        String result = "";
        Boolean flag = false;
        if(strs.length>0) {
            for (int i = 0; i < strs[0].length(); i++) {
                char c = strs[0].charAt(i);
                for (int j = 1; j < strs.length; j++) {
                    if (strs[j].length() >= i + 1) {
                        char c2 = strs[j].charAt(i);
                        if (c2 != c) {
                            flag = true;
                            break;
                        }
                    } else {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    result = result + c;
                } else {
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] data = new String[0];
//        String[] data = new String[]{"dog","racecar","car"};
        System.out.println(longestCommonPrefix(data));
    }

}

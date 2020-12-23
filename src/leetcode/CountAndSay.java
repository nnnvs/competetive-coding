package leetcode;

public class CountAndSay {

    public static String countAndSay(int n) {
        String result = "";
        return countRecursive(n, result);
    }

    public static String countRecursive(int n, String result) {
        String str = result;
        if(result==""){
            result = "1";
            return countRecursive(n-1,result);
        } else if(n==0) {
            return result;
        } else {
            result = "";
            for (int i = 0; i < str.length(); i++) {
                int j = i + 1;
                while (j < str.length() && str.charAt(i) == str.charAt(j)) {
                    j++;
                }
                j--;
                int count = 1;
                if (j < str.length()) {
                    count = j - i + 1;
                }
                result = result + String.valueOf(count) + str.charAt(i);
                i = j;
            }
            return countRecursive(n-1,result);
        }
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(1));
        System.out.println(countAndSay(2));
        System.out.println(countAndSay(3));
        System.out.println(countAndSay(4));
        System.out.println(countAndSay(5));
    }
}

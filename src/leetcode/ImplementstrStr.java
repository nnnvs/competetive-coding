package leetcode;

public class ImplementstrStr {
    public   static  int strStr(String haystack, String needle) {
        if(haystack==null  || haystack.equals("")){
            return 0;
        }
        if(needle==null || needle.equals("")){
            return 0;
        }
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        System.out.println(strStr("hello","ll"));
        System.out.println(strStr("aaaaa","bll"));
    }
}

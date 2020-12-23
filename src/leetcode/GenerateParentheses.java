package leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();

        findSolutions("",0,0, n, result);
        return  result;
    }

    public static void findSolutions(String ans,int open, int close, int n,List<String> result){
        if(ans.length()==2*n){
            result.add(ans);
        }

        if(open<n){
            findSolutions(ans+"(",open+1,close,n,result);
        }
        if(open>close){
            findSolutions(ans+")",open,close+1,n,result);
        }
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
}

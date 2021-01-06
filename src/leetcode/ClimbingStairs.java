package leetcode;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.HashMap;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        int[] ways = new int[n+1];
        ways[0]=1;
        ways[1]=1;

        for(int i=2;i<n+1;i++){
            ways[i] = ways[i-1] + ways[i-2];
        }
        return ways[n];
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
        System.out.println(climbStairs(6));
    }
}

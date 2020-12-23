package leetcode;

import java.util.HashMap;

public class RomanToInt {

//    Symbol       Value
//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000
//    I can be placed before V (5) and X (10) to make 4 and 9.
//    X can be placed before L (50) and C (100) to make 40 and 90.
//    C can be placed before D (500) and M (1000) to make 400 and 900.

    public static int romanToInt(String s) {
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            int j = i + 1;

            if (c == 'I') {
                if (j != s.length() && s.charAt(j) == 'V') {
                    number = number + 4;
                    i++;
                } else if (j != s.length() && s.charAt(j) == 'X') {
                    number = number + 9;
                    i++;
                } else {
                    number = number + 1;
                }
            } else if (c == 'X') {
                if (j != s.length() && s.charAt(j) == 'L') {
                    number = number + 40;
                    i++;
                } else if (j != s.length() && s.charAt(j) == 'C') {
                    number = number + 90;
                    i++;
                } else {
                    number = number + 10;
                }
            } else if (c == 'C') {
                if (j != s.length() && s.charAt(j) == 'D') {
                    number = number + 400;
                    i++;
                } else if (j != s.length() && s.charAt(j) == 'M') {
                    number = number + 900;
                    i++;
                } else {
                    number = number + 100;
                }
            } else if (c == 'V') {
                number = number + 5;
            } else if (c == 'L') {
                number = number + 50;
            } else if (c == 'D') {
                number = number + 500;
            } else if (c == 'M') {
                number = number + 1000;
            }
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}

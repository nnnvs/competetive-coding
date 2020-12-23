package leetcode;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        if(digits.length==1 && digits[0]==0){
            digits[0] = 1;
            return digits;
        } else {
            BigInteger number = BigInteger.ZERO;
//            BigInteger multiplier = BigInteger.ONE;
            int multiplier = 1;
            for(int i=digits.length-1;i>-1;i--){
                number = number.add(BigInteger.valueOf(multiplier*digits[i]));
                multiplier = multiplier * 10;
            }

            List<Integer> list = new ArrayList<Integer>();

            number = number.add(BigInteger.ONE);

            while(number.signum()!=0){
                int digit = Integer.valueOf(number.mod(BigInteger.valueOf(10)).toString());
                number = number.divide(BigInteger.valueOf(10));
                list.add(digit);
            }

            Collections.reverse(list);
            System.out.println(list);

            int[] array = new int[list.size()];
            for(int i = 0; i < list.size(); i++) {
                array[i] = list.get(i);
            }
            return array;
        }
    }

    public static void main(String[] args) {
        int[] data = new int[]{1,2,3};
        System.out.println(plusOne(data).toString());
    }
}

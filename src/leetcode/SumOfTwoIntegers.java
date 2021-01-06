package leetcode;

public class SumOfTwoIntegers {

    public static int getSum(int a,int b){
        while (b!=0){
            int c = (a&b);
            a = a^b;
            b = c<<1;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(getSum(1,2));

        System.out.println(getSum(2,3));

        System.out.println(getSum(4,10));
    }
}

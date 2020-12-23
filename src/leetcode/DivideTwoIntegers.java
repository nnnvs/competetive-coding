package leetcode;

public class DivideTwoIntegers {
    public static int divide(int dividend, int divisor) {
        int negativeDividend =  (dividend>0) ? 1 : -1;
        int negativeDivisor =  (divisor>0) ? 1 : -1;

        dividend = dividend*negativeDividend;
        divisor = divisor*negativeDivisor;

        int sum = 0;
        int count = 0;

//        while(dividend - sum < divisor && dividend - sum > divisor){

        while(true){
            int res = dividend - sum;
            if(res >= 0 && res < divisor){
                break;
            }
            sum = sum + divisor;
            count++;

        }

        return count * negativeDividend * negativeDivisor;
    }

//    public static int truncate(double quotient){
//
//    }

    public static void main(String[] args) {
        System.out.println(divide(10,3));
        System.out.println(divide(7,-3));
        System.out.println(divide(-2147483648,-1));
    }
}

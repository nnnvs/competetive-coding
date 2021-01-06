package leetcode;

public class NumberOfOneBits {
    public static int hammingWeight(int n) {
        int bits = 0;
        while(n!=0){
            if((n&1)==1){
                bits++;
            }
            n=n>>1;
        }
        return bits;
    }

    public static int hammingBetter(int n){
        int bits=0;
        while(n!=0){
            bits++;
            n = n&(n-1);
        }
        return bits;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(00000000000000000000000000001011));
        System.out.println(hammingWeight(00000000000000000000000010000000));
//        System.out.println(hammingWeight(11111111111111111111111111111101));

        System.out.println(hammingBetter(00000000000000000000000000001011));
        System.out.println(hammingBetter(00000000000000000000000010000000));
//        System.out.println(hammingBetter(11111111111111111111111111111101));
    }

}

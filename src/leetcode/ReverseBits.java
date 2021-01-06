package leetcode;

public class ReverseBits {

    public static int reverseBits(int n) {
        String res = "";
        for(int i=0;i<32;i++){
            res += String.valueOf(n&1);
            n = n>>1;
        }
        return Integer.parseInt(res,2);
    }

    public static void main(String[] args) {
        System.out.println(reverseBits(Integer.parseInt("00000010100101000001111010011100",2)));
        System.out.println(reverseBits(Integer.parseInt("11111111111111111111111111111101",2)));
    }
}

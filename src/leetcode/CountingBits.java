package leetcode;

public class CountingBits {
    public static int[] countBits(int num) {
        int[] result = new int[num+1];
        for(int i= 0; i<num+1;i++){
            result[i] = bitCounter(i);
        }
        return result;
    }


    public static int bitCounter(int num){
        int bits=0;
        while(num!=0){
            bits++;
            num = num & (num -1);
        }
        return bits;
    }

    public static void main(String[] args) {
        System.out.println(countBits(2));
        System.out.println(countBits(5));
    }
}

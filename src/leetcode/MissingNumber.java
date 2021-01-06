package leetcode;

public class MissingNumber {

    public static int missingNumber(int[] nums) {
        int finalXor = 0;
        for(int i=0;i<nums.length+1;i++){
            finalXor ^= i;
            if(i<nums.length){
                finalXor ^= nums[i];
            }
        }
        return finalXor;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,0,1};
        System.out.println(missingNumber(arr));

        arr = new int[]{0,1};
        System.out.println(missingNumber(arr));

        arr = new int[]{9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(arr));

        arr = new int[]{0};
        System.out.println(missingNumber(arr));
    }
}

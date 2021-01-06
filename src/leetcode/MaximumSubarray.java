package leetcode;

public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        int bigSum = Integer.MIN_VALUE;
        int sumSoFar = 0;
        for(int i=0;i<nums.length;i++) {
            sumSoFar = sumSoFar + nums[i];
            if (sumSoFar > bigSum) {
                bigSum = sumSoFar;
            }
            if (sumSoFar < 0) {
                sumSoFar = 0;
            }
        }
        return bigSum;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));

        arr = new int[]{-2,1};
        System.out.println(maxSubArray(arr));

        arr = new int[]{1};
        System.out.println(maxSubArray(arr));

        arr = new int[]{0};
        System.out.println(maxSubArray(arr));

        arr = new int[]{-1};
        System.out.println(maxSubArray(arr));

        arr = new int[]{-2147483647};
        System.out.println(maxSubArray(arr));
    }
}

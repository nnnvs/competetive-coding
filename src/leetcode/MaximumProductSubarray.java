package leetcode;

public class MaximumProductSubarray {

    public static int maxProduct(int[] nums) {
        int bigProduct = Integer.MIN_VALUE;

        int minimum_till_here = 0;
        int maximum_till_here = 0;
        int flag=0;

        for(int i=0;i<nums.length;i++){

            if(flag==0){
                maximum_till_here = nums[i];

                minimum_till_here = nums[i];

                bigProduct = Integer.max(bigProduct, maximum_till_here);
                flag=1;
            } else {

                int temp_max_holder = maximum_till_here;

                maximum_till_here = Integer.max(nums[i], Integer.max(temp_max_holder * nums[i], minimum_till_here * nums[i]));

                minimum_till_here = Integer.min(nums[i], Integer.min(temp_max_holder * nums[i], minimum_till_here * nums[i]));

                bigProduct = Integer.max(bigProduct, maximum_till_here);
            }
        }
        return bigProduct;
    }

    public static void main(String[] args) {
//        int[] arr = new int[]{2,3,-2,4};
//        System.out.println(maxProduct(arr));

        int[] arr = new int[]{-2};
        System.out.println(maxProduct(arr));

//        arr = new int[]{-2,0,-1};
//        System.out.println(maxProduct(arr));
//
//        arr = new int[]{0,2};
//        System.out.println(maxProduct(arr));
//
//        arr = new int[]{3,-1,4};
//        System.out.println(maxProduct(arr));
//
//        arr = new int[]{3,-1,4,3,-1,4};
//        System.out.println(maxProduct(arr));
//
//        arr = new int[]{-3,-1,-1};
//        System.out.println(maxProduct(arr));
//
//        arr = new int[]{-4,-3,-3,-1,0,-4,52};
//        System.out.println(maxProduct(arr));

//        arr = new int[]{2,-5,-2,-4,3};
//        System.out.println(maxProduct(arr));
    }
}

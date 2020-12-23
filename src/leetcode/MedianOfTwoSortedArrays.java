package leetcode;

public class MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0, j=0, k=0;
        int[] result =  new int[nums1.length + nums2.length];
        while( i<nums1.length || j<nums2.length ){
            if(i>=nums1.length){
                result[k++]=nums2[j++];
            } else if(j>=nums2.length){
                result[k++]=nums1[i++];
            } else {
                if (nums1[i] >= nums2[j]) {
                    result[k++]=nums2[j++];
                } else if (nums1[i] < nums2[j]){
                    result[k++] = nums1[i++];
                }
            }
        }
        for(i=0;i<result.length;i++)
            System.out.print(result[i]+",");
        System.out.println("");
        return findMedian(result);
    }

    public static double findMedian(int[] nums){
        int n = nums.length;
        if(n==0){
            return 0;
        } else {
            if(n % 2 == 0){
                return (Double.valueOf(nums[n/2]) + Double.valueOf(nums[n/2 - 1]))/2d;
            } else {
                return nums[(n-1)/2];
            }
        }
    }

    public static void main(String[] args) {
        int[] data1 = new int[]{1,3};
        int[] data2 = new int[]{2};
        System.out.println(findMedianSortedArrays(data1,data2));

        data1 = new int[]{1,2};
        data2 = new int[]{3,4};
        System.out.println(findMedianSortedArrays(data1,data2));

        data1 = new int[]{0,0};
        data2 = new int[]{0,0};
        System.out.println(findMedianSortedArrays(data1,data2));

        data1 = new int[0];
        data2 = new int[]{2};
        System.out.println(findMedianSortedArrays(data1,data2));

    }
}

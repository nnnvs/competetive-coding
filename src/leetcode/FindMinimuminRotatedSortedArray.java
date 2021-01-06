package leetcode;

public class FindMinimuminRotatedSortedArray {

    public static int findMin(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int mid = n/2;

        if(n==1){
            return nums[0];
        } else {
            while (start <= end) {
                // is the number
                if(mid==0 && nums[mid] < nums[n - 1]){
                    return nums[mid];
                } else if (mid!=0 && nums[mid] < nums[mid - 1]) {
                    return nums[mid];
                } else if (mid==n-1 && nums[0] < nums[mid]) {
                    return nums[0];
                } else if (mid!=n-1 && nums[mid + 1] < nums[mid]) {
                    return nums[mid + 1];
                } else if (nums[mid] < nums[end]) {
                    end = mid - 1;
                    mid = (start + end) / 2;
                } else if (nums[mid] > nums[end]) {
                    start = mid + 1;
                    mid = (start + end) / 2;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,4,5,1,2};
        System.out.println(findMin(arr));

        arr = new int[]{4,5,6,7,0,1,2};
        System.out.println(findMin(arr));

        arr = new int[]{11,13,15,17};
        System.out.println(findMin(arr));

        arr = new int[]{1,2};
        System.out.println(findMin(arr));

        arr = new int[]{1,2,3};
        System.out.println(findMin(arr));

        arr = new int[]{5,1,2,3,4};
        System.out.println(findMin(arr));

    }
}

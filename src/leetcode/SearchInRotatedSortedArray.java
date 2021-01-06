package leetcode;

public class SearchInRotatedSortedArray {

    public static int search(int[] nums, int target) {
        return recursiveSearch(nums,0, nums.length-1, target);
    }

    public static int recursiveSearch(int[] nums, int l, int r, int target){
        int mid = (l+r)/2;
        if(nums[mid]==target){
            return mid;
        }
        if(l<r){
            if(nums[mid]>nums[l]){
                if(nums[mid]>target && nums[l]<=target){
                    return recursiveSearch(nums,l,mid,target);
                } else {
                    return recursiveSearch(nums,mid+1,r,target);
                }
            } else {
                if(nums[mid+1]<=target && nums[r]>=target){
                    return recursiveSearch(nums,mid+1,r,target);
                } else {
                    return recursiveSearch(nums,l,mid,target);
                }
            }
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,5,6,7,0,1,2};
        System.out.println(search(arr,0));

        arr = new int[]{4,5,6,7,0,1,2};
        System.out.println(search(arr,3));

        arr = new int[]{1};
        System.out.println(search(arr,0));

        arr = new int[]{1,2,3};
        System.out.println(search(arr,3));

        arr = new int[]{5,1,2,3,4};
        System.out.println(search(arr,5));

        arr = new int[]{3,1};
        System.out.println(search(arr,1));

    }
}

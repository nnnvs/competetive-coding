package leetcode;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        return binarySearch(nums,0,nums.length-1,target);
    }

    static int binarySearch(int[] arr, int l, int r, int x){
        int mid = l + (r - l) / 2;
        if (r >= l) {
            if (arr[mid] > x) {
                return binarySearch(arr, l, mid-1, x);
            } else if (arr[mid] == x) {
                return mid;
            } else {
                return binarySearch(arr, mid+1, r, x);
            }
        }
        return mid;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,3,5,6};
        System.out.println(searchInsert(arr,7));
        System.out.println(searchInsert(arr,0));
    }
}

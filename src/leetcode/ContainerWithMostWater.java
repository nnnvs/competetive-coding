package leetcode;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int l = 0;
        int r = height.length - 1;
        while(l<r){
            max = Math.max((r-l) * Math.min(height[l],height[r]),max);
            if(height[l] < height[r]){
                l++;
            } else {
                r--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,1};
        System.out.println(maxArea(arr));

        arr = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));

        arr = new int[]{4,3,2,1,4};
        System.out.println(maxArea(arr));

        arr = new int[]{1,2,1};
        System.out.println(maxArea(arr));
    }
}

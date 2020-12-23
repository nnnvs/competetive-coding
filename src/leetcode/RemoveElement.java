package leetcode;

public class RemoveElement {
    public static int removeElementSlow(int[] nums, int val) {
        int length =  nums.length;
        int endIndex = nums.length - 1;
        for(int i=0;i<=endIndex && endIndex>=0;i++){
            if(nums[i]==val){
                int swap = nums[endIndex];
                nums[endIndex] = nums[i];
                nums[i] = swap;
                i--;
                endIndex--;
                length--;
            }
        }
//        for(int i=0;i<nums.length;i++)
//            System.out.print(nums[i]+",");

        return length;
    }

    public static void main(String[] args) {
        int[] data = new int[]{0,1,2,2,3,0,4,2};
        System.out.println(removeElementSlow(data,2));
        data = new int[]{0,1,2,2,3,0,4,2,0,1,2,2,3,0,4,2,0,1,2,2,3,0,4,2,0,1,2,2,3,0,4,2};
        System.out.println(removeElementSlow(data,2));
        data = new int[]{3,2,2,3};
        System.out.println(removeElementSlow(data,3));
        data = new int[]{1};
        System.out.println(removeElementSlow(data,1));
        data = new int[0];
        System.out.println(removeElementSlow(data,3));
    }
}

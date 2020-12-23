package leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0; i< nums.length;i++){
            if(!hashSet.contains(nums[i])){
                hashSet.add(nums[i]);
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] data = new int[]{1,2,3,1};
        System.out.println(containsDuplicate(data));

        data = new int[]{1,2,3,4};
        System.out.println(containsDuplicate(data));

        data = new int[]{1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(data));
    }
}

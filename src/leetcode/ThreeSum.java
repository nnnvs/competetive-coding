package leetcode;

import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Set<List<Integer>> resultSet = new HashSet<List<Integer>>();

        if(nums.length<3){
            return result;
        }
        for(int i=0;i<nums.length;i++){
            HashSet<Integer> hashSet = new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int x = -1*(nums[i]+nums[j]);
                if(hashSet.contains(x)){
                    List<Integer> list = new ArrayList();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(x);
                    Collections.sort(list);
                    resultSet.add(list);
                } else {
                    hashSet.add(nums[j]);
                }
            }
        }
        resultSet.forEach(res -> result.add(res));
        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));

        arr = new int[]{};
        System.out.println(threeSum(arr));

        arr = new int[]{0};
        System.out.println(threeSum(arr));
    }
}

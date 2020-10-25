package main;
import java.util.HashMap;
import java.util.Map;
class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                return new int[] {map.get(target-nums[i]),i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String[] args) {
        Solution s1 = new Solution();
        int[] num = {1,2,3,4,5 };
        int[] mapAnswer = new int [ 2 ];
        mapAnswer = s1.twoSum( num, 7);
    }

}

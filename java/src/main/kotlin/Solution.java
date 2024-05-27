import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

//1. 两数之和
//给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
//你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
//你可以按任意顺序返回答案。
class Solution {
    public int[] twoSum1(int[] nums, int target) {
        Integer[] index = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            index[i] = i;
        }
        Arrays.sort(index, Comparator.comparingInt(a -> nums[a]));

        int[] result = new int[2];
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int sum = nums[index[left]] + nums[index[right]];
            if (sum == target) {
                result[0] = index[left];
                result[1] = index[right];
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }

    public int[] twoSum2(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (numMap.containsKey(temp)) {
                result[0] = numMap.get(temp);
                result[1] = i;
            }
            numMap.put(nums[i], i);
        }
        return result;
    }
}
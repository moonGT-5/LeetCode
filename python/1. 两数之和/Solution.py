from typing import List


class Solution:
# 39ms 17.64M
    def twoSum1(self, nums: List[int], target: int) -> List[int]:
        result = [0, 0]
        num_map = {}
        for i in range(len(nums)):
            temp = target - nums[i]
            if temp in num_map:
                result[0] = num_map[temp]
                result[1] = i
                return result
            num_map[nums[i]] = i
        return result

# 38ms 17.73M
    def twoSum2(self, nums: List[int], target: int) -> List[int]:
        index = sorted(range(len(nums)), key=lambda i: nums[i])
        left, right = 0, len(nums) - 1
        while left < right:
            sum = nums[index[left]] + nums[index[right]]
            if sum == target:
                return [index[left], index[right]]
            elif sum < target:
                left += 1
            else:
                right -= 1

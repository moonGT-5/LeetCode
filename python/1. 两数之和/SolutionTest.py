import unittest

from Solution import Solution


class TestTwoSum(unittest.TestCase):
    def test_twoSum(self):
        # 创建 Solution 类的实例
        sol = Solution()

        # 定义测试用例
        test_cases = [([2, 7, 11, 15], 9, [0, 1]), ([3, 2, 4], 6, [1, 2]), ([3, 3], 6, [0, 1])]

        # 运行测试用例
        for nums, target, expected in test_cases:
            # 测试 twoSum1 方法
            result1 = sol.twoSum1(nums, target)
            self.assertEqual(sorted(result1), sorted(expected), f"twoSum1({nums}, {target}) returned {result1} but expected {expected}")

            # 测试 twoSum2 方法
            result2 = sol.twoSum2(nums, target)
            self.assertEqual(sorted(result2), sorted(expected), f"twoSum2({nums}, {target}) returned {result2} but expected {expected}")


if __name__ == '__main__':
    unittest.main()

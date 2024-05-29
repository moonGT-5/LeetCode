import unittest

from Solution import Solution, ListNode

class TestTwoSum(unittest.TestCase):
    def test_addTwoNumbers(self):
        # 创建Solution实例
        sol = Solution()

        # 创建链表实例
        l1 = ListNode(2, ListNode(4, ListNode(3)))
        l2 = ListNode(5, ListNode(6, ListNode(4)))

        # 调用方法
        result = sol.addTwoNumbers(l1, l2)

        # 验证结果
        assert result.val == 7
        assert result.next.val == 0
        assert result.next.next.val == 8

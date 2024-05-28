package 两数相加;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import 两数相加.Solution;

public class SolutionTest {
    private Solution solution = new Solution();
    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void testAddTwoNumbers() {
        // 创建链表表示数字 243
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // 创建链表表示数字 564
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        // 调用解决方案
        ListNode result = solution.addTwoNumbers(l1, l2);

        // 验证结果
        int[] expected = {7, 0, 8};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], result.val);
            result = result.next;
        }
    }
}

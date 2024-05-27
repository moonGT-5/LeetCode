import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testSolution1() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2}; // 假设答案是{2, 4}，它们的索引分别是1和2
        int[] result = solution.twoSum1(nums, target);
        Arrays.sort(result);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSolution2() {
        int[] nums = {4, 2, 3};
        int target = 6;
        int[] expected = {0, 1}; // 假设答案是{2, 4}，它们的索引分别是1和2
        int[] result = solution.twoSum1(nums, target);
        Arrays.sort(result);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSolution3() {
        int[] nums = {3, 3};
        int target = 6;
        int[] expected = {0, 1}; // 假设答案是{3, 3}，它们的索引分别是0和1
        int[] result = solution.twoSum1(nums, target);
        Arrays.sort(result);
        assertArrayEquals(expected, result);
    }
    @Test
    public void testSolution4() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2}; // 假设答案是{2, 4}，它们的索引分别是1和2
        int[] result = solution.twoSum2(nums, target);
        Arrays.sort(result);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSolution5() {
        int[] nums = {4, 2, 3};
        int target = 6;
        int[] expected = {0, 1}; // 假设答案是{2, 4}，它们的索引分别是1和2
        int[] result = solution.twoSum2(nums, target);
        Arrays.sort(result);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSolution6() {
        int[] nums = {3, 3};
        int target = 6;
        int[] expected = {0, 1}; // 假设答案是{3, 3}，它们的索引分别是0和1
        int[] result = solution.twoSum2(nums, target);
        Arrays.sort(result);
        assertArrayEquals(expected, result);
    }
}

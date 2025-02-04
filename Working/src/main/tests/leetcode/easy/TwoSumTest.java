package leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class TwoSumTest {

    @Test
    void test() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum.twoSum(nums, target);
        int[] answer = {0,1};
        assert Arrays.equals(result, answer);
    }
}

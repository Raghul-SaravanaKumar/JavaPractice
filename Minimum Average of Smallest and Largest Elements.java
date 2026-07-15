import java.util.*;

class Solution {

    public double minimumAverage(int[] nums) {

        Arrays.sort(nums);

        double answer = Double.MAX_VALUE;

        int left = 0;
        int right = nums.length - 1;

        while(left < right) {

            answer = Math.min(answer,
                    (nums[left] + nums[right]) / 2.0);

            left++;
            right--;
        }

        return answer;
    }
}

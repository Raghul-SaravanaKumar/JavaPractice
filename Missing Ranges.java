import java.util.*;

class Solution {

    public List<String> findMissingRanges(int[] nums,
                                          int lower,
                                          int upper) {

        List<String> result = new ArrayList<>();

        long prev = (long) lower - 1;

        for(int i = 0; i <= nums.length; i++) {

            long curr = (i == nums.length)
                        ? (long) upper + 1
                        : nums[i];

            if(curr - prev >= 2) {

                result.add(format(prev + 1,
                                  curr - 1));
            }

            prev = curr;
        }

        return result;
    }

    private String format(long start,
                          long end) {

        return start == end
               ? String.valueOf(start)
               : start + "->" + end;
    }
}

class Solution {

    public int arithmeticTriplets(int[] nums, int diff) {

        boolean[] seen = new boolean[201];

        for(int num : nums) {
            seen[num] = true;
        }

        int count = 0;

        for(int num : nums) {

            if(num + diff <= 200 &&
               num + 2 * diff <= 200 &&
               seen[num + diff] &&
               seen[num + 2 * diff]) {

                count++;
            }
        }

        return count;
    }
}

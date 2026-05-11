class Solution {

    public void printOddNumbers(int[] nums) {

        for(int num : nums) {

            if(num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
}

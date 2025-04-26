class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Check every pair of numbers in the array
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // If the two numbers add up to the target
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j }; // return their indices
                }
            }
        }

        // If no such pair is found, return [-1, -1]
        return new int[] { -1, -1 };
    }
}

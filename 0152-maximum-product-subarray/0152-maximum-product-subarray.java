class Solution {
    public int maxProduct(int[] nums) {

        int n = nums.length - 1;

        int prefix = 1;
        int suffix = 1;

        int maxSubarray = Integer.MIN_VALUE;

        for (int i = 0; i <= n; i++) {

            if (prefix == 0) prefix = 1;
            if (suffix == 0) suffix = 1;

            prefix = prefix * nums[i];
            suffix = suffix * nums[n - i];

            maxSubarray = Math.max(maxSubarray, Math.max(prefix, suffix));
        }

        return maxSubarray;
    }
}

class Solution {
    public int splitArray(int[] nums, int k) {
        int max = nums[0];
        int sum = 0;

        for (int num : nums) {
            max = Math.max(num, max);
            sum += num;
        }

        int left = max;
        int right = sum;
        int ans = sum;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int part = countK(nums, mid);

            if (part <= k) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }

    private int countK(int[] nums, int mid) {
        int sum = 0;
        int count = 1;

        for (int num : nums) {
            if (sum + num <= mid) {
                sum += num;
            } else {
                count++;
                sum = num;
            }
        }

        return count;
    }
}

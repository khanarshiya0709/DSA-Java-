class Solution {
    public void nextPermutation(int[] nums) {

        int idx = -1;
        int n = nums.length;

        // Find the first decreasing element from right
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx = i;
                break;
            }
        }

        // If no such index exists, reverse whole array
        if (idx == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Find the element just greater than nums[idx]
        for (int i = n - 1; i > idx; i--) {
            if (nums[i] > nums[idx]) {
                swap(nums, i, idx);
                break;
            }
        }

        // Reverse the part after idx
        reverse(nums, idx + 1, n - 1);
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
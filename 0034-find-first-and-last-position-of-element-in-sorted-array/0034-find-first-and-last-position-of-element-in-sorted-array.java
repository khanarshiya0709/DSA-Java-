class Solution {

    public int[] searchRange(int[] nums, int target) {
        int first = firstOcc(nums, target, 0, nums.length - 1);
        int last = lastOcc(nums, target, 0, nums.length - 1);

        return new int[]{first, last};
    }

    public int firstOcc(int[] nums, int target, int left, int right) {
        if (left > right) return -1;

        int mid = left + (right - left) / 2;

        if (nums[mid] == target) {
            int result = firstOcc(nums, target, left, mid - 1);
            return (result == -1) ? mid : result;

        } else if (nums[mid] < target) {
            return firstOcc(nums, target, mid + 1, right);

        } else {
            return firstOcc(nums, target, left, mid - 1);
        }
    }

    public int lastOcc(int[] nums, int target, int left, int right) {
        if (left > right) return -1;

        int mid = left + (right - left) / 2;

        if (nums[mid] == target) {
            int result = lastOcc(nums, target, mid + 1, right);
            return (result == -1) ? mid : result;

        } else if (nums[mid] < target) {
            return lastOcc(nums, target, mid + 1, right);

        } else {
            return lastOcc(nums, target, left, mid - 1);
        }
    }
}
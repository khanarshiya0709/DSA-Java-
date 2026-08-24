class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        long windowSum = 0;
        int ans = 0;

        for(int right = 0 ; right <nums.length; right++){
            windowSum += nums[right];
            int windowSize = right - left + 1;
            long cost = (long) nums[right] * windowSize - windowSum;

            while(cost > k){
                windowSum -= nums[left];
                left++;
                windowSize = right - left + 1;
                cost = (long) nums[right] * windowSize - windowSum;
            }
            ans = Math.max(ans, windowSize);
        }
        return ans;
        
        
    }
}
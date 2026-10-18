class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = nums[0];
        for(int num : nums){
            right = Math.max(num, right);
        }
        int ans = -1;
        while(left <=right){
            int mid = left + (right - left) / 2;
            int sum = 0;
            for(int num : nums){
                sum += (num + mid - 1) / mid;
            }
            if(sum <= threshold){
                ans = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return ans;
        
    }
}
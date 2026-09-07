class Solution {
    public int maxSubArray(int[] nums) {
        // int start = -1, int end = -1;
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            // if(sum == 0) starting = i
            sum += nums[i];
            if(sum > maxSum){
                maxSum = sum;
                // start = starting , end = i;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return maxSum;
        

        
    }
}
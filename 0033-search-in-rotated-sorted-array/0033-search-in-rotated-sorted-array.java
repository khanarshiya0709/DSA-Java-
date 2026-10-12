class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                return mid;
            }
            //left sorted
            if(nums[start] <= nums[mid]){
                //we already checked out mid thats why target< end
                if(nums[start] <= target && target < nums[mid]){
                    //left
                    end = mid-1;
                }else{
                    //right
                    start = mid+ 1;
                }
            }else{
                if(nums[mid] < target && target <= nums[end]){
                    //right
                    start = mid+1;
                }else{
                    end = mid -1;
                }
          
            }
        }
        return -1;


    }
}
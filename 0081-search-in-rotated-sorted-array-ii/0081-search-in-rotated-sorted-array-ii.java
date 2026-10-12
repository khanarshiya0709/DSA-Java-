class Solution {
    public boolean search(int[] nums, int target) {

        int start = 0;
        int end = nums.length-1;
        while(start <= end){

            int mid = start + (end - start) / 2;

            if(nums[mid] == target){ //nums = [1,1,1] midd == target handle.
                return true;
            }

            //handle duplicates 
            if(nums[start] == nums[mid] && nums[mid] == nums[end]){
                start++;   // nums = [1,1,3,1]
                end--;
            }
             
             //left sorted
            else if(nums[start] <= nums[mid]){

                //left
                if(nums[start] <= target && target <= nums[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }


            }else{
                if(nums[mid] <= target && target <= nums[end]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }


            }

        }
        return false;

        
    }
} 
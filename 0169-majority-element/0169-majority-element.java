class Solution {
    public int majorityElement(int[] nums) {

       int candidate = 0;
        int freq = 0;
        for(int i=0; i<nums.length; i++){
            if(freq == 0){
                candidate = nums[i]; 
            }
            if(candidate == nums[i]){
                freq++;
            }else{
                freq--;
            }

        }
        return candidate;
        
    }
}
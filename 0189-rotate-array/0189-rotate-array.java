class Solution {
    public void rotate(int[] nums, int k) {
        // int n = nums.length;
        // k = k % n;

        // int[] temp = new int[k];

        // // last k elem store in temp;
        // for(int i=0; i<k; i++){
        //     temp[i] = nums[n-k+i]; 
        // }
         
        // //shift remianing element right;
        // for(int i = n-1; i>=k ;i--){
        //     nums[i] = nums[i-k ];
        // }
        
        // for(int i=0; i<k; i++){
        //     nums[i] = temp[i];
        
        // }

        int n = nums.length;
        k = k % n;
        reverse(nums, n - k,  n-1);
        reverse(nums, 0, n-k-1);
        reverse(nums, 0 , n-1);

    }
    public void reverse(int[] nums, int left, int right){
        while(left< right){
            int temp = nums[left];
            nums[left]= nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
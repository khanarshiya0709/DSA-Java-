class Solution {
    public int[] rearrangeArray(int[] nums) {
    int n = nums.length;
    int[] ans = new int[n];
    int[] positive = new int[n];
    int[] negative = new int[n];
    int p = 0;
    int neg = 0;

    for(int i=0; i<n; i++){
        if(nums[i]>=0){
            positive[p++] = nums[i];
        }else{
            negative[neg++] = nums[i];
        }
    }
    int pSize = p;
    int nSize = neg;
    int i=0;
    int j=0;
    int idx = 0;
    while(i<pSize && j<nSize){
        ans[idx++] = positive[i++];
        ans[idx++] = negative[j++];
    }
    while(i<pSize){
        ans[idx++] = positive[i++];
    }
    while(j<nSize){
        ans[idx++] = negative[j++];
    }
    return ans;
    
        
    }
}
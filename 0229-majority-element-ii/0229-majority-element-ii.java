class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int n = nums.length;
        List<Integer> ans = new ArrayList<>();

        int el1 = 0;
        int count1 = 0;

        int el2 = 0;
        int count2 = 0;

        // Finding candidates
        for(int i = 0; i < n; i++) {

            if(count1 == 0 && nums[i] != el2) {
                count1 = 1;
                el1 = nums[i];
            }
            else if(count2 == 0 && nums[i] != el1) {
                count2 = 1;
                el2 = nums[i];
            }
            else if(el1 == nums[i]) {
                count1++;
            }
            else if(el2 == nums[i]) {
                count2++;
            }
            else {
                count1--;
                count2--;
            }
        }

        // Verification
        count1 = 0;
        count2 = 0;

        for(int num : nums) {
            if(num == el1) {
                count1++;
            }
            else if(num == el2) {
                count2++;
            }
        }

        if(count1 > n / 3) {
            ans.add(el1);
        }

        if(count2 > n / 3) {
            ans.add(el2);
        }

        return ans;
    }
}
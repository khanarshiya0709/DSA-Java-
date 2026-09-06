class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefSum  = 0;
        int count = 0;
        map.put(0,1);
        for(int i=0; i<nums.length; i++){
            prefSum +=nums[i];
            int remain = prefSum - k;
            if(map.containsKey(remain)){
                count+= map.get(remain);
            }
            map.put(prefSum, map.getOrDefault(prefSum, 0) +1);

        }
        return count;

      
    }
}

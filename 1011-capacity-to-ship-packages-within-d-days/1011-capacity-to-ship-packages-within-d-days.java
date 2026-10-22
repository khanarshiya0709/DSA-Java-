class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max = weights[0];
        int sum = 0;

        for(int weight : weights){
            max = Math.max(max, weight);
            sum += weight;
        }

        int left = max;
        int right = sum;
        int ans = sum;

        while(left<=right){
            int mid = left + (right - left) / 2; //mid == capacity hai 
            int capacits = reqDays(weights, mid);
            if(capacits <= days){
                ans = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return ans; 
    }

    private int reqDays(int[] weights, int capacity){
        int day = 1, load = 0;

        for(int i=0; i<=weights.length-1; i++){
            if(load + weights[i] > capacity){
                day = day + 1;
                load = 0;
            }
            load += weights[i];
        }
        return day;
    }
}
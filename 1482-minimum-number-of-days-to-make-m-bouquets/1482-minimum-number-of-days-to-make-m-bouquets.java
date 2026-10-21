class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long) m * k > bloomDay.length){
            return -1;
        }
        int min = bloomDay[0];
        int max = bloomDay[0];

        for(int day : bloomDay){
            min  = Math.min(min, day);
            max = Math.max(max, day);
        }

       int left = min;
       int right = max;
       int ans = -1;
       while(left<=right){
        int mid = left + (right - left) / 2;
        if(canMakeBouqets(bloomDay, mid, m, k)){
            ans = mid;
            right = mid -1;
        }else{
            left = mid + 1;
        }
       }
       return ans;
        
    }
    private boolean canMakeBouqets(int[] bloomDay, int day, int m, int k){
        int flowers  = 0;
        int bouqets = 0;
        for(int i : bloomDay){
            if( i <= day){
                flowers++;
                if(flowers == k){
                    bouqets++;
                    flowers = 0;
                }

            }else{
                flowers  = 0;
            }
        }
        return bouqets >= m;
    }
}


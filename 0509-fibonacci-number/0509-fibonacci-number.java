class Solution {
    public int fib(int n) {
        int prev1 = 0;
        int prev2 = 1;
        if(n <= 1){
            return n;
        }
        for(int i=2; i<=n; i++){
            int curr = prev1 + prev2;
            prev1 = prev2;
            prev2 = curr;
        }
        return prev2;


        
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxValue = 0;
        for(int price : prices){
            if(price < buyPrice){
                buyPrice = price;
            }else{
                int profit = price - buyPrice;
                maxValue = Math.max(profit, maxValue);

            }
        }
        return maxValue;
       


        
    }
}


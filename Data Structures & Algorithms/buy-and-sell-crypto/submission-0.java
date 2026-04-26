class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[] pre_max= new int[n];
        pre_max[n-1]=prices[n-1];
        for (int i=n-2;i>=0;i--){
            pre_max[i]= Math.max(pre_max[i+1],prices[i]);
        }

        int res=0;
        for (int i=0;i<n;i++){
            res=Math.max(res,pre_max[i]-prices[i]);
        }
        return res;
    }
}

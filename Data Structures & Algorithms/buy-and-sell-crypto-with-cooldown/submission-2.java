class Solution {

    int[][] dp;

    public int solve(int ind, int n , int hold, int[] prices){

        if (ind>=n){return 0;}
        if (dp[ind][hold]!=-1){return dp[ind][hold];}

        int profit=0;
        if (hold==1){
            int sell = prices[ind]+solve(ind+2,n,0,prices);
            int not_sell = solve(ind+1,n ,hold, prices);
            profit =Math.max(sell,not_sell);
        } else{
            int pick =-prices[ind]+ solve(ind+1,n,1,prices);
            int not_pick = solve(ind+1, n, hold , prices);
            profit=Math.max(pick,not_pick);
        }
        dp[ind][hold]=profit;

        return profit;
    }


    public int maxProfit(int[] prices) {
        int n=prices.length;
        dp=new int[n][2];
        for (int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        
        return solve(0,n,0,prices);
        
    }
}

class Solution {


    public int solve(int ind,int n,int amount,int[] coins){

        if (amount==0){return 0;}
        if (amount<0 || ind>=n){return Integer.MAX_VALUE;}
        

        int same =solve(ind,n,amount-coins[ind],coins);
        if (same!=Integer.MAX_VALUE){
            same+=1;
        }
        int next = solve(ind+1,n,amount,coins);
        return Math.min(same,next);
    }


    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int res= solve(0,n,amount,coins);
        return res!=Integer.MAX_VALUE?res:-1;
        
    }
}

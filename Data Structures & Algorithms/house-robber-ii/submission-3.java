class Solution {

    public int solve(int pos,int n,int[] nums,int[] dp){
    
        if (pos>=n){return 0;}
        if (dp[pos]!=-1){return dp[pos];}
        int pick = nums[pos]+solve(pos+2,n,nums,dp);
        int not_pick =solve(pos+1,n,nums,dp);

        dp[pos]= Math.max(pick,not_pick);
        return dp[pos];
        // return Math.max(pick,not_pick);

    }


    public int rob(int[] nums) {

        int n=nums.length;
        if (n==1){return nums[0];}
        int[] dp  = new int[n];
        Arrays.fill(dp,-1);
        int first=solve(0,n-1,nums,dp);
        Arrays.fill(dp,-1);
        int second=solve(1,n,nums,dp);
        return Math.max(first,second);


    }
}

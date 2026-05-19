class Solution {

    public int solve(int n,int target,int[] dp,int[] nums){

        if (target==0){return 1;}
        if (target<0){return 0;}
        if (dp[target]!=-1){return dp[target];}

        int res=0;
       for (int i=0;i<n;i++)
       {
            res+=solve(n,target-nums[i],dp,nums);
       }
       dp[target]=res;
       return res;


    }


    public int combinationSum4(int[] nums, int target) {
        int n=nums.length;
        int[] dp= new int[target+1];
        Arrays.fill(dp,-1);
        return solve(n,target,dp,nums);
        
    }
}
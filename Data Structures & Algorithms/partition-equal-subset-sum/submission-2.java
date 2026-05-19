class Solution {

    public boolean solve(int ind,int n ,int val,int[] dp,int[] nums){

        if (ind>=n){return true;}
        
        // System.out.println(ind+" "+dp[0]+" "+dp[1]);
        for (int i=0;i<2;i++){
            if (dp[i]+nums[ind]<=val){
                dp[i]+=nums[ind];
                if (solve(ind+1,n,val,dp,nums)){return true;}
                dp[i]-=nums[ind];
            }
        }
        return false;

    }

    public boolean solve2(int ind,int n, int val, int[][] dp,int[] nums){

        if (ind>=n || val<0){return false;}
        if (val==0){return true;}
        if (dp[ind][val]!=-1){return dp[ind][val]==1?true:false;}

        boolean pick = solve2(ind+1,n,val-nums[ind],dp,nums);
        boolean npick=solve2(ind+1,n,val,dp,nums);
        dp[ind][val]=pick||npick ?1:0;

        return pick||npick;
    }


    public boolean canPartition(int[] nums) {
        int[] dp= new int[2];
        int n=nums.length;
        int sum=0;
        for (int i=0;i<n;i++){sum+=nums[i];}
        if (sum%2!=0){return false;}
        
        // return solve(0,n,sum/2,dp,nums);
        int[][] dp2 = new int[n][(sum/2)+1];
        for (int i=0;i<n;i++){
            Arrays.fill(dp2[i],-1);
        }
        return solve2(0,n,sum/2,dp2,nums);
    }
}

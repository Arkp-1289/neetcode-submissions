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


    public boolean canPartition(int[] nums) {
        int[] dp= new int[2];
        int n=nums.length;
        int sum=0;
        for (int i=0;i<n;i++){sum+=nums[i];}
        if (sum%2!=0){return false;}
        
        return solve(0,n,sum/2,dp,nums);
    }
}

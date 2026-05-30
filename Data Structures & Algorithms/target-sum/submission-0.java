class Solution {

    public int solve(int ind,int target,int n,int[] nums){

        if (ind==n && target==0){return 1;}
        if (ind>=n){return 0;}

        int add = solve(ind+1,target-nums[ind],n,nums);
        int sub = solve(ind+1,target+nums[ind],n,nums);

        return add+sub;
    }


    public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
        return solve(0,target,n,nums);
        
    }
}

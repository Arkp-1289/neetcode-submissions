class Solution {

    public int solve(int ind,int[] nums,int val){

        if (ind==nums.length){return val;}

        return solve(ind+1,nums,val^nums[ind])+solve(ind+1,nums,val);

    }


    public int subsetXORSum(int[] nums) {

       return solve(0,nums,0); 
        
    }
}
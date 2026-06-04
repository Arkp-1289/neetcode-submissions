class Solution {
    public int maxSubArray(int[] nums) {
        
        int res=Integer.MIN_VALUE;
        int temp=0,n=nums.length;
        for (int i=0;i<n;i++){
            temp+=nums[i];
            res=Math.max(res,Math.max(nums[i],temp));
            if (temp<0){temp=0;}
        }
        return res;
    }

}

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int res=Integer.MAX_VALUE;
        int n=nums.length;
        int l=0,r=0;
        int sum=0;
        while (r<n){
            sum+=nums[r];
            if (sum>=target){
                res=Math.min(res,r-l+1);
                while (l<r){
                    sum-=nums[l];
                    if (sum<target){
                        sum+=nums[l];
                        break;
                    }
                    l++;
                    res=Math.min(res,r-l+1);
                    
                }
            }
            r++;
        }
        return res==Integer.MAX_VALUE?0:res;
        
    }
}
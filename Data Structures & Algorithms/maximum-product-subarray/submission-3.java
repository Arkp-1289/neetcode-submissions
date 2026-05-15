class Solution {
    public int maxProduct(int[] nums) {
        int res=Integer.MIN_VALUE,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;

        int n=nums.length;
        res=nums[0];
        max=nums[0];
        min=nums[0];
        for (int i=1;i<n;i++){
            int temp1=max,temp2=min;
            max=Math.max(nums[i],Math.max(nums[i]*max,nums[i]*min));
            min=Math.min(nums[i],Math.min(nums[i]*temp1,nums[i]*temp2));
            res=Math.max(res,max);
            // System.out.println(max+" "+min+" "+res);
        }
        return res;

        
    }
}

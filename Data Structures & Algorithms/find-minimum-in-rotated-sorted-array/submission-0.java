class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int l=0,r=n-1;

    int res=nums[0];

        while (l<=r){
            int mid=(l+r)/2;

            if (nums[l]<nums[r]){
                return Math.min(res,nums[l]);
            }

            res=Math.min(res,nums[mid]);
            if (nums[l]<=nums[mid]){
                l=mid+1;
            } else{
                r=mid-1;
            }
        }
        return res;
        
    }
}

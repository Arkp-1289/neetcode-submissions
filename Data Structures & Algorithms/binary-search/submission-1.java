class Solution {


    public int solve(int l,int r,int target,int[] nums){
        if (l>r){
            return -1;
        }
        int mid=(l+r)/2;
        if (nums[mid]==target){return mid;}

        if (nums[mid]>target){
            return solve(l,r-1,target,nums);
        }

        return solve(mid+1,r,target,nums);
    }


    public int search(int[] nums, int target) {
        
        int n= nums.length;
        return solve(0,n-1,target,nums);
        
    }
}

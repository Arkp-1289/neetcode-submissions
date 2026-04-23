class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        for (int i=0;i<n;i++){
            if (nums[i]<0){nums[i]=0;}
        }

        for (int i=0;i<n;i++){
            int ind=Math.abs(nums[i])-1;
            if (ind>=0 && ind<n){
                if (nums[ind]>0){
                    nums[ind]=-1*nums[ind];
                } 
                 if (nums[ind]==0){
                    nums[ind]=-1;
                }
            }
        }
        for (int i=1;i<=n;i++){
            if (nums[i-1]>=0){return i;}
        }
        return n+1;
    }
}
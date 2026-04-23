class Solution {
    public int removeDuplicates(int[] nums) {
        int res=1;
        int n=nums.length;
        int ind=1;
        for (int i=1;i<n;i++){
            if (nums[i]!=nums[i-1]){
                nums[ind]=nums[i];
                ind++;
                res++;}
        }   
        
        return res;
    }
}
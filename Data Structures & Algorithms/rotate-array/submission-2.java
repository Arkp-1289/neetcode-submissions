class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int[] temp = new int[n];
        for (int i=0;i<n;i++){
            temp[i]=nums[i];
        }
        
        for (int i=0;i<n;i++){
            int ind=(i+k)%n;
            nums[ind]=temp[i];
        }
        
    }
}
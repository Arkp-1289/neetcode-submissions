class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;

        k=(k%n);
        int rem = n-k;

        int left=0,right=rem-1;

        while (left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }

     int left1=n-k,right1=n-1;
     while (left1<right1){
         int temp2=nums[left1];
         nums[left1]=nums[right1];
         nums[right1]=temp2;
         left1++;
         right1--;
     }

     int l=0,r=n-1;
     while (l<r){
           int temp3=nums[l];
         nums[l]=nums[r];
         nums[r]=temp3;
         l++;
         r--;
     }
        
    }
}
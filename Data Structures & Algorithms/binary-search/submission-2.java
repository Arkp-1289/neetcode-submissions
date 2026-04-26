class Solution {


    public int solve(int l,int r,int target,int[] nums){
      
      while (l<=r){
        int mid=(l+r)/2;
        // System.out.println("mid: "+mid);
        if (nums[mid]==target){return mid;}
        if (nums[mid]<target){
            l=mid+1;
        } else{
            r=mid-1;
        }
      }
      return -1;


    }


    public int search(int[] nums, int target) {
        
        int n= nums.length;
        return solve(0,n-1,target,nums);
        
    }
}

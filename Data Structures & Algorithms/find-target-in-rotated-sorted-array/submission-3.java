class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int l=0,r=n-1;

        while (l<=r){
            
            int mid=(l+r)/2;
            System.out.println(mid);

            if (nums[mid]==target){return mid;}

            if (nums[mid]>=nums[l]){
                if ((nums[l]<=target && nums[mid]>=target)){
                r=mid-1;}
                else{
                    l=mid+1;
                }
            }
            else{
                if (nums[mid]<=target && nums[r]>=target){
                    l=mid+1;
                } else{
                    r=mid-1;
                }
            }

        }

        return -1;
        
    }
}

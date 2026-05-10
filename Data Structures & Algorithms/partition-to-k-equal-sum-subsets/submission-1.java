class Solution {

    public boolean solve(int ind,int val,int k,int[] arr,int[] nums){

        if (ind==nums.length){return true;}

        for (int i=0;i<k;i++){
            if (arr[i]+nums[ind]<=val){
                arr[i]+=nums[ind];
                if (solve(ind+1,val,k,arr,nums)){return true;}
                arr[i]-=nums[ind];
            }
        }
        return false;
    }



    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum=0;
        int n=nums.length;
        for (int i=0;i<n;i++){
            sum+=nums[i];
        }

        Arrays.sort(nums);
        int l=0,r=n-1;
        while (l<=r){
          int temp=nums[l];
          nums[l]=nums[r];
          nums[r]=temp;
          l++;
          r--;
        }

        if (sum%k!=0){return false;}
        int val=(sum/k);
        int[] arr= new int[k];
        return solve(0,val,k,arr,nums);
        
    }
}
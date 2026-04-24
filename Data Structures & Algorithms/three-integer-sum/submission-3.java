class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

       Arrays.sort(nums);   
       List<List<Integer>> res = new ArrayList<>();

       int n=nums.length;
        int i=0;
    //    for  ( i=0;i<n;i++){
    while (i<n){

        if (i>0 && nums[i]==nums[i-1]){i++;continue;}

        int left=i+1,right=n-1;
        while (left<right){
            int sum=nums[i]+nums[left]+nums[right];

            if (sum>0){
                right--;
            } else if (sum<0){
                left++;
            } else{
                List<Integer> temp = Arrays.asList(nums[i],nums[left],nums[right]);
                res.add(temp);
                left++;
                right--;
                while (left<right && nums[left]==nums[left-1]){
                    left++;
                }
            }

        }
        i++;

       }
       return res;
        
    }
}

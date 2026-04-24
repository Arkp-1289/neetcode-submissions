class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int n=nums.length;
        for (int i=0;i<n;i++){

            if (i>0 && nums[i]==nums[i-1]){continue;}

            for (int j=i+1;j<n;j++){

                if (j>i+1 && nums[j]==nums[j-1]){continue;}
                int left=j+1,right=n-1;

                while (left<right){
                    long sum=(long)nums[i]+nums[j]+nums[left]+nums[right];
                    if (sum>target){
                        right--;
                    } else if (sum<target){
                        left++;
                    } else{
                        System.out.println(i+" "+j+" "+left+" "+right);
                        System.out.println(sum);
                        res.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        left++;
                        right--;
                        while (left<right && nums[left]==nums[left-1]){
                            left++;
                        }
                    }
                }
            }

        }
        return res;
        
    }
}
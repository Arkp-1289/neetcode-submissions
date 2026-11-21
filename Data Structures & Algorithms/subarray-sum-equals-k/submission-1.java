class Solution {
    public int subarraySum(int[] nums, int k) {
        int n= nums.length;

        int[] pre_sum= new int[n];

        Map<Integer,Integer> mp = new HashMap<>();
        mp.put(0,1);

        int curr_sum=0,res=0;

        for (int i=0;i<n;i++){
            curr_sum+=nums[i];
            if (mp.get(curr_sum-k)!=null){
                res+=(mp.get(curr_sum-k));
            }
            mp.put(curr_sum,mp.getOrDefault(curr_sum,0)+1);
        }
        return res;
        
    }
}
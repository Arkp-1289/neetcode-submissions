class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        mp.put(0,1);
        int res=0;
        int n=nums.length;
        int sum=0;
        for (int i=0;i<n;i++){
            sum+=nums[i];
            if (mp.containsKey(sum-k)){res+=mp.get(sum-k);}
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
        return res;
    }
}
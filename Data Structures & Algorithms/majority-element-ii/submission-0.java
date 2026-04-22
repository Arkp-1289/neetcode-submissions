class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        int n=nums.length;
        for (int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        for (int i:mp.keySet()){
            if (mp.get(i)>(n/3)){res.add(i);}
        }
        return res;
    }
}
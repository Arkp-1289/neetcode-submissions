class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        k=Math.min(k,n-1);
        Map<Integer,Integer> mp = new HashMap<>();
        for (int i=0;i<k+1;i++){
            if (mp.containsKey(nums[i])){return true;}
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }

        for (int i=k+1;i<n;i++){
            int ind=i-(k+1);
            mp.put(nums[ind],mp.get(nums[ind])-1);
            if (mp.containsKey(nums[i]) && mp.get(nums[i])>0){return true;}
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        return false;
        
    }
}
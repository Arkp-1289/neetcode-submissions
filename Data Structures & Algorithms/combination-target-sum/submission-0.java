class Solution {

    public List<List<Integer>> solve(int ind,int n,int target,
                            int[] nums,List<Integer>l,List<List<Integer>> res){

        if (target<0 || ind==n){
            return res;
        }

        if (target==0){
            res.add(new ArrayList<>(l));
            return res;
        }

        l.add(nums[ind]);
        solve(ind,n,target-nums[ind],nums,l,res);
        l.remove(l.size()-1);
        solve(ind+1,n,target,nums,l,res);
        return res;
    }



    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        int n=nums.length;
        return solve(0,n,target,nums,l,res);
    }
}

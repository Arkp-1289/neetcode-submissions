class Solution {

    public List<List<Integer>> solve(int ind,int n,int[] nums,List<Integer> l,List<List<Integer>> res){

        if (ind==n){
            res.add(new ArrayList<>(l));
            return res;
        }


        l.add(nums[ind]);
        solve(ind+1,n,nums,l,res);
        l.remove(l.size()-1);
        solve(ind+1,n,nums,l,res);
        return res;
    }



    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> l= new ArrayList<>();
        int n=nums.length;


        return solve(0,n,nums,l,res);
        
    }
}

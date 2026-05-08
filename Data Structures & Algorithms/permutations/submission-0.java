class Solution {

    public List<List<Integer>> solve( int n ,int[] nums,int[] vis,List<Integer> l,List<List<Integer>> res){

        if (l.size()==n){
            res.add(new ArrayList<>(l));
            return res;
        }

        for (int i=0;i<n;i++){
            if (vis[i]==-1){
                l.add(nums[i]);
                vis[i]=1;
                solve(n,nums,vis,l,res);
                vis[i]=-1;
                l.remove(l.size()-1);
            }
            
        }
        return res;

    }



    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        List<Integer> l= new ArrayList<>();
        int n=nums.length;
        int[] vis = new int[n];
        Arrays.fill(vis,-1);
        return solve(n,nums,vis,l,res);
        
    }
}

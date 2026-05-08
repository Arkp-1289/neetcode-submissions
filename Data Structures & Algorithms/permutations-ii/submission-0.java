class Solution {


    public List<List<Integer>> solve(int n,int[] nums,int[] vis,List<Integer> l,List<List<Integer>> res){

        if (l.size()==n){
            // System.out.println(l);
            res.add(new ArrayList<>(l));
            return res;
        }
        int i=0;
        while (i<n){
            if (vis[i]==0){
                l.add(nums[i]);
                vis[i]=1;
                // System.out.print(i+" ");
                solve(n,nums,vis,l,res);
                vis[i]=0;
                l.remove(l.size()-1);
                i++;
                while (i>0 && i<n && nums[i]==nums[i-1]){i++;}
                
             } else{
             
             i++;}
             
            
        }
        return res;
    }



    public List<List<Integer>> permuteUnique(int[] nums) {
        int n=nums.length;
        int[] vis = new int[n];
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        return solve(n,nums,vis,l,res);
    }
}